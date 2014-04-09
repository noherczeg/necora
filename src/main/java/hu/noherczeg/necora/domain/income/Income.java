package hu.noherczeg.necora.domain.income;

import hu.noherczeg.necora.domain.department.Department;
import hu.noherczeg.necora.domain.institute.Institute;
import hu.noherczeg.necora.domain.investment.Investment;
import hu.noherczeg.necora.domain.tender.Tender;
import org.joda.time.DateTime;

import java.io.Serializable;
import java.util.LinkedHashSet;
import java.util.Set;

public class Income implements Serializable {
    private static final long serialVersionUID = -5022541202190954478L;
    private Long id;
    private Double amount;
    private DateTime date;
    private String description;
    private Set<Investment> investments;
    private IncomeType type;
    private Institute institute;
    private Tender tender;
    private Department department;

    public Income() {
        this.investments = new LinkedHashSet<>();
    }

    public Income(Double amount, DateTime date, String description, IncomeType type, Institute institute, Tender tender, Department department, Set<Investment> investments) {
        this.amount = amount;
        this.date = date;
        this.description = description;
        this.type = type;
        this.institute = institute;
        this.tender = tender;
        this.department = department;
        this.investments = investments;
    }

    public Long getId() {
        return id;
    }

    public Double getAmount() {
        return amount;
    }

    public DateTime getDate() {
        return date;
    }

    public String getDescription() {
        return description;
    }

    public Set<Investment> getInvestments() {
        return investments;
    }

    public IncomeType getType() {
        return type;
    }

    public Institute getInstitute() {
        return institute;
    }

    public Tender getTender() {
        return tender;
    }

    public Department getDepartment() {
        return department;
    }

}
