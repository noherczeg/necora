package hu.noherczeg.necora.domain.tender;

import hu.noherczeg.necora.domain.country.Country;
import hu.noherczeg.necora.domain.event.Event;
import hu.noherczeg.necora.domain.field.FieldOfScience;
import hu.noherczeg.necora.domain.income.Income;
import hu.noherczeg.necora.domain.institution.TenderOfInstitution;
import hu.noherczeg.necora.domain.publication.Publication;
import hu.noherczeg.necora.domain.work.Work;
import org.joda.time.DateTime;

import java.io.Serializable;
import java.util.LinkedHashSet;
import java.util.Set;

public class Tender implements Serializable {
    private static final long serialVersionUID = 3589661503734862901L;
    private Long id;
    private String title;
    private String construction;
    private Integer leading;
    private Double amountRequested;
    private Double amountOfOwnFunds;
    private DateTime submissionDate;
    private DateTime start;
    private DateTime end;
    private String description;
    private Set<Income> incomes;
    private Set<TenderOfInstitution> institutions;
    private Country country;
    private TenderStatus status;
    private TenderType type;
    private Set<Work> works;
    private Set<Event> events;
    private Set<Publication> publications;
    private Set<FieldOfScience> fieldOfSciences;
    private Set<Applicant> applicants;

    public Tender() {
        this.works = new LinkedHashSet<>();
        this.events = new LinkedHashSet<>();
        this.publications = new LinkedHashSet<>();
        this.fieldOfSciences = new LinkedHashSet<>();
        this.applicants = new LinkedHashSet<>();
    }

    public Tender(String title, String construction, Integer leading, Double amountRequested, Double amountOfOwnFunds, DateTime submissionDate, DateTime start, DateTime end, String description, Country country, TenderStatus status, TenderType type) {
        this.works = new LinkedHashSet<>();
        this.events = new LinkedHashSet<>();
        this.publications = new LinkedHashSet<>();
        this.fieldOfSciences = new LinkedHashSet<>();
        this.applicants = new LinkedHashSet<>();
        this.title = title;
        this.construction = construction;
        this.leading = leading;
        this.amountRequested = amountRequested;
        this.amountOfOwnFunds = amountOfOwnFunds;
        this.submissionDate = submissionDate;
        this.start = start;
        this.end = end;
        this.description = description;
        this.country = country;
        this.status = status;
        this.type = type;
    }

    public Long getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public String getConstruction() {
        return construction;
    }

    public Boolean isLeading() {
        return leading == 1;
    }

    public Double getAmountRequested() {
        return amountRequested;
    }

    public Double getAmountOfOwnFunds() {
        return amountOfOwnFunds;
    }

    public DateTime getSubmissionDate() {
        return submissionDate;
    }

    public DateTime getStart() {
        return start;
    }

    public DateTime getEnd() {
        return end;
    }

    public String getDescription() {
        return description;
    }

    public Set<Income> getIncomes() {
        return incomes;
    }

    public Set<TenderOfInstitution> getInstitutions() {
        return institutions;
    }

    public Country getCountry() {
        return country;
    }

    public TenderStatus getStatus() {
        return status;
    }

    public TenderType getType() {
        return type;
    }

    public Set<Work> getWorks() {
        return works;
    }

    public Set<Event> getEvents() {
        return events;
    }

    public Set<Publication> getPublications() {
        return publications;
    }

    public Set<FieldOfScience> getFieldOfSciences() {
        return fieldOfSciences;
    }

    public Set<Applicant> getApplicants() {
        return applicants;
    }

    public void ListTitle(String title) {
        this.title = title;
    }

    public void ListConstruction(String construction) {
        this.construction = construction;
    }

    public void setLeading(Boolean leading) {
        this.leading = leading ? 1 : 0;
    }

    public void setAmountRequested(Double amountRequested) {
        this.amountRequested = amountRequested;
    }

    public void setAmountOfOwnFunds(Double amountOfOwnFunds) {
        this.amountOfOwnFunds = amountOfOwnFunds;
    }

    public void setSubmissionDate(DateTime submissionDate) {
        this.submissionDate = submissionDate;
    }

    public void setStart(DateTime start) {
        this.start = start;
    }

    public void setEnd(DateTime end) {
        this.end = end;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setCountry(Country country) {
        this.country = country;
    }

    public void setStatus(TenderStatus status) {
        this.status = status;
    }

    public void setType(TenderType type) {
        this.type = type;
    }
}
