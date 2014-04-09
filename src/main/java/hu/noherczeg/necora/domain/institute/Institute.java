package hu.noherczeg.necora.domain.institute;

import hu.noherczeg.necora.domain.income.Income;

import java.io.Serializable;
import java.util.LinkedHashSet;
import java.util.Set;

public class Institute implements Serializable {
    private static final long serialVersionUID = 9107750946983121133L;
    private Long id;
    private String name;
    private Set<Income> incomes;
    private Set<DepartmentOfInstitute> departments;

    public Institute() {
        this.incomes = new LinkedHashSet<>();
        this.departments = new LinkedHashSet<>();
    }

    public Institute(String name, Set<Income> incomes, Set<DepartmentOfInstitute> departments) {
        this.name = name;
        this.incomes = incomes;
        this.departments = departments;
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

    public Set<DepartmentOfInstitute> getDepartments() {
        return departments;
    }

    public void setName(String name) {
        this.name = name;
    }

}
