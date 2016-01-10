package users.staff;

import models.*;

import system.System;

import java.util.Queue;

public class Staff {
    private int id;
    private System system;
    private Queue<PrivateMessage> queue;

    public Queue<PrivateMessage> getQueue() {
        return queue;
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