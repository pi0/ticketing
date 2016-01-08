package users.staff;

import models.Message;
import models.Ticket;

public abstract class Staff {

    public abstract Ticket accessTicket(int ticketID);

    public abstract void login();

    public abstract void sendPM(int receiverID, String text);

    public abstract Message[] receivePM();

}
