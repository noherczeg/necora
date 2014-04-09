package hu.noherczeg.necora.domain.language;

import java.io.Serializable;
import java.util.LinkedHashSet;
import java.util.Set;

public class DegreeOfLanguageSkill implements Serializable {
    private static final long serialVersionUID = -3587816068102504480L;
    private int id;
    private String name;
    private Set<LanguageSkill> languageSkills;

    public DegreeOfLanguageSkill() {
        this.languageSkills = new LinkedHashSet<>();
    }

    public DegreeOfLanguageSkill(String name) {
        this.languageSkills = new LinkedHashSet<>();
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public Set<LanguageSkill> getLanguageSkills() {
        return languageSkills;
    }

    public void setName(String name) {
        this.name = name;
    }
}
