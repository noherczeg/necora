package hu.noherczeg.necora.web.language.resources.basic;

import org.springframework.hateoas.ResourceSupport;

public class LanguageBasicResource extends ResourceSupport {

    private int id;
    private String name;
    private String code;

    public LanguageBasicResource() {
    }

    public LanguageBasicResource(int id, String name, String code) {
        this.id = id;
        this.name = name;
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public String getCode() {
        return code;
    }
}
