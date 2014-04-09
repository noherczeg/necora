package hu.noherczeg.necora.domain.country;

import hu.noherczeg.necora.domain.award.Award;
import hu.noherczeg.necora.domain.fieldtrip.FieldTrip;
import hu.noherczeg.necora.domain.institution.Institution;
import hu.noherczeg.necora.domain.organization.Organization;
import hu.noherczeg.necora.domain.tender.Tender;

import java.io.Serializable;
import java.util.LinkedHashSet;
import java.util.Set;

public class Country implements Serializable {
    private static final long serialVersionUID = -135612339487799880L;
    private Long id;
    private String name;
    private String code;
    private Set<Award> awards;
    private Set<Institution> institutions;
    private Set<Tender> tenders;
    private Set<Organization> organizations;
    private Set<FieldTrip> fieldTrips;

    public Country() {
        this.awards = new LinkedHashSet<>();
        this.institutions = new LinkedHashSet<>();
        this.tenders = new LinkedHashSet<>();
        this.organizations = new LinkedHashSet<>();
        this.fieldTrips = new LinkedHashSet<>();
    }

    public Country(String name, String code) {
        this.awards = new LinkedHashSet<>();
        this.institutions = new LinkedHashSet<>();
        this.tenders = new LinkedHashSet<>();
        this.organizations = new LinkedHashSet<>();
        this.fieldTrips = new LinkedHashSet<>();
        this.name = name;
        this.code = code;
    }

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getCode() {
        return code;
    }

    public Set<Award> getAwards() {
        return awards;
    }

    public Set<Institution> getInstitutions() {
        return institutions;
    }

    public Set<Tender> getTenders() {
        return tenders;
    }

    public Set<Organization> getOrganizations() {
        return organizations;
    }

    public Set<FieldTrip> getFieldTrips() {
        return fieldTrips;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setCode(String code) {
        this.code = code;
    }
}
