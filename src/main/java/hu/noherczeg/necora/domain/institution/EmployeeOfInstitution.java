package hu.noherczeg.necora.domain.institution;

import hu.noherczeg.necora.domain.user.User;
import org.joda.time.DateTime;

import java.io.Serializable;

public class EmployeeOfInstitution implements Serializable {
    private static final long serialVersionUID = 6148664008425456873L;
    private Long id;
    private DateTime start;
    private DateTime end;
    private String comment;
    private Institution institution;
    private User user;

    public EmployeeOfInstitution() {
    }

    public EmployeeOfInstitution(DateTime start, DateTime end, String comment, Institution institution, User user) {
        this.start = start;
        this.end = end;
        this.comment = comment;
        this.institution = institution;
        this.user = user;
    }

    public Long getId() {
        return id;
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

    public Institution getInstitution() {
        return institution;
    }

    public User getUser() {
        return user;
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

    public void setInstitution(Institution institution) {
        this.institution = institution;
    }

    public void setUser(User user) {
        this.user = user;
    }
}
