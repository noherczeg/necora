package hu.noherczeg.necora.domain.organization;

import hu.noherczeg.necora.domain.user.User;
import org.joda.time.DateTime;

import java.io.Serializable;

public class MemberOfOrganization implements Serializable {
    private static final long serialVersionUID = 2623969381183706676L;
    private Long id;
    private DateTime start;
    private DateTime end;
    private String comment;
    private User member;
    private Organization organization;

    public MemberOfOrganization() {
    }

    public MemberOfOrganization(User member, Organization organization, DateTime start, DateTime end, String comment) {
        this.member = member;
        this.organization = organization;
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

    public User getMember() {
        return member;
    }

    public Organization getOrganization() {
        return organization;
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

    public void setMember(User member) {
        this.member = member;
    }

    public void setOrganization(Organization organization) {
        this.organization = organization;
    }
}
