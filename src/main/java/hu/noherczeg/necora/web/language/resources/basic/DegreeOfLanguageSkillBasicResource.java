package hu.noherczeg.necora.web.language.resources.basic;

import org.springframework.hateoas.ResourceSupport;

public class DegreeOfLanguageSkillBasicResource extends ResourceSupport {

    private int id;
    private String name;

    public DegreeOfLanguageSkillBasicResource() {
    }

    public DegreeOfLanguageSkillBasicResource(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
