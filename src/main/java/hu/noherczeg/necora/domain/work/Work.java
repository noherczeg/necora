package hu.noherczeg.necora.domain.work;

import hu.noherczeg.necora.domain.tender.Tender;
import org.joda.time.DateTime;

import java.io.Serializable;
import java.util.LinkedHashSet;
import java.util.Set;

public class Work implements Serializable {
    private static final long serialVersionUID = 2863740939346830655L;
    private Long id;
    private String name;
    private DateTime date;
    private String description;
    private String mtmtId;
    private String comment;
    private TypeOfWork type;
    private Set<ParticipantInWork> participants;
    private Set<Tender> tenders;

    public Work() {
        this.participants = new LinkedHashSet<>();
        this.tenders = new LinkedHashSet<>();
    }

    public Work(String name, DateTime date, String description, TypeOfWork type, String mtmtId, String comment) {
        this.participants = new LinkedHashSet<>();
        this.tenders = new LinkedHashSet<>();
        this.name = name;
        this.date = date;
        this.description = description;
        this.type = type;
        this.mtmtId = mtmtId;
        this.comment = comment;
    }

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public DateTime getDate() {
        return date;
    }

    public String getDescription() {
        return description;
    }

    public String getMtmtId() {
        return mtmtId;
    }

    public String getComment() {
        return comment;
    }

    public TypeOfWork getType() {
        return type;
    }

    public Set<ParticipantInWork> getParticipants() {
        return participants;
    }

    public Set<Tender> getTenders() {
        return tenders;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setDate(DateTime date) {
        this.date = date;
    }

    public void set(String description) {
        this.description = description;
    }

    public void setMtmtId(String mtmtId) {
        this.mtmtId = mtmtId;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    public void setType(TypeOfWork type) {
        this.type = type;
    }
}
