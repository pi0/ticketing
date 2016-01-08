package users.staff;

import models.Config;
import models.Report;

import java.util.Date;

public abstract class Manager extends Staff {

    public abstract void setConfig(Config config);

    public abstract Report[] getReport(Date date);

    public abstract void createDepartment(String name);

    public abstract void addSupport(Support support);

}
