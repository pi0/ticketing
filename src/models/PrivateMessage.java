package models;

import users.staff.Staff;

public class PrivateMessage {
    int pm_id;
    Staff receiver;
    Staff sender;

    public int getPm_id() {
        return pm_id;
    }

    public Staff getReceiver() {
        return receiver;
    }

    public Staff getSender() {
        return sender;
    }
}
