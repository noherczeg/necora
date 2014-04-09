package hu.noherczeg.necora.domain.event;

import hu.noherczeg.necora.domain.user.User;

import java.io.Serializable;

public class Participant implements Serializable {
    private static final long serialVersionUID = 1610919652086210594L;
    private Long id;
    private String comment;
    private Event event;
    private EventRole eventRole;
    private User participant;

    public Participant() {
    }

    public Participant(Event event, User participant, EventRole eventRole, String comment) {
        this.event = event;
        this.participant = participant;
        this.eventRole = eventRole;
        this.comment = comment;
    }

    public Long getId() {
        return id;
    }

    public String getComment() {
        return comment;
    }

    public Event getEvent() {
        return event;
    }

    public EventRole getEventRole() {
        return eventRole;
    }

    public User getParticipant() {
        return participant;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    public void setEvent(Event event) {
        this.event = event;
    }

    public void setEventRole(EventRole eventRole) {
        this.eventRole = eventRole;
    }

    public void setParticipant(User participant) {
        this.participant = participant;
    }
}
