package library_tests;

import io.cucumber.java.an.E;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import Project.Employee;
import Project.Program;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

public class ActivitySteps {
    private Program program;
    private ErrorMessage errorMessage;
   // private Activity activity;
    private Employee employee = null;


    public ActivitySteps(Program program, ErrorMessage errorMessage) {
        this.program = program;
        this.errorMessage = errorMessage;
    }


    @Given("an employee with initials {string} who is a project leader")
    public void an_employee_who_is_a_project_leader(String initials) {
        assertTrue(program.getEmployee(initials).getIsProjectLeader());
    }

    @Given("that project leader creates an activity for project {int} with time {double}, startweek {int}, endweek {int} and name {string}")
    public void that_project_leader_creates_an_activity_with_time_startdate_and_enddate(int projectnumber, double time, int startDate, int endDate, String name) throws Exception {
        program.getProject(projectnumber).createActivity(program.getEmployee(employee),time,startDate,endDate,name);
    }

    @When("an employee with initials {string} is attached to the activity with name {string} on project {int}")
    public void an_employee_with_initials_is_attached_to_the_activity(String initials, String activityName, int projectnumber) throws Exception {
        try {
            program.getProject(projectnumber).getActivity(activityName).addEmployee(program.getEmployee(initials));
        } catch(Exception e) {
            errorMessage.setErrorMessage(e.getMessage());
        }
    }

    @Then("activity with associated employee is created")
    public void activity_with_associated_employee_is_created() {
        assertEquals(employee,program.getProjectList().get(0).getActivity("Projekt").getEmployee(employee));
    }

    @Given("an employee with initials {string} who is not a project leader")
    public void anEmployeeWithInitialsWhoIsNotAProjectLeader(String initials) {
        employee = new Employee(initials);
        assertNotEquals(employee,program.getProjectList().get(0).getProjectLeader());
    }

    @When("the employee tries to create an activity {double}, startdate {int}, enddate {int} and name {string} with for a given project")
    public void theEmployeeTriesToCreateAnActivityStartdateEnddateAndNameWithForAGivenProject(double time, int startdate, int enddate, String name) {
        try{
            program.getProjectList().get(0).createActivity(employee,time,startdate,enddate,name);
        } catch(Exception e) {
            errorMessage.setErrorMessage(e.getMessage());
        }
    }


    @When("the employee with initials {string} records timespent {double} on an activity with name {string}")
    public void theEmployeeRecordsTimespentOnAnActivity(String initials, double time, String activityName) {
        program.getEmployee(initials).addTimeToActivity(program.getProjectList().get(0).getActivity(activityName),time);
    }

    @Then("the timespent {double} for employee with initials {string} is noted on the activity with name {string}")
    public void theTimespentIsNotedOnTheActivity(double time, String initials,  String activityName) {
        assertEquals(time,program.getEmployee(initials).getTimeRegister(program.getProjectList().get(0).getActivity(activityName)), 0.1);
    }

    @Given("an employee with initials {string} and timespent {double} on an activity")
    public void anEmployeeWithInitialsAndTimespentOnAnActivity(String initials, double time) {
        assertEquals(time,program.getEmployee(initials).getTimeRegister(program.getProjectList().get(0).getActivityList().get(0)), 0.1);
    }

    @When("the employee with initials {string} wants to edit the timespent on the activity to {double}")
    public void theEmployeeWantsToEditTheTimespentOnTheActivityTo(String initials, double time) {
        program.getEmployee(initials).editTimeOnActivity(program.getProjectList().get(0).getActivityList().get(0),time);
    }


    @Then("the timespent for employee with initials {string} is updated to {double}")
    public void theTimespentIsUpdatedTo(String initials, double time) {
        assertEquals(time,program.getEmployee(initials).getTimeRegister(program.getProjectList().get(0).getActivityList().get(0)), 0.1);
    }

    @Then("the total timespent {double} is noted on the activity")
    public void theTotalTimespentIsNotedOnTheActivity(double time) {
        List<Employee> counter = new ArrayList<>();
        double c = 0;
        counter = program.getProjectList().get(0).getActivityList().get(0).getEmployeeList();
        for (Employee value : counter) {
            c += value.getTimeRegister(program.getProjectList().get(0).getActivityList().get(0));
        }
        assertEquals(time, c ,0.1);
    }

    @Then("the employee with initials {string} has worked for a total of {double} hours that day")
    public void theEmployeeWithInitialsHasWorkedForATotalOfHoursThatDay(String initials, double time) {
        assertEquals(time,program.getEmployee(initials).getTotalTime(),0.1);
    }

    @Given("An employee with initials {string} creates a fixed activity with name {string}, startweek {int} and endweek {int}")
    public void anEmployeeWithInitialsCreatesAFixedActivityWithNameStartdateAndEnddate(String initials, String name, int startweek, int endweek) {
        program.getEmployee(initials).createUnavailablety(name,startweek,endweek);
    }

    @Then("the fixed activty with name {string} is created attached to employee with initials {string}")
    public void theFixedActivtyWithNameIsCreatedAttachedToEmployeeWithInitials(String name, String initials) {
        assertTrue(program.getEmployee(initials).getUnavailableList().stream().anyMatch(m -> m.getName().contentEquals(name)));
    }

}
