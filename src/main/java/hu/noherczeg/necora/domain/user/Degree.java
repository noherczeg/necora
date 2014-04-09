package hu.noherczeg.necora.domain.user;

import java.io.Serializable;
import java.util.LinkedHashSet;
import java.util.Set;

public class Degree implements Serializable {
    private static final long serialVersionUID = 7368628575315060592L;
    private Long id;
    private String name;
    private Set<PersonsDegree> people;

    public Degree() {
        this.people = new LinkedHashSet<>();
    }

    public Degree(String name) {
        this.people = new LinkedHashSet<>();
        this.name = name;
    }

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public Set<PersonsDegree> getPeople() {
        return people;
    }

    public void setName(String name) {
        this.name = name;
    }
}
