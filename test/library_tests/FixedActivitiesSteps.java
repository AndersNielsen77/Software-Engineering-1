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

public class FixedActivitiesSteps {
    private Program program;

    public FixedActivitiesSteps(Program program) {
        this.program = program;
    }

    @Given("An employee with initials {string} creates a fixed activity with name {string}, startweek {int} and endweek {int}")
    public void anEmployeeWithInitialsCreatesAFixedActivityWithNameStartdateAndEnddate(String initials, String fixedActivityName, int startWeek, int endWeek) {
        program.getEmployee(initials).createUnavailablety(fixedActivityName, startWeek,endWeek);
    }

    @Then("the fixed activty with name {string} is created attached to employee with initials {string}")
    public void theFixedActivtyWithNameIsCreatedAttachedToEmployeeWithInitials(String activityName, String initials) {
        assertTrue(program.getEmployee(initials).getUnavailableList().stream().anyMatch(m -> m.getName().contentEquals(activityName)));
    }

}