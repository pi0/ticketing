package models;

import users.staff.Staff;

public abstract class Ticket {

    public abstract void setStatus(int status);
    public abstract void sendResponse(String response,Staff staff);

}
