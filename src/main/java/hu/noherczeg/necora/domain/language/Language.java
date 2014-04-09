package hu.noherczeg.necora.domain.language;

import hu.noherczeg.necora.domain.publication.Publication;

import java.io.Serializable;
import java.util.LinkedHashSet;
import java.util.Set;

public class Language implements Serializable {
    private static final long serialVersionUID = 1866835205858983588L;
    private int id;
    private String name;
    private String code;
    private Set<LanguageSkill> languageSkills;
    private Set<Publication> publications;

    public Language() {
        this.languageSkills = new LinkedHashSet<>();
        this.publications = new LinkedHashSet<>();
    }

    public Language(String name, String code) {
        this.languageSkills = new LinkedHashSet<>();
        this.publications = new LinkedHashSet<>();
        this.name = name;
        this.code = code;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getCode() {
        return code;
    }

    public Set<LanguageSkill> getLanguageSkills() {
        return languageSkills;
    }

    public Set<Publication> getPublications() {
        return publications;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setCode(String code) {
        this.code = code;
    }
}
