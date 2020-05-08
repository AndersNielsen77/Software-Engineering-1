// Anders Nielsen s194299
package library_tests;

import Project.Employee;
import Project.Program;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import static org.junit.Assert.*;

public class ActivitySteps {
    private Program program;
    private ErrorMessage errorMessage;
    private Employee employee = null;

    public ActivitySteps(Program program, ErrorMessage errorMessage) {
        this.program = program;
        this.errorMessage = errorMessage;
    }

    @Given("an employee with initials {string} who is a project leader")
    public void an_employee_who_is_a_project_leader(String initials) {
        assertTrue(program.getEmployee(initials).getIsProjectLeader());
    }

    @Given("that project leader with initials {string} creates an activity for project {string} with time {double}, startweek {int}, endweek {int} and name {string}")
    public void that_project_leader_creates_an_activity_with_time_startdate_and_enddate(String initials, String projectName, double time, int startDate, int endDate, String activityName) throws Exception {
        program.getProject(projectName).createActivity(program.getEmployee(initials),time,startDate,endDate,activityName);
    }

    @When("an employee with initials {string} is attached to the activity with name {string} on project {string}")
    public void an_employee_with_initials_is_attached_to_the_activity(String initials, String activityName, String projectName) throws Exception {
        try {
            program.getProject(projectName).getActivity(activityName).addEmployee(program.getEmployee(initials));
        } catch(Exception e) {
            errorMessage.setErrorMessage(e.getMessage());
        }
    }

    @Then("activity {string} with associated employee {string} in project {string} is created")
    public void activity_with_associated_employee_is_created(String activityName,String initials,String projectName) {
        assertEquals(initials,program.getProject(projectName).getActivity(activityName).getEmployee(initials).getInitials());
    }

    @Given("an employee with initials {string} who is not a project leader")
    public void anEmployeeWithInitialsWhoIsNotAProjectLeader(String initials) {
        employee = new Employee(initials);
        assertNotEquals(employee,program.getProjectList().get(0).getProjectLeader());
    }

    @When("the employee tries to create an activity {double}, startdate {int}, enddate {int} and name {string} for the project {string}")
    public void theEmployeeTriesToCreateAnActivityStartdateEnddateAndNameWithForAGivenProject(double time, int startdate, int enddate, String activityName, String projectName) {
        try{
            program.getProject(projectName).createActivity(employee,time,startdate,enddate, activityName);
        } catch(Exception e) {
            errorMessage.setErrorMessage(e.getMessage());
        }
    }

    @And("the employee with initials {string} is available between startweek {int} and endweek {int}")
    public void theEmployeeWithInitialsIsAvailableBetweenStartweekAndEndweek(String initials, int startweek, int endweek) {
        assertTrue(program.getEmployee(initials).isAvailable(startweek, endweek));
    }
}