package hu.noherczeg.necora.domain.user;

import hu.noherczeg.necora.security.authority.Authority;
import hu.noherczeg.necora.security.authority.RoleConstants;
import org.springframework.beans.BeanUtils;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

class UserServiceImpl implements UserService {
	
	private UserRepository userRepository;

    public UserServiceImpl(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @PreAuthorize("hasRole('ROLE_ADMIN')")
    @Transactional(readOnly = true)
    //@Cacheable(value="users")
	public List<User> listUsers() {
		return userRepository.findAll();
	}

    @Transactional(readOnly = false)
	public void addUser(User newUser) {
		User user = new User();
		BeanUtils.copyProperties(newUser, user);
        Authority auth = new Authority(RoleConstants.ROLE_USER);
		if(!this.isAuthorityPresent(user, auth)) {
            user.getAuthorities().add(auth);
        }
		userRepository.save(user);
	}

    @Transactional(readOnly = false)
	public void deleteUser(User userToDelete) {
		User user = new User();
		BeanUtils.copyProperties(userToDelete, user);
		userRepository.delete(user);
	}

    @Override
    @Transactional(readOnly = true)
    public User findById(Long id) {
        User user = userRepository.findByIdWithAll(id);
        return user;
    }

    private boolean isAuthorityPresent(User user, GrantedAuthority auth) {
        boolean result = false;
        for (GrantedAuthority authority: user.getAuthorities()) {
            if (auth.getAuthority().toLowerCase().equals(authority.getAuthority().toLowerCase())) {
                result = true;
                break;
            }
        }
        return result;
    }
}
