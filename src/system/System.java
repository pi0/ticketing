package system;


import java.util.HashMap;

import models.*;
import users.staff.Staff;
import users.user.Member;

public class System {

    private Timer timer;
    private HashMap<Integer, Ticket> tickets;
    private HashMap<Integer, Staff> staffs;
    private HashMap<Integer, Member> members;
    private Department[] departments;



    public System() {
        timer = new Timer();
    }

    public Ticket getTicket(int ticketid) {
        return tickets.get(ticketid);
    }

    public void sendPM(int sender, int receive, String text) {
        Message message = new Message();
        staffs.get(receive).addToQueue(message);
    }

}
