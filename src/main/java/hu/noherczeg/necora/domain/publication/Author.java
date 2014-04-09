package hu.noherczeg.necora.domain.publication;

import hu.noherczeg.necora.domain.user.User;

import java.io.Serializable;

public class Author implements Serializable {
    private static final long serialVersionUID = -5606821718355863405L;
    private Long id;
    private int position;
    private Publication publication;
    private User author;

    public Author() {
    }

    public Author(Publication publication, User author, int position) {
        this.publication = publication;
        this.author = author;
        this.position = position;
    }

    public Long getId() {
        return id;
    }

    public int getPosition() {
        return position;
    }

    public Publication getPublication() {
        return publication;
    }

    public User getAuthor() {
        return author;
    }

    public void setPosition(int position) {
        this.position = position;
    }

    public void setPublication(Publication publication) {
        this.publication = publication;
    }

    public void setAuthor(User author) {
        this.author = author;
    }
}
