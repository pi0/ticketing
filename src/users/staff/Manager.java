package users.staff;

import models.Department;
import models.Report;
import system.System;

import java.util.Date;

public class Manager extends Staff {

    public Manager(System system, int id) {
        super(system, id);
    }

    public void setConfig(String key, String value) {

        system.updateConfig(key, value);

    }

    public Report[] getReport(Date report_date) {
        return system.getReport(report_date);
    }

    public void createDepartment(String name) {
        system.createDepartment(name);

    }

    public void addSupport( int id, int authority_level, String password, String email, String username, Department department) {
        system.createStaff(id, authority_level, password, email, username, department);
    }

}
