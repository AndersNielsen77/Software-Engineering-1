package Project;

import java.util.ArrayList;
import java.util.List;

public class Program {

    private List<Project> projects = new ArrayList<>();
    private List<Employee> employeeList = new ArrayList<>();
    int runingNumber = 0;

    public void addProject(int year, String name) {
        runingNumber +=1;
        Project project = new Project(year,name,runingNumber);
        projects.add(project);
    }

    public boolean containsProjectWithName(String name) {
        return projects.stream().anyMatch(m -> m.getName().contentEquals(name));
    }

    public boolean hasProjectLeader(String projectName) {
        return !(getProject(projectName).getProjectLeader() == null);
    }

    public void addEmployee(Employee employee) {
        employeeList.add(employee);
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
        }return null;
    }
}