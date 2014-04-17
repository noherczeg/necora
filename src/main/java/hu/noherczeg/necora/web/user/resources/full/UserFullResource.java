package hu.noherczeg.necora.web.user.resources.full;

import hu.noherczeg.necora.domain.award.Award;
import hu.noherczeg.necora.domain.department.EmployeeOfDepartment;
import hu.noherczeg.necora.domain.event.Participant;
import hu.noherczeg.necora.domain.fieldtrip.FieldTrip;
import hu.noherczeg.necora.domain.institution.EmployeeOfInstitution;
import hu.noherczeg.necora.domain.organization.MemberOfOrganization;
import hu.noherczeg.necora.domain.publication.Author;
import hu.noherczeg.necora.domain.specialization.SpecializationOfPerson;
import hu.noherczeg.necora.domain.ssa.SSAPaperJudge;
import hu.noherczeg.necora.domain.tender.Applicant;
import hu.noherczeg.necora.domain.user.PersonSupervisesDegree;
import hu.noherczeg.necora.domain.user.PersonSupervisesSSAPaper;
import hu.noherczeg.necora.domain.user.PersonsDegree;
import hu.noherczeg.necora.domain.work.ParticipantInWork;
import org.springframework.hateoas.ResourceSupport;

import java.util.LinkedHashSet;
import java.util.Set;

public class UserFullResource extends ResourceSupport {

    private Long id;
    private String email;
    private boolean enabled;
    private String title;
    private String lastName;
    private String firstName;
    private String ehaCode;
    private String omId;
    private String comment;
    private Set<ParticipantInWork> works;
    private Set<Award> awards;
    private Set<Participant> participantInEvents;
    private Set<EmployeeOfInstitution> employedByInstitutions;
    private Set<LanguageSkillBasicForUser> languageSkills;
    private Set<Applicant> applicantInTenders;
    private Set<Author> authorOfPublications;
    private Set<PersonsDegree> degrees;
    private Set<PersonSupervisesDegree> supervisesDegrees;
    private Set<PersonSupervisesSSAPaper> superviseSSAPapers;
    private Set<SpecializationOfPerson> specializations;
    private Set<MemberOfOrganization> memberOfOrganizations;
    private Set<EmployeeOfDepartment> employedByDepartments;
    private Set<FieldTrip> fieldTrips;
    private Set<SSAPaperJudge> judgesSSAPapers;

    public UserFullResource() {
        this.works = new LinkedHashSet<>();
        this.authorOfPublications = new LinkedHashSet<>();
        this.awards = new LinkedHashSet<>();
        this.participantInEvents = new LinkedHashSet<>();
        this.employedByInstitutions = new LinkedHashSet<>();
        this.languageSkills = new LinkedHashSet<>();
        this.applicantInTenders = new LinkedHashSet<>();
        this.degrees = new LinkedHashSet<>();
        this.supervisesDegrees = new LinkedHashSet<>();
        this.superviseSSAPapers = new LinkedHashSet<>();
        this.specializations = new LinkedHashSet<>();
        this.memberOfOrganizations = new LinkedHashSet<>();
        this.employedByDepartments = new LinkedHashSet<>();
        this.fieldTrips = new LinkedHashSet<>();
        this.judgesSSAPapers = new LinkedHashSet<>();
    }

    public UserFullResource(Long id, String email, String title, String lastName, String firstName, String ehaCode) {
        this.id = id;
        this.email = email;
        this.title = title;
        this.lastName = lastName;
        this.firstName = firstName;
        this.ehaCode = ehaCode;
        this.works = new LinkedHashSet<>();
        this.awards = new LinkedHashSet<>();
        this.authorOfPublications = new LinkedHashSet<>();
        this.participantInEvents = new LinkedHashSet<>();
        this.employedByInstitutions = new LinkedHashSet<>();
        this.languageSkills = new LinkedHashSet<>();
        this.applicantInTenders = new LinkedHashSet<>();
        this.degrees = new LinkedHashSet<>();
        this.supervisesDegrees = new LinkedHashSet<>();
        this.superviseSSAPapers = new LinkedHashSet<>();
        this.specializations = new LinkedHashSet<>();
        this.memberOfOrganizations = new LinkedHashSet<>();
        this.employedByDepartments = new LinkedHashSet<>();
        this.fieldTrips = new LinkedHashSet<>();
        this.judgesSSAPapers = new LinkedHashSet<>();
    }

    public String getEmail() {
        return email;
    }

    public boolean isEnabled() {
        return enabled;
    }

    public String getTitle() {
        return title;
    }

    public String getLastName() {
        return lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getEhaCode() {
        return ehaCode;
    }

    public String getOmId() {
        return omId;
    }

    public String getComment() {
        return comment;
    }

    public Set<ParticipantInWork> getWorks() {
        return works;
    }

    public Set<Award> getAwards() {
        return awards;
    }

    public Set<Participant> getParticipantInEvents() {
        return participantInEvents;
    }

    public Set<EmployeeOfInstitution> getEmployedByInstitutions() {
        return employedByInstitutions;
    }

    public Set<LanguageSkillBasicForUser> getLanguageSkills() {
        return languageSkills;
    }

    public Set<Applicant> getApplicantInTenders() {
        return applicantInTenders;
    }

    public Set<Author> getAuthorOfPublications() {
        return authorOfPublications;
    }

    public Set<PersonsDegree> getDegrees() {
        return degrees;
    }

    public Set<PersonSupervisesDegree> getSupervisesDegrees() {
        return supervisesDegrees;
    }

    public Set<PersonSupervisesSSAPaper> getSuperviseSSAPapers() {
        return superviseSSAPapers;
    }

    public Set<SpecializationOfPerson> getSpecializations() {
        return specializations;
    }

    public Set<MemberOfOrganization> getMemberOfOrganizations() {
        return memberOfOrganizations;
    }

    public Set<EmployeeOfDepartment> getEmployedByDepartments() {
        return employedByDepartments;
    }

    public Set<FieldTrip> getFieldTrips() {
        return fieldTrips;
    }

    public Set<SSAPaperJudge> getJudgesSSAPapers() {
        return judgesSSAPapers;
    }

    public void setEnabled(boolean enabled) {
        this.enabled = enabled;
    }

    public void setOmId(String omId) {
        this.omId = omId;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }
}
