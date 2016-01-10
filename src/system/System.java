package system;


import java.util.HashMap;

import models.*;
import users.staff.Staff;

public class System {

    private Timer timer;
    private HashMap<Integer, Ticket> tickets;
    private HashMap<Integer, Staff> staffs;


    public System() {
        timer = new Timer();
    }

    public Ticket getTicket(int ticketid) {
        return tickets.get(ticketid);
    }

    public void sendPM(int sender, int receive, String text) {
        PrivateMessage privateMessage = new PrivateMessage();
        staffs.get(receive).addToQueue(privateMessage);
    }

}
