package Project;

import java.util.ArrayList;
import java.util.List;

public class Activity {

    private double time;
    private int startDate;
    private int endDate;
    private String name;
    private double timeRegistered;
    List<Employee> employeeList = new ArrayList<>();

    public Activity(double time, int startDate, int endDate, String name) {
    this.time = time;
    this.startDate = startDate;
    this.endDate = endDate;
    this.name = name;
    }

    public void registerTime(double timeUsed){
        this.timeRegistered = this.timeRegistered+timeUsed;
    }

    public void addEmployee(Employee employee) throws Exception {
        assert true: employee != null;
        if (getEmployee(employee.getInitials())== null) {     //1
            if (employee.isAvailable(startDate, endDate)) {   // 2
                employeeList.add(employee);
                employee.addToActivities(this);
                assert true : employee.getInitials() != null;
            } else {throw new Exception("The employee is not available in that timeframe");}
        }
    }

    public double getTime() {
        return time;
    }

    public int getStartDate() {
        return startDate;
    }

    public int getEndDate() {
        return endDate;
    }

    public String getName() {
        return name;
    }

    public double getTimeRegistered() {
        return timeRegistered;
    }

    public List<Employee> getEmployeeList() {
        return employeeList;
    }

    public Employee getEmployee(String initials) {
        for (Employee employee1 : employeeList){
            if (employee1.getInitials().equals(initials)){
                return employee1;
            }
        }
        return null;
    }
}
