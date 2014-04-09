package hu.noherczeg.necora.domain.department;

import hu.noherczeg.necora.domain.income.Income;
import hu.noherczeg.necora.domain.institute.DepartmentOfInstitute;

import java.io.Serializable;
import java.util.LinkedHashSet;
import java.util.Set;

public class Department implements Serializable {
    private static final long serialVersionUID = 8700676031479510633L;
    private Long id;
    private String name;
    private Set<Income> incomes;
    private Set<DepartmentOfInstitute> institutes;
    private Set<EmployeeOfDepartment> employees;

    public Department() {
        this.incomes = new LinkedHashSet<>();
        this.institutes = new LinkedHashSet<>();
        this.employees = new LinkedHashSet<>();
    }

    public Department(String name) {
        this.incomes = new LinkedHashSet<>();
        this.institutes = new LinkedHashSet<>();
        this.employees = new LinkedHashSet<>();
        this.name = name;
    }

    public Department(String name, Set<Income> incomes, Set<DepartmentOfInstitute> institutes, Set<EmployeeOfDepartment> employees) {
        this.name = name;
        this.incomes = incomes;
        this.institutes = institutes;
        this.employees = employees;
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

    public Set<DepartmentOfInstitute> getInstitutes() {
        return institutes;
    }

    public Set<EmployeeOfDepartment> getEmployees() {
        return employees;
    }

    public void setName(String name) {
        this.name = name;
    }
}