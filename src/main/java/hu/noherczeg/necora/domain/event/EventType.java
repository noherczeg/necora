package hu.noherczeg.necora.domain.event;

import java.io.Serializable;
import java.util.LinkedHashSet;
import java.util.Set;

public class EventType implements Serializable {
    private static final long serialVersionUID = 1406048976508962723L;
    private Long id;
    private String name;
    private Set<Event> events;

    public EventType() {
        this.events = new LinkedHashSet<>();
    }

    public EventType(String name) {
        this.events = new LinkedHashSet<>();
        this.name = name;
    }

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public Set<Event> getEvents() {
        return events;
    }

    public void setName(String name) {
        this.name = name;
    }
}
