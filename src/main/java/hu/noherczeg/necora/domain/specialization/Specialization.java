package hu.noherczeg.necora.domain.specialization;

import java.io.Serializable;
import java.util.LinkedHashSet;
import java.util.Set;

public class Specialization implements Serializable {
    private static final long serialVersionUID = -2590269070953596980L;
    private Long id;
    private String name;
    private LevelOfCourse levelOfCourse;
    private Set<SpecializationOfPerson> people;

    public Specialization() {
        this.people = new LinkedHashSet<>();
    }

    public Specialization(String name, LevelOfCourse levelOfCourse) {
        this.people = new LinkedHashSet<>();
        this.name = name;
        this.levelOfCourse = levelOfCourse;
    }

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public LevelOfCourse getLevelOfCourse() {
        return levelOfCourse;
    }

    public Set<SpecializationOfPerson> getPeople() {
        return people;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setLevelOfCourse(LevelOfCourse levelOfCourse) {
        this.levelOfCourse = levelOfCourse;
    }
}
