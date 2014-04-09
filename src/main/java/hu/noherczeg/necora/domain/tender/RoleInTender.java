package hu.noherczeg.necora.domain.tender;

import java.io.Serializable;
import java.util.LinkedHashSet;
import java.util.Set;

public class RoleInTender implements Serializable {
    private static final long serialVersionUID = -2200468419997340921L;
    private Long id;
    private String name;
    private Set<Applicant> applicants;

    public RoleInTender() {
        this.applicants = new LinkedHashSet<>();
    }

    public RoleInTender(String name) {
        this.applicants = new LinkedHashSet<>();
        this.name = name;
    }

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public Set<Applicant> getApplicants() {
        return applicants;
    }

    public void setName(String name) {
        this.name = name;
    }
}
