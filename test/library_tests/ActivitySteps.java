package library_tests;

import Project.Employee;
import Project.Program;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import java.util.ArrayList;
import java.util.List;
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

    @Given("that project leader creates an activity for project {string} with time {double}, startweek {int}, endweek {int} and name {string}")
    public void that_project_leader_creates_an_activity_with_time_startdate_and_enddate(String projectName, double time, int startDate, int endDate, String activityName) throws Exception {
        program.getProject(projectName).createActivity(program.getEmployee(employee),time,startDate,endDate,activityName);
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

    @When("the employee with initials {string} records timespent {double} on an activity with name {string} in project {string}")
    public void theEmployeeRecordsTimespentOnAnActivity(String initials, double time, String activityName, String projectName) {
        program.getEmployee(initials).addTimeToActivity(program.getProject(projectName).getActivity(activityName),time);
    }

    @Then("the timespent {double} for employee with initials {string} is noted on the activity with name {string} in project {string}")
    public void theTimespentIsNotedOnTheActivity(double time, String initials,  String activityName, String projectName) {
        assertEquals(time,program.getEmployee(initials).getTimeRegister(program.getProject(projectName).getActivity(activityName)), 0.1);
    }

    @Given("an employee with initials {string} and timespent {double} on the activity {string} in project {string}")
    public void anEmployeeWithInitialsAndTimespentOnAnActivity(String initials, double time,String activityName,String projectName) {
        assertEquals(time,program.getEmployee(initials).getTimeRegister(program.getProject(projectName).getActivity(activityName)), 0.1);
    }

    @When("the employee with initials {string} wants to edit the timespent on the activity {string} in project {string} to {double}")
    public void theEmployeeWantsToEditTheTimespentOnTheActivityTo(String initials,String activityName,String projectName, double time) {
        program.getEmployee(initials).editTimeOnActivity(program.getProject(projectName).getActivity(activityName),time);
    }

    @Then("the timespent for employee with initials {string} in project {string} on activity {string} is updated to {double}")
    public void theTimespentIsUpdatedTo(String initials,String projectName,String activityName,double time) {
        assertEquals(time,program.getEmployee(initials).getTimeRegister(program.getProject(projectName).getActivity(activityName)), 0.1);
    }

    @Then("the total timespent {double} is noted on the activity {string} in project {string}")
    public void theTotalTimespentIsNotedOnTheActivity(double time,String activityName,String projectName) {
        double c = 0;
        for (Employee value : program.getProject(projectName).getActivity(activityName).getEmployeeList()) {
            c += value.getTimeRegister(program.getProject(projectName).getActivity(activityName));
        }
        assertEquals(time, c ,0.1);
    }

    @Then("the employee with initials {string} has worked for a total of {double} hours that day")
    public void theEmployeeWithInitialsHasWorkedForATotalOfHoursThatDay(String initials, double time) {
        assertEquals(time,program.getEmployee(initials).getTotalTime(),0.1);
    }

    @Given("An employee with initials {string} creates a fixed activity with name {string}, startweek {int} and endweek {int}")
    public void anEmployeeWithInitialsCreatesAFixedActivityWithNameStartdateAndEnddate(String initials, String fixedActivityName, int startWeek, int endWeek) {
        program.getEmployee(initials).createUnavailablety(fixedActivityName, startWeek,endWeek);
    }

    @Then("the fixed activty with name {string} is created attached to employee with initials {string}")
    public void theFixedActivtyWithNameIsCreatedAttachedToEmployeeWithInitials(String activityName, String initials) {
        assertTrue(program.getEmployee(initials).getUnavailableList().stream().anyMatch(m -> m.getName().contentEquals(activityName)));
    }


    @And("the employee with initials {string} is available between startweek {int} and endweek {int}")
    public void theEmployeeWithInitialsIsAvailableBetweenStartweekAndEndweek(String initials, int startweek, int endweek) {
        assertTrue(program.getEmployee(initials).isAvailable(startweek, endweek));
    }
}