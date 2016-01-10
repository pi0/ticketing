package users.staff;

import models.Department;
import models.Note;
import models.Ticket;
import system.System;

import java.util.Date;

public class Support extends Staff {


    public Support(System system, int id, int authority_level, String password, String email, String username, Department department) {
        super(system, id);
        this.authority_level = authority_level;
        this.password = password;
        this.email = email;
        this.username = username;
        this.department = department;
    }

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
