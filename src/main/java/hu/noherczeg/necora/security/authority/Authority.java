package hu.noherczeg.necora.security.authority;

import hu.noherczeg.necora.domain.user.User;
import org.springframework.security.core.GrantedAuthority;

import java.io.Serializable;
import java.util.LinkedHashSet;
import java.util.Set;

public class Authority implements GrantedAuthority, Serializable {
    private static final long serialVersionUID = 2882316790620281151L;
    private Long id;
    private String authority;
    private Set<User> users;

    public Authority() {
        this.users = new LinkedHashSet<>();
    }

    public Authority(String authority) {
        this.users = new LinkedHashSet<>();
        this.authority = authority;
    }

    public Long getId() {
        return this.id;
    }

    public Set<User> getUsers() {
        return this.users;
    }

    @Override
    public String getAuthority() {
        return this.authority;
    }

    public void setAuthority(String authority) {
        this.authority = authority;
    }
}
