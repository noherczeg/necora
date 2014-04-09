package hu.noherczeg.necora.domain.institute;

import hu.noherczeg.necora.domain.department.Department;
import org.joda.time.DateTime;

import java.io.Serializable;

public class DepartmentOfInstitute implements Serializable {
    private static final long serialVersionUID = -7601543684517956673L;
    private Long id;
    private DateTime start;
    private DateTime end;
    private Institute institute;
    private Department department;

    public DepartmentOfInstitute() {
    }

    public DepartmentOfInstitute(Institute institute, Department department, DateTime start, DateTime end) {
        this.institute = institute;
        this.department = department;
        this.start = start;
        this.end = end;
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

    public Institute getInstitute() {
        return institute;
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

    public void setInstitute(Institute institute) {
        this.institute = institute;
    }

    public void setDepartment(Department department) {
        this.department = department;
    }
}
