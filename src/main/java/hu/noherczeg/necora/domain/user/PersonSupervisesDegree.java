package hu.noherczeg.necora.domain.user;

import org.joda.time.DateTime;

import java.io.Serializable;

public class PersonSupervisesDegree implements Serializable {
    private static final long serialVersionUID = 4982624314832305838L;
    private Long id;
    private int order;
    private DateTime start;
    private DateTime end;
    private String comment;
    private PersonsDegree personsDegree;
    private User supervisor;

    public PersonSupervisesDegree() {
    }

    public PersonSupervisesDegree(PersonsDegree personsDegree, User supervisor, DateTime start, DateTime end, int order, String comment) {
        this.personsDegree = personsDegree;
        this.supervisor = supervisor;
        this.start = start;
        this.end = end;
        this.order = order;
        this.comment = comment;
    }

    public Long getId() {
        return id;
    }

    public int getOrder() {
        return order;
    }

    public DateTime getStart() {
        return start;
    }

    public DateTime getEnd() {
        return end;
    }

    public String getComment() {
        return comment;
    }

    public PersonsDegree getPersonsDegree() {
        return personsDegree;
    }

    public User getSupervisor() {
        return supervisor;
    }

    public void setOrder(int order) {
        this.order = order;
    }

    public void setStart(DateTime start) {
        this.start = start;
    }

    public void setEnd(DateTime end) {
        this.end = end;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    public void setPersonsDegree(PersonsDegree personsDegree) {
        this.personsDegree = personsDegree;
    }

    public void setSupervisor(User supervisor) {
        this.supervisor = supervisor;
    }
}
