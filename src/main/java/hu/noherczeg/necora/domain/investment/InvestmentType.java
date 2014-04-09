package hu.noherczeg.necora.domain.investment;

import java.io.Serializable;
import java.util.LinkedHashSet;
import java.util.Set;

public class InvestmentType implements Serializable {
    private static final long serialVersionUID = -4869585688836881394L;
    private Long id;
    private String name;
    private Set<Investment> investments;

    public InvestmentType() {
        this.investments = new LinkedHashSet<>();
    }

    public InvestmentType(String name) {
        this.investments = new LinkedHashSet<>();
        this.name = name;
    }

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Set<Investment> getInvestments() {
        return investments;
    }
}
