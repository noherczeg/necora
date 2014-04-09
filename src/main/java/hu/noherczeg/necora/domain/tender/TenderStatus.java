package hu.noherczeg.necora.domain.tender;

import java.io.Serializable;
import java.util.LinkedHashSet;
import java.util.Set;

public class TenderStatus implements Serializable {
    private static final long serialVersionUID = 1600485706462499059L;
    private Long id;
    private String name;
    private Set<Tender> tenders;

    public TenderStatus() {
        this.tenders = new LinkedHashSet<>();
    }

    public TenderStatus(String name) {
        this.tenders = new LinkedHashSet<>();
        this.name = name;
    }

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public Set<Tender> getTenders() {
        return tenders;
    }

    public void setName(String name) {
        this.name = name;
    }
}
