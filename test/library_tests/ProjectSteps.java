package library_tests;

import Project.Employee;
import Project.Program;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import static org.junit.Assert.*;

public class ProjectSteps {
    private Employee employee;
    private Program program;
    private ErrorMessage errorMessage;

    public ProjectSteps(Program program, ErrorMessage errorMessage) {
        this.program = program;
        this.errorMessage = errorMessage;
    }

    @Given("a project with year {int}, name {string}")
    public void a_project_with_year_name_number(int year, String projectName) {
        program.addProject(year, projectName);
    }

    @When("the project {string} with year {int} is created")
    public void the_project_is_created(String projectName, int year) {
        program.addProject(year, projectName);
    }

    @Then("the project with year {int}, name {string}, number {int} is created")
    public void theProjectWithYearNameNumberIsCreated(int year, String projectName, int number) {
        assertTrue(program.containsProjectWithName(projectName));
        assertEquals(number, program.getProject(projectName).getNumber());
        assertEquals(year, program.getProject(projectName).getYear());
    }


    @Given("there is a project {string} without a project leader")
    public void there_is_a_project_without_a_project_leader(String projectName) {
        assertFalse(program.hasProjectLeader(projectName));
    }

    @Given("an employee with initials {string}")
    public void an_employee_with_initials(String initials) {
        employee = new Employee(initials);
        program.addEmployee(employee);
    }

    @When("the employee with initials {string} is chosen as Project leader for project {string}")
    public void the_employee_is_chosen_as_Projectleader(String initials,String projectName) throws Exception {
        program.getProject(projectName).setProjectLeader(program.getEmployee(initials));
    }

    @Then("the employee is Project leader")
    public void the_employee_with_initials_is_Projectleader() {
        assertTrue(employee.getIsProjectLeader());
    }


    @And("an employee with initials {string} who is chosen as project leader for project {string}")
    public void anEmployeeWithInitialsWhoIsChosennAsProjectLeader(String initials,String projectName) throws Exception {
        employee = new Employee(initials);
        program.addEmployee(employee);
        program.getProject(projectName).setProjectLeader(program.getEmployee(employee));
    }

    @When("another employee with initials {string} is chosen as project leader for project {string}")
    public void anotherEmployeeWithInitialsIsChosenAsProjectLeaderForTheSameProject(String initials,String projectName) throws Exception {
        employee = new Employee(initials);
        try {
            program.getProject(projectName).setProjectLeader(employee);
        } catch(Exception e) {
            errorMessage.setErrorMessage(e.getMessage());
        }
    }

    @Then("the error message {string} is given")
    public void theErrorMessageIsGiven(String errorMessage) {
        assertEquals(errorMessage, this.errorMessage.getErrorMessage());
    }

    @Given("a project leader that pulls a report on project {string}")
    public void aProjectLeaderThatPullsAReportOnProject(String projectName) {
        program.getProject(projectName).getReport();
    }

    @Then("that report on project {string} is pulled and reportcreated is updated to message {string}")
    public void thatReportOnProjectIsPulledAndReportcreatedIsUpdatedToMessage(String projectName, String message) {
        assertEquals(program.getProject(projectName).getReportCreated(),message);
    }
}

