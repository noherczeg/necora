package hu.noherczeg.necora.domain.user;

import hu.noherczeg.necora.domain.award.Award;
import hu.noherczeg.necora.domain.department.EmployeeOfDepartment;
import hu.noherczeg.necora.domain.event.Participant;
import hu.noherczeg.necora.domain.fieldtrip.FieldTrip;
import hu.noherczeg.necora.domain.institution.EmployeeOfInstitution;
import hu.noherczeg.necora.domain.language.LanguageSkill;
import hu.noherczeg.necora.domain.organization.MemberOfOrganization;
import hu.noherczeg.necora.domain.publication.Author;
import hu.noherczeg.necora.domain.specialization.SpecializationOfPerson;
import hu.noherczeg.necora.domain.ssa.SSAPaperJudge;
import hu.noherczeg.necora.domain.tender.Applicant;
import hu.noherczeg.necora.domain.work.ParticipantInWork;
import hu.noherczeg.necora.security.authority.Authority;
import org.springframework.security.core.userdetails.UserDetails;

import java.io.Serializable;
import java.util.*;

public class User implements Serializable, UserDetails {
	
	private static final long serialVersionUID = 9212811318333029149L;
    private Long id;
	private String email;
	private String password;
	private boolean enabled;
    private String title;
    private String lastName;
    private String firstName;
    private String ehaCode;
    private String omId;
    private String comment;
	private Set<Authority> authorities;
    private Set<ParticipantInWork> works;
    private Set<Award> awards;
    private Set<Participant> participantInEvents;
    private Set<EmployeeOfInstitution> employedByInstitutions;
    private Set<LanguageSkill> languageSkills;
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
	
	public User() {
        this.authorities = new LinkedHashSet<>();
        this.works = new LinkedHashSet<>();
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

    public User(String email, String firstName, String lastName) {
        this.authorities = new LinkedHashSet<>();
        this.works = new LinkedHashSet<>();
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
        this.email = email;
        this.firstName = firstName;
        this.lastName = lastName;
    }

    @Override
	public String getUsername() {
		return email;
	}

    @Override
    public boolean isAccountNonExpired() {
        return true;
    }

    @Override
    public boolean isAccountNonLocked() {
        return true;
    }

    @Override
    public boolean isCredentialsNonExpired() {
        return true;
    }

    @Override
    public Set<Authority> getAuthorities() {
		return this.authorities;
	}

    public Long getId() {
        return id;
    }

    public String getEmail() {
        return email;
    }

    public String getPassword() {
        return password;
    }

    @Override
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

    public Set<LanguageSkill> getLanguageSkills() {
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

    public void setEmail(String email) {
        this.email = email;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setEhaCode(String ehaCode) {
        this.ehaCode = ehaCode;
    }

    public void setOmId(String omId) {
        this.omId = omId;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    public void enable() {
        this.enabled = true;
    }

    public void disable() {
        this.enabled = false;
    }
}
