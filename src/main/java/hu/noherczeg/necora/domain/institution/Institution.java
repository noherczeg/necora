package hu.noherczeg.necora.domain.institution;

import hu.noherczeg.necora.domain.country.Country;

import java.io.Serializable;
import java.util.LinkedHashSet;
import java.util.Set;

public class Institution implements Serializable {
    private static final long serialVersionUID = 5630482198133378568L;
    private Long id;
    private String name;
    private String address;
    private String description;
    private Country country;
    private Set<EmployeeOfInstitution> employees;
    private Set<TenderOfInstitution> tenders;

    public Institution() {
        this.employees = new LinkedHashSet<>();
        this.tenders = new LinkedHashSet<>();
    }

    public Institution(String name, String address, String description, Country country) {
        this.employees = new LinkedHashSet<>();
        this.tenders = new LinkedHashSet<>();
        this.name = name;
        this.address = address;
        this.description = description;
        this.country = country;
    }

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }

    public String getDescription() {
        return description;
    }

    public Country getCountry() {
        return country;
    }

    public Set<EmployeeOfInstitution> getEmployees() {
        return employees;
    }

    public Set<TenderOfInstitution> getTenders() {
        return tenders;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setCountry(Country country) {
        this.country = country;
    }
}
