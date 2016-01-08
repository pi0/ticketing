package models;

import users.staff.Staff;

public abstract class Ticket {

    public static final int STATUS_TODO = 1;
    public static final int STATUS_DOING = 2;
    public static final int STATUS_DONE = 4;

    public abstract void setStatus(int status);
    public abstract void sendResponse(String response,Staff staff);

}
