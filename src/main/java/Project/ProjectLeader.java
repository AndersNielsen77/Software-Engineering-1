package Project;

public class ProjectLeader {
    private Employee employee;


    public ProjectLeader(Employee employee) {
        this.employee = employee;
    }

    public Employee getProjectLeader(){
        return this.employee;
    }
}