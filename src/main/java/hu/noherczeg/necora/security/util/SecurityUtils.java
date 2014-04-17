package hu.noherczeg.necora.security.util;

import org.springframework.security.core.Authentication;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.User;

import java.util.Collection;

public class SecurityUtils {

    public static Authentication getAuthentication() {
        if (SecurityContextHolder.getContext() != null) {
            return SecurityContextHolder.getContext().getAuthentication();
        }

        return null;
    }

    public static User getLoggedInUser() {
        Authentication aut = SecurityUtils.getAuthentication();
        if (aut != null && aut.isAuthenticated() && aut.getPrincipal() != null) {
            return (User) aut.getPrincipal();
        }
        return null;
    }

    public static String getLoggedInUserName() {
        if (getAuthentication() != null) {
            return getAuthentication().getName();
        }

        return null;
    }

    public static Collection<? extends GrantedAuthority> getAllUserAuthorities() {
        return getAuthentication().getAuthorities();
    }

    public static boolean userHasAuthority(String authority) {
        for (GrantedAuthority authorityItem: getAllUserAuthorities()) {
            if (authorityItem.getAuthority().toLowerCase().equals(authority.toLowerCase())) {
                return true;
            }
        }
        return false;
    }

    public static boolean userHasAnyAuthority(String[] authorities) {
        for (String authority: authorities) {
            if (getAllUserAuthorities().contains(authority))
                return true;
        }
        return false;
    }

}
