package hu.noherczeg.necora.domain.work;

import hu.noherczeg.necora.domain.user.User;

import java.io.Serializable;

public class ParticipantInWork implements Serializable {
    private static final long serialVersionUID = -1811328113710133767L;
    private Long id;
    private int order;
    private Work work;
    private User participant;

    public ParticipantInWork() {
    }

    public ParticipantInWork(Work work, User participant, int order) {
        this.work = work;
        this.participant = participant;
        this.order = order;
    }

    public Long getId() {
        return id;
    }

    public int getOrder() {
        return order;
    }

    public Work getWork() {
        return work;
    }

    public User getParticipant() {
        return participant;
    }

    public void setOrder(int order) {
        this.order = order;
    }

    public void setWork(Work work) {
        this.work = work;
    }

    public void setParticipant(User participant) {
        this.participant = participant;
    }
}
