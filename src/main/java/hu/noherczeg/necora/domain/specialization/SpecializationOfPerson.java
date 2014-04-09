package hu.noherczeg.necora.domain.specialization;

import hu.noherczeg.necora.domain.ssa.SSAPaperAuthor;
import hu.noherczeg.necora.domain.user.User;
import org.joda.time.DateTime;

import java.io.Serializable;
import java.util.LinkedHashSet;
import java.util.Set;

public class SpecializationOfPerson implements Serializable {
    private static final long serialVersionUID = 3100474192225192702L;
    private Long id;
    private DateTime start;
    private DateTime end;
    private String comment;
    private Specialization specialization;
    private User person;
    private Set<SSAPaperAuthor> ssaPapers;  // TODO mocskosul nem jo igy, javitani ASAP!!!!!!! (user-re kell kotni, nem spec.-re)

    public SpecializationOfPerson() {
        this.ssaPapers = new LinkedHashSet<>();
    }

    public SpecializationOfPerson(Specialization specialization, User person, DateTime start, DateTime end, String comment) {
        this.ssaPapers = new LinkedHashSet<>();
        this.specialization = specialization;
        this.person = person;
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

    public Specialization getSpecialization() {
        return specialization;
    }

    public User getPerson() {
        return person;
    }

    public Set<SSAPaperAuthor> getSsaPapers() {
        return ssaPapers;
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

    public void setSpecialization(Specialization specialization) {
        this.specialization = specialization;
    }

    public void setPerson(User person) {
        this.person = person;
    }
}
