package hu.noherczeg.necora.security.authentication;

import hu.noherczeg.necora.security.authority.RoleConstants;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.acls.domain.BasePermission;
import org.springframework.security.acls.domain.ObjectIdentityImpl;
import org.springframework.security.acls.domain.PrincipalSid;
import org.springframework.security.acls.model.*;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.io.Serializable;
import java.util.Arrays;
import java.util.List;

/**
 * @author thiagoandrade6
 * @author noherczeg
 * @source https://github.com/thiagoandrade6/security-acl/blob/master/src/main/java/com/security/service/AclHelpService.java
 */

@Transactional
public class AclHelpService {
	private static final Logger LOGGER = LoggerFactory.getLogger(AclHelpService.class);
	private MutableAclService aclService;

    public AclHelpService(MutableAclService aclService) {
        this.aclService = aclService;
    }

    public <T, E extends Serializable> void addSinglePermission(Class<T> clazz, E identifier, UserDetails user, Permission permission) {
		setPermission(clazz, identifier, user, permission);
	}
	
	public <T, E extends Serializable> void addListPermission(Class<T> clazz, List<E> identifiers, UserDetails user, Permission permission) {
		for (Serializable identifier : identifiers) {
			setPermission(clazz, identifier, user, permission);
		}
	}
	
	private <T> void setPermission(Class<T> clazz, Serializable identifier, UserDetails user, Permission permission) {
		ObjectIdentity identity = new ObjectIdentityImpl(clazz.getCanonicalName(), identifier);
		Sid sid = new PrincipalSid(user.getUsername());
		Permission p;
		
		if(user.getAuthorities().contains(new SimpleGrantedAuthority(RoleConstants.ROLE_ADMIN))) {
			p = BasePermission.ADMINISTRATION;
		} else {
			p = permission;
		}
		
		MutableAcl acl = isNewAcl(identity);
		isGrantedForUser(permission, sid, p, acl);
		aclService.updateAcl(acl);
	}
	
	public <T> void removePermission(Class<T> clazz, Serializable identifier, UserDetails user, Permission permission) {
		
		ObjectIdentity identity = new ObjectIdentityImpl(clazz.getCanonicalName(), identifier);
		MutableAcl acl = (MutableAcl) aclService.readAclById(identity);
		
		Sid sid = new PrincipalSid(user.getUsername());
		
		AccessControlEntry[] entries = acl.getEntries().toArray(new AccessControlEntry[acl.getEntries().size()]);
		
		for (int i = 0; i < acl.getEntries().size(); i++) {
			if (entries[i].getSid().equals(sid) && entries[i].getPermission().equals(permission)) {
				acl.deleteAce(i);
			}
		}
		
		aclService.updateAcl(acl);
	}
	
	public <T> boolean isPermissionGrantedForUser(Class<T> clazz, Serializable identifier, UserDetails user, Permission permission) {
		ObjectIdentity identity = new ObjectIdentityImpl(clazz.getCanonicalName(), identifier);
		MutableAcl acl = (MutableAcl) aclService.readAclById(identity);
		Sid sid = new PrincipalSid(user.getUsername());
		boolean isGranted = false;
		
		try {
			isGranted = acl.isGranted(Arrays.asList(permission), Arrays.asList(sid), false);
		} catch (NotFoundException e) {
			LOGGER.info("User doesn't have the required authority");
		} catch (UnloadedSidException e) {
			e.printStackTrace();
		}
		
		return isGranted;
	}
	
	private MutableAcl isNewAcl(ObjectIdentity identity) {
		MutableAcl acl;
		try {
			acl = (MutableAcl) aclService.readAclById(identity);
		} catch (NotFoundException e) {
			acl = aclService.createAcl(identity);
		}
		return acl;
	}

	private void isGrantedForUser(Permission permission, Sid sid, Permission p, MutableAcl acl) {
		try {
			acl.isGranted(Arrays.asList(permission), Arrays.asList(sid), false);
		} catch (NotFoundException e) {
			acl.insertAce(acl.getEntries().size(), p, sid, true);
		}
	}
}