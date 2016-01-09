package users.staff;

import models.Note;
import models.Ticket;

public class Support extends Staff {

    public void addNote(Ticket ticker,Note note) {
        ticker.addNote(note);
    }

    public void forwardTicket(Ticket ticket, Support support) {
        support.getTicket();
    }

    private void getTicket(int ticketID) {
        //
    }

    public Note[] accessNotes(Ticket ticket) {
        return null;
    }

    public void setTicketStatus(Ticket ticket, int status) {
        ticket.setStatus(status);
    }

    public void sendResponse();

}
