package hu.noherczeg.necora.domain.ssa;

import hu.noherczeg.necora.domain.specialization.SpecializationOfPerson;

import java.io.Serializable;

public class SSAPaperAuthor implements Serializable {
    private static final long serialVersionUID = 2114816470858515574L;
    private Long id;
    private Integer order;
    private Integer activeSemesters;
    private SpecializationOfPerson specializationOfPerson;
    private SSAPaper ssaPaper;

    public SSAPaperAuthor() {
    }

    public SSAPaperAuthor(SSAPaper ssaPaper, SpecializationOfPerson specializationOfPerson, Integer activeSemesters, int order) {
        this.ssaPaper = ssaPaper;
        this.specializationOfPerson = specializationOfPerson;
        this.activeSemesters = activeSemesters;
        this.order = order;
    }

    public Long getId() {
        return id;
    }

    public Integer getOrder() {
        return order;
    }

    public Integer getActiveSemesters() {
        return activeSemesters;
    }

    public SpecializationOfPerson getSpecializationOfPerson() {
        return specializationOfPerson;
    }

    public SSAPaper getSsaPaper() {
        return ssaPaper;
    }

    public void setOrder(int order) {
        this.order = order;
    }

    public void setActiveSemesters(Integer activeSemesters) {
        this.activeSemesters = activeSemesters;
    }

    public void setSpecializationOfPerson(SpecializationOfPerson specializationOfPerson) {
        this.specializationOfPerson = specializationOfPerson;
    }

    public void setSsaPaper(SSAPaper ssaPaper) {
        this.ssaPaper = ssaPaper;
    }
}
