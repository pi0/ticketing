package models;

import users.staff.Staff;

public abstract class Note {


    private Staff sender;
    private Staff receiver;
    String text;
    String title;
    Ticket ticket;

}
