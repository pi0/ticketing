package models;
import users.staff.Support;
import users.user.Member;

public class Department {
    int id;
    String name;

    private Support[] supports;
    private Member[] members;

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }
}
