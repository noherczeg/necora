package hu.noherczeg.necora.domain.work;

import java.io.Serializable;
import java.util.LinkedHashSet;
import java.util.Set;

public class TypeOfWork implements Serializable {
    private static final long serialVersionUID = -4261598363692396427L;
    private Long id;
    private String name;
    private Set<Work> works;

    public TypeOfWork() {
        this.works = new LinkedHashSet<>();
    }

    public TypeOfWork(String name) {
        this.works = new LinkedHashSet<>();
        this.name = name;
    }

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public Set<Work> getWorks() {
        return works;
    }

    public void setName(String name) {
        this.name = name;
    }
}
