package hu.noherczeg.necora.domain.tender;

import java.io.Serializable;
import java.util.LinkedHashSet;
import java.util.Set;

public class TenderType implements Serializable {
    private static final long serialVersionUID = 7692147796674910258L;
    private Long id;
    private String name;
    private Set<Tender> tenders;

    public TenderType() {
        this.tenders = new LinkedHashSet<>();
    }

    public TenderType(String name) {
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
