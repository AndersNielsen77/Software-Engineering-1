package Project;

public class ProjectLeader {
    private Project project;
    private int projectNumber;
    private Employee employee;

    public ProjectLeader(Employee employee, int projectNumber) {
        this.employee = employee;
        this.projectNumber = projectNumber;
    }

    public Employee getProjectLeader(){
        return this.employee;
    }
}
