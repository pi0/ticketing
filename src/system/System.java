package system;


import java.util.HashMap;
import java.util.List;

import models.*;
import users.staff.Staff;
import users.user.Member;

public class System {

    private Timer timer;
    private List< Ticket> tickets;
    private List<Staff> staffs;
    private List<Member> members;

    public List<Member> getMembers() {
        return members;
    }

    public Department[] getDepartments() {
        return departments;
    }

    public List<Staff> getStaffs() {
        return staffs;
    }

    public List<Ticket> getTickets() {
        return tickets;
    }

    public List<Config> getConfiguration() {
        return configuration;
    }

    private Department[] departments;
    private List<Config> configuration;


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

    public void getMessage(int id,int type,Object... params){

    }

}
