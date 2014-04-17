package hu.noherczeg.necora.web.user.resources.full;

import hu.noherczeg.necora.web.language.resources.basic.DegreeOfLanguageSkillBasicResource;
import hu.noherczeg.necora.web.language.resources.basic.LanguageBasicResource;
import org.joda.time.DateTime;
import org.springframework.hateoas.ResourceSupport;

public class LanguageSkillBasicForUser extends ResourceSupport {

    private int id;
    private String certificate;
    private DateTime date;
    private String comment;
    private LanguageBasicResource language;
    private DegreeOfLanguageSkillBasicResource degreeOfLanguageSkill;

    public LanguageSkillBasicForUser() {
    }

    public LanguageSkillBasicForUser(int id, String certificate, DateTime date, String comment, LanguageBasicResource language, DegreeOfLanguageSkillBasicResource degreeOfLanguageSkill) {
        this.id = id;
        this.certificate = certificate;
        this.date = date;
        this.comment = comment;
        this.language = language;
        this.degreeOfLanguageSkill = degreeOfLanguageSkill;
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

    public LanguageBasicResource getLanguage() {
        return language;
    }

    public DegreeOfLanguageSkillBasicResource getDegreeOfLanguageSkill() {
        return degreeOfLanguageSkill;
    }
}
