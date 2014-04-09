package hu.noherczeg.necora.domain.organization;

import java.io.Serializable;
import java.util.LinkedHashSet;
import java.util.Set;

public class OrganizationRole implements Serializable {
    private static final long serialVersionUID = 3806109055860360525L;
    private Long id;
    private String name;
    private Set<Organization> organizations;

    public OrganizationRole() {
        this.organizations = new LinkedHashSet<>();
    }

    public OrganizationRole(String name) {
        this.organizations = new LinkedHashSet<>();
        this.name = name;
    }

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public Set<Organization> getOrganizations() {
        return organizations;
    }

    public void setName(String name) {
        this.name = name;
    }
}
