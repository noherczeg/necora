package hu.noherczeg.necora.domain.award;

import hu.noherczeg.necora.domain.country.Country;
import hu.noherczeg.necora.domain.user.User;
import org.joda.time.DateTime;

import java.io.Serializable;

public class Award implements Serializable {
    private static final long serialVersionUID = -6052710232078318514L;
    private Long id;
    private User user;
    private Country country;
    private String name;
    private DateTime date;
    private String donor;
    private String description;

    public Award() {
    }

    public Award(String name, DateTime date) {
        this.name = name;
        this.date = date;
    }

    public Award(String name, DateTime date, User user, String donor, Country country, String description) {
        this.name = name;
        this.date = date;
        this.user = user;
        this.donor = donor;
        this.country = country;
        this.description = description;
    }

    public Long getId() {
        return id;
    }

    public User getUser() {
        return user;
    }

    public Country getCountry() {
        return country;
    }

    public String getName() {
        return name;
    }

    public DateTime getDate() {
        return date;
    }

    public String getDonor() {
        return donor;
    }

    public String getDescription() {
        return description;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public void setCountry(Country country) {
        this.country = country;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setDate(DateTime date) {
        this.date = date;
    }

    public void setDonor(String donor) {
        this.donor = donor;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
