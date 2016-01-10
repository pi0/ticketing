package models;

import users.staff.Staff;

import java.util.Date;

public class StaffResponse {
    int id;
    Date date;
    String text;
    Staff staff;

    public int getId() {
        return id;
    }

    public Date getDate() {
        return date;
    }

    public String getText() {
        return text;
    }

    public Staff getStaff() {
        return staff;
    }
}
