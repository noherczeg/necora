package hu.noherczeg.necora.web.user.resources.full;

import hu.noherczeg.necora.domain.language.DegreeOfLanguageSkill;
import hu.noherczeg.necora.domain.language.Language;
import hu.noherczeg.necora.domain.language.LanguageSkill;
import hu.noherczeg.necora.domain.user.User;
import hu.noherczeg.necora.web.language.resources.basic.DegreeOfLanguageSkillBasicResource;
import hu.noherczeg.necora.web.language.resources.basic.LanguageBasicResource;
import hu.noherczeg.necora.web.user.UserController;
import org.joda.time.DateTime;
import org.springframework.hateoas.mvc.ResourceAssemblerSupport;

import static org.springframework.hateoas.mvc.ControllerLinkBuilder.linkTo;
import static org.springframework.hateoas.mvc.ControllerLinkBuilder.methodOn;

public class FullUserResourceAssembler extends ResourceAssemblerSupport<User, UserFullResource> {

    public FullUserResourceAssembler() {
        super(UserController.class, UserFullResource.class);
    }

    @Override
    public UserFullResource toResource(User user) {
        UserFullResource resource = new UserFullResource(
                user.getId(), user.getEmail(), user.getTitle(), user.getLastName(), user.getFirstName(), user.getEhaCode());
        resource.getApplicantInTenders().addAll(user.getApplicantInTenders());
        resource.getAuthorOfPublications().addAll(user.getAuthorOfPublications());
        resource.getAwards().addAll(user.getAwards());
        resource.setComment(user.getComment());
        resource.getDegrees().addAll(user.getDegrees());
        resource.getEmployedByDepartments().addAll(user.getEmployedByDepartments());
        resource.getEmployedByInstitutions().addAll(user.getEmployedByInstitutions());
        resource.setEnabled(user.isEnabled());
        resource.getFieldTrips().addAll(user.getFieldTrips());
        resource.getJudgesSSAPapers().addAll(user.getJudgesSSAPapers());

        for (LanguageSkill lSkill: user.getLanguageSkills()) {
            resource.getLanguageSkills().add(populateLanguageSkill(lSkill, lSkill.getLanguage(), lSkill.getDegreeOfLanguageSkill()));
        }

        resource.getMemberOfOrganizations().addAll(user.getMemberOfOrganizations());
        resource.getDegrees().addAll(user.getDegrees());
        resource.setOmId(user.getOmId());
        resource.getParticipantInEvents().addAll(user.getParticipantInEvents());
        resource.getSpecializations().addAll(user.getSpecializations());
        resource.getSupervisesDegrees().addAll(user.getSupervisesDegrees());
        resource.getSuperviseSSAPapers().addAll(user.getSupervisesSSAPapers());
        resource.getWorks().addAll(user.getWorks());
        resource.add(linkTo(methodOn(UserController.class).getOne(user.getId())).withSelfRel());
        resource.add(linkTo(UserController.class).withRel("users"));
        return resource;
    }

    private LanguageSkillBasicForUser populateLanguageSkill(LanguageSkill lSkill, Language language, DegreeOfLanguageSkill degree) {
        LanguageBasicResource lsbr = new LanguageBasicResource(language.getId(), language.getName(), language.getCode());
        DegreeOfLanguageSkillBasicResource dolsbr = new DegreeOfLanguageSkillBasicResource(degree.getId(), degree.getName());
        return new LanguageSkillBasicForUser(lSkill.getId(), lSkill.getCertificate(), lSkill.getDate(), lSkill.getComment(), lsbr, dolsbr);
    }

}
