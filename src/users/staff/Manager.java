package users.staff;

import models.Config;
import models.Department;
import models.Report;
import system.System;

import java.util.Date;

public class Manager extends Staff {

    public Manager(System system, int id) {
        super(system, id);
    }

    public void setConfig(Config config) {
        system.getMessage(0,0,null);
    }

    public Report[] getReport(Date date) {
        return new Report[0];
    }

    public void createDepartment(String name) {

    }

    public void addSupport( int id, int authority_level, String password, String email, String username, Department department) {
        new Support( system,  id,  authority_level,  password,  email,  username,  department);
    }

}
