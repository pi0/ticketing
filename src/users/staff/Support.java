package users.staff;

import models.Department;
import models.Note;
import models.Ticket;

import java.util.Date;

public class Support extends Staff {

    Department department;

    public void addNote(Ticket ticket,Note note) {
        ticket.addNote(note);
    }

    public void forwardTicket(Ticket ticket, Support support) {
        //
    }

    private void getTicket(Ticket ticket) {
        //
    }

    public Note[] accessNotes(Ticket ticket) {
        return null;
    }

    public void setTicketStatus(Ticket ticket, int status) {
        ticket.setStatus(status);
    }

    public void sendResponse(Ticket ticket, int staff_id, Date date, String text) {

    }

}
