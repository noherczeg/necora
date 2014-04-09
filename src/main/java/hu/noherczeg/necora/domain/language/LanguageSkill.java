package hu.noherczeg.necora.domain.language;

import hu.noherczeg.necora.domain.user.User;
import org.joda.time.DateTime;

import java.io.Serializable;

public class LanguageSkill implements Serializable {
    private static final long serialVersionUID = -8184492591654261417L;
    private int id;
    private String certificate;
    private DateTime date;
    private String comment;
    private Language language;
    private DegreeOfLanguageSkill degreeOfLanguageSkill;
    private User person;

    public LanguageSkill() {
    }

    public LanguageSkill(String certificate, DateTime date, User person, Language language, String comment) {
        this.certificate = certificate;
        this.date = date;
        this.person = person;
        this.language = language;
        this.comment = comment;
    }

    public int getId() {
        return id;
    }

    public String getCertificate() {
        return certificate;
    }

    public DateTime getDate() {
        return date;
    }

    public String getComment() {
        return comment;
    }

    public Language getLanguage() {
        return language;
    }

    public DegreeOfLanguageSkill getDegreeOfLanguageSkill() {
        return degreeOfLanguageSkill;
    }

    public User getPerson() {
        return person;
    }

    public void setCertificate(String certificate) {
        this.certificate = certificate;
    }

    public void setDate(DateTime date) {
        this.date = date;
    }

    public void setPerson(User person) {
        this.person = person;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    public void setLanguage(Language language) {
        this.language = language;
    }
}
