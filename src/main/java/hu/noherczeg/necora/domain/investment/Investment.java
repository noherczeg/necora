package hu.noherczeg.necora.domain.investment;

import hu.noherczeg.necora.domain.income.Income;
import org.joda.time.DateTime;

import java.io.Serializable;

public class Investment implements Serializable {
    private static final long serialVersionUID = 803612064317784360L;
    private Long id;
    private double amount;
    private DateTime date;
    private String description;
    private InvestmentType type;
    private Income income;

    public Investment() {
    }

    public Investment(double amount, DateTime date, String description, InvestmentType type, Income income) {
        this.amount = amount;
        this.date = date;
        this.description = description;
        this.type = type;
        this.income = income;
    }

    public Long getId() {
        return id;
    }

    public double getAmount() {
        return amount;
    }

    public DateTime getDate() {
        return date;
    }

    public String getDescription() {
        return description;
    }

    public InvestmentType getType() {
        return type;
    }

    public Income getIncome() {
        return income;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public void setDate(DateTime date) {
        this.date = date;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setType(InvestmentType type) {
        this.type = type;
    }

    public void setIncome(Income income) {
        this.income = income;
    }
}
