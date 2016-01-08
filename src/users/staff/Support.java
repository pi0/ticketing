package users.staff;

import models.Note;
import models.Ticket;

public abstract class Support extends Staff {

    public abstract void addNote(Note note);

    public abstract void forwardTicket(Ticket ticket, Support support);

    public abstract Note[] accessNotes();

    public abstract void setTicketStatus(Ticket ticket, int status);

    public abstract void sendResponse();

}
