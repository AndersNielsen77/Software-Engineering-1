// Mikkel Rahbek s194298
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

public class TimeSteps {

    private Program program;

    public TimeSteps(Program program) {
        this.program = program;
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

}
