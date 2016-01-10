package users.user;

import Misc.MessageListener;

public abstract class Guest implements MessageListener {

    public void signUp(String username, String email, String password)
    {
        system.System.signupUser(username,email,password);
    }

}
