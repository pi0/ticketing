package users.user;

import Misc.MessageListener;
import models.StaffResponse;

public class User implements MessageListener {

    String username, email;
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
