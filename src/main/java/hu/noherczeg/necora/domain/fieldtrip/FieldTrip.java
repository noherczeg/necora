package hu.noherczeg.necora.domain.fieldtrip;

import hu.noherczeg.necora.domain.country.Country;
import hu.noherczeg.necora.domain.user.User;
import org.joda.time.DateTime;

import java.io.Serializable;
import java.util.LinkedHashSet;
import java.util.Set;

public class FieldTrip implements Serializable {
    private static final long serialVersionUID = 3385947072115353332L;
    private Long id;
    private DateTime start;
    private DateTime end;
    private String institution;
    private String description;
    private Country country;
    private FieldTripType type;
    private Set<User> participants;

    public FieldTrip() {
        this.participants = new LinkedHashSet<>();
    }

    public FieldTrip(DateTime start, DateTime end, String institution, String description, Country country, FieldTripType type) {
        this.participants = new LinkedHashSet<>();
        this.start = start;
        this.end = end;
        this.institution = institution;
        this.description = description;
        this.country = country;
        this.type = type;
    }

    public Long getId() {
        return id;
    }

    public DateTime getStart() {
        return start;
    }

    public DateTime getEnd() {
        return end;
    }

    public String getInstitution() {
        return institution;
    }

    public String getDescription() {
        return description;
    }

    public Country getCountry() {
        return country;
    }

    public FieldTripType getType() {
        return type;
    }

    public Set<User> getParticipants() {
        return participants;
    }

    public void setStart(DateTime start) {
        this.start = start;
    }

    public void setEnd(DateTime end) {
        this.end = end;
    }

    public void setInstitution(String institution) {
        this.institution = institution;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setCountry(Country country) {
        this.country = country;
    }

    public void setType(FieldTripType type) {
        this.type = type;
    }
}
