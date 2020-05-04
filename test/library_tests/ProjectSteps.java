package library_tests;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import Project.Employee;
import Project.Program;
import Project.Project;
import Project.ProjectLeader;

import static org.junit.Assert.*;

public class ProjectSteps {
    private ProjectLeader projectleader;
    private Project project;
    private Employee employee;
    private Program program;
    private ErrorMessage errorMessage;

    public ProjectSteps(Program program, ErrorMessage errorMessage) {
        this.program = program;
        this.errorMessage = errorMessage;
    }

    @Given("a project with year {int}, name {string}, number {int}")
    public void a_project_with_year_name_number(int year, String name, int number) {
        project = new Project(year, name, number);
    }

    @When("the project is created")
    public void the_project_is_created() {
        program.addProject(project);
    }

    @Then("the project with year {int}, name {string}, number {int} is created")
    public void theProjectWithYearNameNumberIsCreated(int year, String name, int number) {
        assertTrue(program.containsProjectWithName(name));
    }


    @Given("there is a project without a project leader")
    public void there_is_a_project_without_a_project_leader() {
        assertFalse(program.hasProjectLeader());
    }

    @Given("an employee with initials {string}")
    public void an_employee_with_initials(String initials) {
        employee = new Employee(initials);
        program.addEmployee(employee);
    }

    @When("the employee with initials {string} is chosen as Project leader")
    public void the_employee_is_chosen_as_Projectleader(String initials) throws Exception {
        project.setProjectLeader(program.getEmployee(initials));
    }

    @Then("the employee with initials {string} is Project leader")
    public void the_employee_with_initials_is_Projectleader(String string) {
        assertTrue(employee.getIsProjectLeader());
    }


    @And("an employee with initials {string} who is chosen as project leader")
    public void anEmployeeWithInitialsWhoIsChosennAsProjectLeader(String initials) throws Exception {
        employee = new Employee(initials);
        program.addEmployee(employee);
        project.setProjectLeader(program.getEmployee(employee));
    }

    @When("another employee with initials {string} is chosen as project leader for the same project")
    public void anotherEmployeeWithInitialsIsChosenAsProjectLeaderForTheSameProject(String initials) throws Exception {
        employee = new Employee(initials);
        try {
            project.setProjectLeader(employee);
        } catch(Exception e) {
            errorMessage.setErrorMessage(e.getMessage());
        }
    }

    @Then("the error message {string} is given")
    public void theErrorMessageIsGiven(String errormessage) {
        assertEquals(errormessage, this.errorMessage.getErrorMessage());
    }

    @Given("a project leader that pulls a report on project {int}")
    public void aProjectLeaderThatPullsAReportOnProject(int project) {
        program.getProject(project).getReport();
    }

    @Then("that report on project {int} is pulled and reportcreated is updated to message {string}")
    public void thatReportOnProjectIsPulledAndReportcreatedIsUpdatedToMessage(int project, String message) {
        assertEquals(program.getProject(project).getReportCreated(),message);
    }
}

