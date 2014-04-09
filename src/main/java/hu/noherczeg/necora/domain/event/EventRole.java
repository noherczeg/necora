package hu.noherczeg.necora.domain.event;

import java.io.Serializable;
import java.util.LinkedHashSet;
import java.util.Set;

public class EventRole implements Serializable {
    private static final long serialVersionUID = 1165441633668843199L;
    private Long id;
    private String name;
    private Set<Participant> participants;

    public EventRole() {
        this.participants = new LinkedHashSet<>();
    }

    public EventRole(String name) {
        this.participants = new LinkedHashSet<>();
        this.name = name;
    }

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public Set<Participant> getParticipants() {
        return participants;
    }

    public void setName(String name) {
        this.name = name;
    }
}
