package hu.noherczeg.necora.domain.tender;

import hu.noherczeg.necora.domain.user.User;

import java.io.Serializable;

public class Applicant implements Serializable {
    private static final long serialVersionUID = 4687459364783657724L;
    private Long id;
    private String comment;
    private Tender tender;
    private RoleInTender role;
    private User applicant;

    public Applicant() {
    }

    public Applicant(Tender tender, User applicant, RoleInTender role, String comment) {
        this.tender = tender;
        this.applicant = applicant;
        this.role = role;
        this.comment = comment;
    }

    public Long getId() {
        return id;
    }

    public String getComment() {
        return comment;
    }

    public Tender getTender() {
        return tender;
    }

    public RoleInTender getRole() {
        return role;
    }

    public User getApplicant() {
        return applicant;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    public void setTender(Tender tender) {
        this.tender = tender;
    }

    public void setRole(RoleInTender role) {
        this.role = role;
    }

    public void setApplicant(User applicant) {
        this.applicant = applicant;
    }
}
