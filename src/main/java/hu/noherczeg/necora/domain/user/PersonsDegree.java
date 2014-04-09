package hu.noherczeg.necora.domain.user;

import hu.noherczeg.necora.domain.field.FieldOfScience;
import org.joda.time.DateTime;

import java.io.Serializable;
import java.util.LinkedHashSet;
import java.util.Set;

public class PersonsDegree implements Serializable {
    private static final long serialVersionUID = 6270772101426754623L;
    private Long id;
    private String titleOfPaper;
    private DateTime date;
    private String institution;
    private String comment;
    private Degree degree;
    private User person;
    private FieldOfScience fieldOfScience;
    private Set<PersonSupervisesDegree> supervisors;

    public PersonsDegree() {
        this.supervisors = new LinkedHashSet<>();
    }

    public PersonsDegree(String titleOfPaper, DateTime date, Degree degree, User person, String institution, String comment, FieldOfScience fieldOfScience) {
        this.supervisors = new LinkedHashSet<>();
        this.titleOfPaper = titleOfPaper;
        this.date = date;
        this.degree = degree;
        this.person = person;
        this.institution = institution;
        this.comment = comment;
        this.fieldOfScience = fieldOfScience;
    }

    public Long getId() {
        return id;
    }

    public String getTitleOfPaper() {
        return titleOfPaper;
    }

    public DateTime getDate() {
        return date;
    }

    public String getInstitution() {
        return institution;
    }

    public String getComment() {
        return comment;
    }

    public Degree getDegree() {
        return degree;
    }

    public User getPerson() {
        return person;
    }

    public FieldOfScience getFieldOfScience() {
        return fieldOfScience;
    }

    public Set<PersonSupervisesDegree> getSupervisors() {
        return supervisors;
    }

    public void setTitleOfPaper(String titleOfPaper) {
        this.titleOfPaper = titleOfPaper;
    }

    public void setDate(DateTime date) {
        this.date = date;
    }

    public void setInstitution(String institution) {
        this.institution = institution;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    public void setDegree(Degree degree) {
        this.degree = degree;
    }

    public void setPerson(User person) {
        this.person = person;
    }

    public void setFieldOfScience(FieldOfScience fieldOfScience) {
        this.fieldOfScience = fieldOfScience;
    }
}
