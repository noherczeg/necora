package hu.noherczeg.necora.domain.ssa;

import hu.noherczeg.necora.domain.event.Event;
import hu.noherczeg.necora.domain.user.PersonSupervisesSSAPaper;

import java.io.Serializable;
import java.util.LinkedHashSet;
import java.util.Set;

public class SSAPaper implements Serializable {
    private static final long serialVersionUID = -4535757610074892285L;
    private Long id;
    private String title;
    private Integer facultyScore;
    private String facultyResult;
    private Integer proposedForNCSSA;
    private String ncssaResult;
    private String resume;
    private String comment;
    private Event facultyEvent;
    private Event ncssaEvent;
    private SSAPaperSection facultySSASection;
    private SSAPaperSection ncssaSection;
    private SSAPaperDepartment ncssaDepartment;
    private Set<SSAPaperJudge> judges;
    private Set<SSAPaperAuthor> authors;
    private Set<PersonSupervisesSSAPaper> supervisors;

    public SSAPaper() {
        this.judges = new LinkedHashSet<>();
        this.authors = new LinkedHashSet<>();
    }

    public SSAPaper(String title, Integer facultyScore, Integer proposedForNCSSA, String resume, Event facultyEvent, SSAPaperSection facultySSASection, String comment) {
        this.judges = new LinkedHashSet<>();
        this.authors = new LinkedHashSet<>();
        this.title = title;
        this.facultyScore = facultyScore;
        this.proposedForNCSSA = proposedForNCSSA;
        this.resume = resume;
        this.facultyEvent = facultyEvent;
        this.facultySSASection = facultySSASection;
        this.comment = comment;
    }

    public Long getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public Integer getFacultyScore() {
        return facultyScore;
    }

    public String getFacultyResult() {
        return facultyResult;
    }

    public Boolean isProposedForNCSSA() {
        return proposedForNCSSA == 1;
    }

    public String getNcssaResult() {
        return ncssaResult;
    }

    public String getResume() {
        return resume;
    }

    public String getComment() {
        return comment;
    }

    public Event getFacultyEvent() {
        return facultyEvent;
    }

    public Event getNcssaEvent() {
        return ncssaEvent;
    }

    public SSAPaperSection getFacultySSASection() {
        return facultySSASection;
    }

    public SSAPaperSection getNcssaSection() {
        return ncssaSection;
    }

    public SSAPaperDepartment getNcssaDepartment() {
        return ncssaDepartment;
    }

    public Set<SSAPaperJudge> getJudges() {
        return judges;
    }

    public Set<SSAPaperAuthor> getAuthors() {
        return authors;
    }

    public Set<PersonSupervisesSSAPaper> getSupervisors() {
        return supervisors;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setFacultyScore(Integer facultyScore) {
        this.facultyScore = facultyScore;
    }

    public void setFacultyResult(String facultyResult) {
        this.facultyResult = facultyResult;
    }

    public void setProposedForNCSSA(Boolean proposedForNCSSA) {
        this.proposedForNCSSA = (proposedForNCSSA) ? 1 : 0;
    }

    public void setNcssaResult(String ncssaResult) {
        this.ncssaResult = ncssaResult;
    }

    public void setResume(String resume) {
        this.resume = resume;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    public void setFacultyEvent(Event facultyEvent) {
        this.facultyEvent = facultyEvent;
    }

    public void setNcssaEvent(Event ncssaEvent) {
        this.ncssaEvent = ncssaEvent;
    }

    public void setFacultySSASection(SSAPaperSection facultySSASection) {
        this.facultySSASection = facultySSASection;
    }

    public void setNcssaSection(SSAPaperSection ncssaSection) {
        this.ncssaSection = ncssaSection;
    }

    public void setNcssaDepartment(SSAPaperDepartment ncssaDepartment) {
        this.ncssaDepartment = ncssaDepartment;
    }
}
