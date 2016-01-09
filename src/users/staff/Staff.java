package users.staff;

import models.*;

import system.System;

import java.util.Queue;

public class Staff {
    private System system;
    private Queue<Message> queue;
    private int ID;

    public Queue<Message> getQueue() {
        return queue;
    }

    public Ticket accessTicket(int ticketID) {
        return system.getTicket(ticketID);
    }

    public void login() {

    }

    public void sendPM(int receiverID, String text) {
        system.sendPM(ID, receiverID, text);
    }

    public Message[] receivePM() {
        return null;
    }

    public void addToQueue(Message message) {

    }
}