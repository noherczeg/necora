package hu.noherczeg.necora.domain.specialization;

import java.io.Serializable;
import java.util.LinkedHashSet;
import java.util.Set;

public class LevelOfCourse implements Serializable {
    private static final long serialVersionUID = 2475076538521910148L;
    private Long id;
    private String name;
    private Set<Specialization> specializations;

    public LevelOfCourse() {
        this.specializations = new LinkedHashSet<>();
    }

    public LevelOfCourse(String name) {
        this.specializations = new LinkedHashSet<>();
        this.name = name;
    }

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public Set<Specialization> getSpecializations() {
        return specializations;
    }

    public void setName(String name) {
        this.name = name;
    }
}
