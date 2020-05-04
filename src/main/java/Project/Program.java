package Project;

import java.util.ArrayList;
import java.util.List;

public class Program {

    private List<Project> projects = new ArrayList<>();
    private List<Employee> employeeList = new ArrayList<>();
    int runingNumber = 0;

    public Program() {

    }

    public void addProject(Project project) {
        projects.add(project);
    }

    public void addProject(int year, String name) {
        runingNumber +=1;
        Project project = new Project(year,name,runingNumber);
        projects.add(project);
    }

    public boolean containsProjectWithName(String name) {
        return projects.stream().anyMatch(m -> m.getName().contentEquals(name));
    }

    public boolean hasProjectLeader() {
        return !(projects.get(0).getProjectLeader() == null);
    }

    public void addEmployee(Employee employee) {
        employeeList.add(employee);
    }

    public Employee getEmployee(Employee employee) {
        if(employee == null) {
            return employeeList.get(0);
        }
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

    public List<Project> getProjectList() {
        return projects;
    }

    public Project getProject(String name) {
        for (Project project1 : projects) {
            if (project1.getName().equals(name)) {
                return project1;
            }
        }
        return null;
    }

    public Project getProject(int number){
        for (Project project1 : projects) {
            if (project1.getNumber() == number) {
                    return project1;
            }
        }
        return null;
    }
}