package hu.noherczeg.necora.domain.fieldtrip;

import java.io.Serializable;
import java.util.LinkedHashSet;
import java.util.Set;

public class FieldTripType implements Serializable {
    private static final long serialVersionUID = -3174925296278224973L;
    private Long id;
    private String name;
    private Set<FieldTrip> fieldTrips;

    public FieldTripType() {
        this.fieldTrips = new LinkedHashSet<>();
    }

    public FieldTripType(String name) {
        this.name = name;
        this.fieldTrips = new LinkedHashSet<>();
    }

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public Set<FieldTrip> getFieldTrips() {
        return fieldTrips;
    }

    public void setName(String name) {
        this.name = name;
    }
}
