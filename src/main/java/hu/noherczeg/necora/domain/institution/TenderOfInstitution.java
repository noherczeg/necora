package hu.noherczeg.necora.domain.institution;

import hu.noherczeg.necora.domain.tender.Tender;

import java.io.Serializable;

public class TenderOfInstitution implements Serializable {
    private static final long serialVersionUID = 6627839731804077714L;
    private Long id;
    private Integer responsible;
    private String comment;
    private Institution institution;
    private Tender tender;

    public TenderOfInstitution() {
    }

    public TenderOfInstitution(Institution institution, Tender tender, Integer responsible, String comment) {
        this.institution = institution;
        this.tender = tender;
        this.responsible = responsible;
        this.comment = comment;
    }

    public Long getId() {
        return id;
    }

    public Boolean isResponsible() {
        return responsible == 1;
    }

    public String getComment() {
        return comment;
    }

    public Institution getInstitution() {
        return institution;
    }

    public Tender getTender() {
        return tender;
    }

    public void setResponsible(Boolean responsible) {
        this.responsible = (responsible) ? 1 : 0;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    public void setInstitution(Institution institution) {
        this.institution = institution;
    }

    public void setTender(Tender tender) {
        this.tender = tender;
    }
}
