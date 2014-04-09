package hu.noherczeg.necora.domain.organization;

import hu.noherczeg.necora.domain.country.Country;

import java.io.Serializable;
import java.util.LinkedHashSet;
import java.util.Set;

public class Organization implements Serializable {
    private static final long serialVersionUID = -656882988116965493L;
    private Long id;
    private String name;
    private String description;
    private Country country;
    private OrganizationRole role;
    private Set<MemberOfOrganization> members;

    public Organization() {
        this.members = new LinkedHashSet<>();
    }

    public Organization(String name, String description, Country country) {
        this.members = new LinkedHashSet<>();
        this.name = name;
        this.description = description;
        this.country = country;
    }

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public Country getCountry() {
        return country;
    }

    public OrganizationRole getRole() {
        return role;
    }

    public Set<MemberOfOrganization> getMembers() {
        return members;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setCountry(Country country) {
        this.country = country;
    }

    public void setRole(OrganizationRole role) {
        this.role = role;
    }
}
