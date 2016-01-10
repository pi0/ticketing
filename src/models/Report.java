package models;

import users.staff.Support;

import java.util.Date;


import java.util.Date;

public class Report {
    int id;
    Date date;
    Support reporter;
    String text;

    public int getId() {
        return id;
    }

    public Date getDate() {
        return date;
    }

    public Support getReporter() {
        return reporter;
    }

    public String getText() {
        return text;
    }
}
