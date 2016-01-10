package system;


import java.util.Date;
import java.util.HashMap;
import java.util.List;

import Misc.MessageListener;
import models.*;
import users.staff.Staff;
import users.staff.Support;
import users.user.Member;

public class System implements MessageListener{

    private Timer timer;
    private List< Ticket> tickets;
    private List<Staff> staffs;
    private List<Member> members;
    private List<Report> reports;


    public List<Report> getReport() {
        return reports;
    }


    public List<Member> getMembers() {
        return members;
    }

    public List<Department> getDepartments() {
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



    private List<Department> departments;
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



    public static boolean signupUser(String username, String email, String password) {
        return true;
    }

    public void createStaff(int id, int authority_level, String password, String email, String username, Department department) {
        staffs.add(new Support(this,  id,  authority_level,  password,  email,  username,  department));

    }

    public void createDepartment(String name) {
        departments.add(new Department(name));
    }

    public boolean updateConfig(String key, String value) {
        return false;
    }

    public Report[] getReport(Date date) {
        return new Report[0];
    }
}
