package users.user;

import Misc.MessageListener;
import models.StaffResponse;

public class Member implements MessageListener {

    public void login() {

    }

    public StaffResponse[] receiveResponse(int ticketID) {
        return null;
    }

    public int sendTicket(String email, String departmentName, String title, String text) {
        return 0;
    }

    @Override
    public void getMessage(int id, int type, Object... params) {

    }
    
}
