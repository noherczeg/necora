package hu.noherczeg.necora.domain.publication;

import java.io.Serializable;
import java.util.LinkedHashSet;
import java.util.Set;

public class PublicationType implements Serializable {
    private static final long serialVersionUID = 6427391852071631830L;
    private Long id;
    private String name;
    private Set<Publication> publications;

    public PublicationType() {
        this.publications = new LinkedHashSet<>();
    }

    public PublicationType(String name) {
        this.publications = new LinkedHashSet<>();
        this.name = name;
    }

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public Set<Publication> getPublications() {
        return publications;
    }

    public void setName(String name) {
        this.name = name;
    }
}
