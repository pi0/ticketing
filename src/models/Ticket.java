package models;

import users.staff.Staff;

public class Ticket {

    public static final int STATUS_DEFAULT = 0;
    public static final int STATUS_TODO = 1;
    public static final int STATUS_DOING = 2;
    public static final int STATUS_DONE = 4;

    private Note[] notes;
    private int status = STATUS_DEFAULT;
    private TicketResponse[] Responses;
    System system;

    public void setStatus(int status) {
        //
    }

    public void sendResponse(String response, Staff staff) {
        //
    }

    public void addNote(Note note) {
        //
    }

}
