package Project;

import java.util.ArrayList;
import java.util.List;

public class Activity {

    private double time;
    private int startDate;
    private int endDate;
    private String name;
    double timeRegistered;
    List<Employee> employeeList = new ArrayList<>();

    public Activity(double time, int startDate, int endDate, String name) {
    this.time = time;
    this.startDate = startDate;
    this.endDate = endDate;
    this.name = name;
    }

    public void registerTime(double timeUsed){
        timeRegistered = timeRegistered+timeUsed;
    }

    public void addEmployee(Employee employee) throws Exception {
        if(employee.isAvailable(startDate,endDate)) {
            employeeList.add(employee);
            employee.addToActivities(this);
        }
        else {
        throw new Exception("The employee is not availiable in that timeframe");
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

    public Employee getEmployee(Employee employee) {
        for (Employee employee1 : employeeList){
            if (employee1.equals(employee)){
                return employee;
            }
        }
        return null;
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
