package models;
import users.staff.Support;
import users.user.User;

public class Department {
    int id;
    String name;

    private System system;
    private Support[] supports;
    private User[] users;

    public Department(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }
}
