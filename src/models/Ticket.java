package models;

import users.staff.Staff;
import users.staff.Support;

import java.util.List;

public class Ticket {

    public static final int STATUS_DEFAULT = 0;
    public static final int STATUS_TODO = 1;
    public static final int STATUS_DOING = 2;
    public static final int STATUS_DONE = 4;

    int id;
    Note[] notes;
    int status = STATUS_DEFAULT;
    StaffResponse[] staffResponses;
    private List<Staff> assignees;

    public void addSupport(Staff staff)
    {
        assignees.add(staff);
    }


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
