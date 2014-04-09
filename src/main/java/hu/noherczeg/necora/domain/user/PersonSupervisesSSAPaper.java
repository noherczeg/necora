package hu.noherczeg.necora.domain.user;

import hu.noherczeg.necora.domain.ssa.SSAPaper;

import java.io.Serializable;

public class PersonSupervisesSSAPaper implements Serializable {
    private static final long serialVersionUID = -5166984494099720482L;
    private Long id;
    private String comment;
    private User supervisor;
    private SSAPaper ssaPaper;

    public PersonSupervisesSSAPaper() {
    }

    public PersonSupervisesSSAPaper(String comment, User supervisor, SSAPaper ssaPaper) {
        this.comment = comment;
        this.supervisor = supervisor;
        this.ssaPaper = ssaPaper;
    }

    public Long getId() {
        return id;
    }

    public String getComment() {
        return comment;
    }

    public User getSupervisor() {
        return supervisor;
    }

    public SSAPaper getSsaPaper() {
        return ssaPaper;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    public void setSupervisor(User supervisor) {
        this.supervisor = supervisor;
    }

    public void setSsaPaper(SSAPaper ssaPaper) {
        this.ssaPaper = ssaPaper;
    }
}
