package hu.noherczeg.necora.domain.department;

import hu.noherczeg.necora.domain.user.User;
import org.joda.time.DateTime;

import java.io.Serializable;

public class EmployeeOfDepartment implements Serializable {
    private static final long serialVersionUID = -1745542701533115500L;
    private Long id;
    private DateTime start;
    private DateTime end;
    private String comment;
    private User employee;
    private Department department;

    public EmployeeOfDepartment() {
    }

    public EmployeeOfDepartment(User employee, Department department, DateTime start, DateTime end, String comment) {
        this.employee = employee;
        this.department = department;
        this.start = start;
        this.end = end;
        this.comment = comment;
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

    public User getEmployee() {
        return employee;
    }

    public Department getDepartment() {
        return department;
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
}
