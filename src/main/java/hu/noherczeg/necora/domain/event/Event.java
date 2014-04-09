package hu.noherczeg.necora.domain.event;

import hu.noherczeg.necora.domain.tender.Tender;
import org.joda.time.DateTime;

import java.io.Serializable;
import java.util.LinkedHashSet;
import java.util.Set;

public class Event implements Serializable {
    private static final long serialVersionUID = 6614543196966466322L;
    private Long id;
    private String name;
    private DateTime start;
    private DateTime end;
    private String address;
    private String description;
    private EventType type;
    private Set<Participant> participants;
    private Set<Tender> tenders;

    public Event() {
        this.tenders = new LinkedHashSet<>();
        this.participants = new LinkedHashSet<>();
    }

    public Event(String name, DateTime start, DateTime end, String address, String description, EventType type) {
        this.tenders = new LinkedHashSet<>();
        this.participants = new LinkedHashSet<>();
        this.name = name;
        this.start = start;
        this.end = end;
        this.address = address;
        this.description = description;
        this.type = type;
    }

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public DateTime getStart() {
        return start;
    }

    public DateTime getEnd() {
        return end;
    }

    public String getAddress() {
        return address;
    }

    public String getDescription() {
        return description;
    }

    public EventType getType() {
        return type;
    }

    public Set<Participant> getParticipants() {
        return participants;
    }

    public Set<Tender> getTenders() {
        return tenders;
    }
}
