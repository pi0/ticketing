package models;

public class Note {
    int id;
    Ticket ticket;
    String title;
    String text;

    public int getId() {
        return id;
    }

    public Ticket getTicket() {
        return ticket;
    }

    public String getTitle() {
        return title;
    }

    public String getText() {
        return text;
    }
}
