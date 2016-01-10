package users.staff;

import models.*;

import system.System;

import java.util.Queue;

public class Staff {
    private int id;
    protected System system;
    private Queue<PrivateMessage> queue;
    public Queue<PrivateMessage> getQueue() {
        return queue;
    }

    public Staff(System system, int id) {
        this.system = system;
        this.id = id;
        system.getMessage(0,0,null);
    }

    public Ticket accessTicket(int ticketID) {
        return system.getTicket(ticketID);
    }

    public void login() {

    }

    public void sendPM(int receiverID, String text) {
        system.sendPM(id, receiverID, text);
    }

    public PrivateMessage[] receivePM() {
        return null;
    }

    public void addToQueue(PrivateMessage privateMessage) {

    }
}