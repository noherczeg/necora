package hu.noherczeg.necora.domain.income;

import java.io.Serializable;
import java.util.LinkedHashSet;
import java.util.Set;

public class IncomeType implements Serializable {
    private static final long serialVersionUID = 882671949762558588L;
    private Long id;
    private String name;
    private Set<Income> incomes;

    public IncomeType() {
        this.incomes = new LinkedHashSet<>();
    }

    public IncomeType(String name) {
        this.incomes = new LinkedHashSet<>();
        this.name = name;
    }

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public Set<Income> getIncomes() {
        return incomes;
    }

    public void setName(String name) {
        this.name = name;
    }
}
