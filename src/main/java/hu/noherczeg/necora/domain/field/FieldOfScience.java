package hu.noherczeg.necora.domain.field;

import hu.noherczeg.necora.domain.tender.Tender;
import hu.noherczeg.necora.domain.user.PersonsDegree;

import java.io.Serializable;
import java.util.LinkedHashSet;
import java.util.Set;

public class FieldOfScience implements Serializable {
    private static final long serialVersionUID = -8697852282180635360L;
    private int id;
    private String name;
    private Set<Tender> tenders;
    private Set<PersonsDegree> degreesOfPeople;

    public FieldOfScience() {
        this.tenders = new LinkedHashSet<>();
        this.degreesOfPeople = new LinkedHashSet<>();
    }

    public FieldOfScience(String name) {
        this.tenders = new LinkedHashSet<>();
        this.degreesOfPeople = new LinkedHashSet<>();
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public Set<Tender> getTenders() {
        return tenders;
    }

    public Set<PersonsDegree> getDegreesOfPeople() {
        return degreesOfPeople;
    }

    public void setName(String name) {
        this.name = name;
    }
}
