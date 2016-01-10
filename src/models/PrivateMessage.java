package models;

import users.staff.Staff;

public class PrivateMessage {

    int pm_id;
    private Staff sender;
    private Staff receiver;
    String text;
    String title;


    public int getPm_id() {
        return pm_id;
    }

    public Staff getSender() {
        return sender;
    }

    public Staff getReceiver() {
        return receiver;
    }

    public String getText() {
        return text;
    }

    public String getTitle() {
        return title;
    }
}
