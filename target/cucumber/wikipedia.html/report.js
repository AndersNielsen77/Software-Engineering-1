$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:use_cases/Addekstra_employee.feature");
formatter.feature({
  "name": "Assign another employee to an activity",
  "description": "  Description: An employee assign themselves to an activity\n  Actor: Employee",
  "keyword": "Feature"
});
formatter.background({
  "name": "",
  "description": "",
  "keyword": "Background"
});
formatter.step({
  "name": "a project with year 2020, name \"Fisk\"",
  "keyword": "Given "
});
formatter.match({
  "location": "library_tests.ProjectSteps.a_project_with_year_name_number(int,java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "an employee with initials \"ABCD\"",
  "keyword": "And "
});
formatter.match({
  "location": "library_tests.ProjectSteps.an_employee_with_initials(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the employee with initials \"ABCD\" is chosen as Project leader for project \"Fisk\"",
  "keyword": "When "
});
formatter.match({
  "location": "library_tests.ProjectSteps.the_employee_is_chosen_as_Projectleader(java.lang.String,java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "that project leader with initials \"ABCD\" creates an activity for project \"Fisk\" with time 10.5, startweek 19, endweek 21 and name \"Projekt\"",
  "keyword": "And "
});
formatter.match({
  "location": "library_tests.ActivitySteps.that_project_leader_creates_an_activity_with_time_startdate_and_enddate(java.lang.String,java.lang.String,double,int,int,java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "an employee with initials \"ADAG\"",
  "keyword": "And "
});
formatter.match({
  "location": "library_tests.ProjectSteps.an_employee_with_initials(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "an employee with initials \"GAFG\"",
  "keyword": "And "
});
formatter.match({
  "location": "library_tests.ProjectSteps.an_employee_with_initials(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "an employee with initials \"ADAG\" is attached to the activity with name \"Projekt\" on project \"Fisk\"",
  "keyword": "Given "
});
formatter.match({
  "location": "library_tests.ActivitySteps.an_employee_with_initials_is_attached_to_the_activity(java.lang.String,java.lang.String,java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the employee with initials \"ADAG\" records timespent 5.5 on an activity with name \"Projekt\" in project \"Fisk\"",
  "keyword": "When "
});
formatter.match({
  "location": "library_tests.TimeSteps.theEmployeeRecordsTimespentOnAnActivity(java.lang.String,double,java.lang.String,java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "An employee assign themselves to an activity to help out another employee",
  "description": "",
  "keyword": "Scenario"
});
formatter.step({
  "name": "an employee with initials \"GAFG\" is attached to the activity with name \"Projekt\" on project \"Fisk\"",
  "keyword": "Given "
});
formatter.match({
  "location": "library_tests.ActivitySteps.an_employee_with_initials_is_attached_to_the_activity(java.lang.String,java.lang.String,java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the employee with initials \"GAFG\" records timespent 7.5 on an activity with name \"Projekt\" in project \"Fisk\"",
  "keyword": "When "
});
formatter.match({
  "location": "library_tests.TimeSteps.theEmployeeRecordsTimespentOnAnActivity(java.lang.String,double,java.lang.String,java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the total timespent 13.0 is noted on the activity \"Projekt\" in project \"Fisk\"",
  "keyword": "Then "
});
formatter.match({
  "location": "library_tests.TimeSteps.theTotalTimespentIsNotedOnTheActivity(double,java.lang.String,java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.uri("file:use_cases/Choose_projectleader.feature");
formatter.feature({
  "name": "Choose project leader",
  "description": "  Description: An employee is chosen as a project leader\n  Actor: Employee",
  "keyword": "Feature"
});
formatter.background({
  "name": "A set of projects",
  "description": "",
  "keyword": "Background"
});
formatter.step({
  "name": "a project with year 2020, name \"Fisk\"",
  "keyword": "Given "
});
formatter.match({
  "location": "library_tests.ProjectSteps.a_project_with_year_name_number(int,java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the project with year 2020, name \"Fisk\", number 1 is created",
  "keyword": "Then "
});
formatter.match({
  "location": "library_tests.ProjectSteps.theProjectWithYearNameNumberIsCreated(int,java.lang.String,int)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "an employee with initials \"ABCD\"",
  "keyword": "And "
});
formatter.match({
  "location": "library_tests.ProjectSteps.an_employee_with_initials(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "Choose project leader",
  "description": "",
  "keyword": "Scenario"
});
formatter.step({
  "name": "there is a project \"Fisk\" without a project leader",
  "keyword": "Given "
});
formatter.match({
  "location": "library_tests.ProjectSteps.there_is_a_project_without_a_project_leader(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the employee with initials \"ABCD\" is chosen as Project leader for project \"Fisk\"",
  "keyword": "When "
});
formatter.match({
  "location": "library_tests.ProjectSteps.the_employee_is_chosen_as_Projectleader(java.lang.String,java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the employee is Project leader",
  "keyword": "Then "
});
formatter.match({
  "location": "library_tests.ProjectSteps.the_employee_with_initials_is_Projectleader()"
});
formatter.result({
  "status": "passed"
});
formatter.background({
  "name": "A set of projects",
  "description": "",
  "keyword": "Background"
});
formatter.step({
  "name": "a project with year 2020, name \"Fisk\"",
  "keyword": "Given "
});
formatter.match({
  "location": "library_tests.ProjectSteps.a_project_with_year_name_number(int,java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the project with year 2020, name \"Fisk\", number 1 is created",
  "keyword": "Then "
});
formatter.match({
  "location": "library_tests.ProjectSteps.theProjectWithYearNameNumberIsCreated(int,java.lang.String,int)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "an employee with initials \"ABCD\"",
  "keyword": "And "
});
formatter.match({
  "location": "library_tests.ProjectSteps.an_employee_with_initials(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "The project has a project leader",
  "description": "",
  "keyword": "Scenario"
});
formatter.step({
  "name": "there is a project \"Fisk\" without a project leader",
  "keyword": "Given "
});
formatter.match({
  "location": "library_tests.ProjectSteps.there_is_a_project_without_a_project_leader(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "an employee with initials \"ABCD\" who is chosen as project leader for project \"Fisk\"",
  "keyword": "And "
});
formatter.match({
  "location": "library_tests.ProjectSteps.anEmployeeWithInitialsWhoIsChosennAsProjectLeader(java.lang.String,java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "another employee with initials \"DFGH\" is chosen as project leader for project \"Fisk\"",
  "keyword": "When "
});
formatter.match({
  "location": "library_tests.ProjectSteps.anotherEmployeeWithInitialsIsChosenAsProjectLeaderForTheSameProject(java.lang.String,java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the error message \"There is already an existing project leader\" is given",
  "keyword": "Then "
});
formatter.match({
  "location": "library_tests.ProjectSteps.theErrorMessageIsGiven(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.uri("file:use_cases/Create_activity.feature");
formatter.feature({
  "name": "Create activities",
  "description": "  Description: The Project manager creates activities for a specific project\n  Actor: Project manager",
  "keyword": "Feature"
});
formatter.background({
  "name": "A set of projects",
  "description": "",
  "keyword": "Background"
});
formatter.step({
  "name": "a project with year 2020, name \"Fisk\"",
  "keyword": "Given "
});
formatter.match({
  "location": "library_tests.ProjectSteps.a_project_with_year_name_number(int,java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "an employee with initials \"ABCD\"",
  "keyword": "And "
});
formatter.match({
  "location": "library_tests.ProjectSteps.an_employee_with_initials(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "an employee with initials \"DGGF\"",
  "keyword": "And "
});
formatter.match({
  "location": "library_tests.ProjectSteps.an_employee_with_initials(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the employee with initials \"ABCD\" is chosen as Project leader for project \"Fisk\"",
  "keyword": "When "
});
formatter.match({
  "location": "library_tests.ProjectSteps.the_employee_is_chosen_as_Projectleader(java.lang.String,java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "that project leader with initials \"ABCD\" creates an activity for project \"Fisk\" with time 10.5, startweek 19, endweek 20 and name \"Projekt\"",
  "keyword": "And "
});
formatter.match({
  "location": "library_tests.ActivitySteps.that_project_leader_creates_an_activity_with_time_startdate_and_enddate(java.lang.String,java.lang.String,double,int,int,java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the project with year 2020, name \"Fisk\", number 1 is created",
  "keyword": "Then "
});
formatter.match({
  "location": "library_tests.ProjectSteps.theProjectWithYearNameNumberIsCreated(int,java.lang.String,int)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "an employee with initials \"JJKG\"",
  "keyword": "And "
});
formatter.match({
  "location": "library_tests.ProjectSteps.an_employee_with_initials(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "An employee with initials \"JJKG\" creates a fixed activity with name \"Ferie\", startweek 18 and endweek 20",
  "keyword": "When "
});
formatter.match({
  "location": "library_tests.FixedActivitiesSteps.anEmployeeWithInitialsCreatesAFixedActivityWithNameStartdateAndEnddate(java.lang.String,java.lang.String,int,int)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "An employee with initials \"DGGF\" creates a fixed activity with name \"Ferie\", startweek 10 and endweek 12",
  "keyword": "And "
});
formatter.match({
  "location": "library_tests.FixedActivitiesSteps.anEmployeeWithInitialsCreatesAFixedActivityWithNameStartdateAndEnddate(java.lang.String,java.lang.String,int,int)"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "Project leader create an activity",
  "description": "",
  "keyword": "Scenario"
});
formatter.step({
  "name": "an employee with initials \"ABCD\" who is a project leader",
  "keyword": "Given "
});
formatter.match({
  "location": "library_tests.ActivitySteps.an_employee_who_is_a_project_leader(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "that project leader with initials \"ABCD\" creates an activity for project \"Fisk\" with time 10.5, startweek 19, endweek 21 and name \"Projekt\"",
  "keyword": "And "
});
formatter.match({
  "location": "library_tests.ActivitySteps.that_project_leader_creates_an_activity_with_time_startdate_and_enddate(java.lang.String,java.lang.String,double,int,int,java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "an employee with initials \"DGGF\" is attached to the activity with name \"Projekt\" on project \"Fisk\"",
  "keyword": "When "
});
formatter.match({
  "location": "library_tests.ActivitySteps.an_employee_with_initials_is_attached_to_the_activity(java.lang.String,java.lang.String,java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the employee with initials \"DGGF\" is available between startweek 19 and endweek 21",
  "keyword": "And "
});
formatter.match({
  "location": "library_tests.ActivitySteps.theEmployeeWithInitialsIsAvailableBetweenStartweekAndEndweek(java.lang.String,int,int)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "activity \"Projekt\" with associated employee \"DGGF\" in project \"Fisk\" is created",
  "keyword": "Then "
});
formatter.match({
  "location": "library_tests.ActivitySteps.activity_with_associated_employee_is_created(java.lang.String,java.lang.String,java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.background({
  "name": "A set of projects",
  "description": "",
  "keyword": "Background"
});
formatter.step({
  "name": "a project with year 2020, name \"Fisk\"",
  "keyword": "Given "
});
formatter.match({
  "location": "library_tests.ProjectSteps.a_project_with_year_name_number(int,java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "an employee with initials \"ABCD\"",
  "keyword": "And "
});
formatter.match({
  "location": "library_tests.ProjectSteps.an_employee_with_initials(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "an employee with initials \"DGGF\"",
  "keyword": "And "
});
formatter.match({
  "location": "library_tests.ProjectSteps.an_employee_with_initials(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the employee with initials \"ABCD\" is chosen as Project leader for project \"Fisk\"",
  "keyword": "When "
});
formatter.match({
  "location": "library_tests.ProjectSteps.the_employee_is_chosen_as_Projectleader(java.lang.String,java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "that project leader with initials \"ABCD\" creates an activity for project \"Fisk\" with time 10.5, startweek 19, endweek 20 and name \"Projekt\"",
  "keyword": "And "
});
formatter.match({
  "location": "library_tests.ActivitySteps.that_project_leader_creates_an_activity_with_time_startdate_and_enddate(java.lang.String,java.lang.String,double,int,int,java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the project with year 2020, name \"Fisk\", number 1 is created",
  "keyword": "Then "
});
formatter.match({
  "location": "library_tests.ProjectSteps.theProjectWithYearNameNumberIsCreated(int,java.lang.String,int)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "an employee with initials \"JJKG\"",
  "keyword": "And "
});
formatter.match({
  "location": "library_tests.ProjectSteps.an_employee_with_initials(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "An employee with initials \"JJKG\" creates a fixed activity with name \"Ferie\", startweek 18 and endweek 20",
  "keyword": "When "
});
formatter.match({
  "location": "library_tests.FixedActivitiesSteps.anEmployeeWithInitialsCreatesAFixedActivityWithNameStartdateAndEnddate(java.lang.String,java.lang.String,int,int)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "An employee with initials \"DGGF\" creates a fixed activity with name \"Ferie\", startweek 10 and endweek 12",
  "keyword": "And "
});
formatter.match({
  "location": "library_tests.FixedActivitiesSteps.anEmployeeWithInitialsCreatesAFixedActivityWithNameStartdateAndEnddate(java.lang.String,java.lang.String,int,int)"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "Employee tries to create an activity for a given project",
  "description": "",
  "keyword": "Scenario"
});
formatter.step({
  "name": "an employee with initials \"AGAK\" who is not a project leader",
  "keyword": "Given "
});
formatter.match({
  "location": "library_tests.ActivitySteps.anEmployeeWithInitialsWhoIsNotAProjectLeader(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the employee tries to create an activity 10.5, startdate 20, enddate 33 and name \"Projekt2\" for the project \"Fisk\"",
  "keyword": "When "
});
formatter.match({
  "location": "library_tests.ActivitySteps.theEmployeeTriesToCreateAnActivityStartdateEnddateAndNameWithForAGivenProject(double,int,int,java.lang.String,java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the error message \"You are not the project leader\" is given",
  "keyword": "Then "
});
formatter.match({
  "location": "library_tests.ProjectSteps.theErrorMessageIsGiven(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.background({
  "name": "A set of projects",
  "description": "",
  "keyword": "Background"
});
formatter.step({
  "name": "a project with year 2020, name \"Fisk\"",
  "keyword": "Given "
});
formatter.match({
  "location": "library_tests.ProjectSteps.a_project_with_year_name_number(int,java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "an employee with initials \"ABCD\"",
  "keyword": "And "
});
formatter.match({
  "location": "library_tests.ProjectSteps.an_employee_with_initials(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "an employee with initials \"DGGF\"",
  "keyword": "And "
});
formatter.match({
  "location": "library_tests.ProjectSteps.an_employee_with_initials(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the employee with initials \"ABCD\" is chosen as Project leader for project \"Fisk\"",
  "keyword": "When "
});
formatter.match({
  "location": "library_tests.ProjectSteps.the_employee_is_chosen_as_Projectleader(java.lang.String,java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "that project leader with initials \"ABCD\" creates an activity for project \"Fisk\" with time 10.5, startweek 19, endweek 20 and name \"Projekt\"",
  "keyword": "And "
});
formatter.match({
  "location": "library_tests.ActivitySteps.that_project_leader_creates_an_activity_with_time_startdate_and_enddate(java.lang.String,java.lang.String,double,int,int,java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the project with year 2020, name \"Fisk\", number 1 is created",
  "keyword": "Then "
});
formatter.match({
  "location": "library_tests.ProjectSteps.theProjectWithYearNameNumberIsCreated(int,java.lang.String,int)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "an employee with initials \"JJKG\"",
  "keyword": "And "
});
formatter.match({
  "location": "library_tests.ProjectSteps.an_employee_with_initials(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "An employee with initials \"JJKG\" creates a fixed activity with name \"Ferie\", startweek 18 and endweek 20",
  "keyword": "When "
});
formatter.match({
  "location": "library_tests.FixedActivitiesSteps.anEmployeeWithInitialsCreatesAFixedActivityWithNameStartdateAndEnddate(java.lang.String,java.lang.String,int,int)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "An employee with initials \"DGGF\" creates a fixed activity with name \"Ferie\", startweek 10 and endweek 12",
  "keyword": "And "
});
formatter.match({
  "location": "library_tests.FixedActivitiesSteps.anEmployeeWithInitialsCreatesAFixedActivityWithNameStartdateAndEnddate(java.lang.String,java.lang.String,int,int)"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "Project leader tries to assign an unavailable employee to an activity",
  "description": "",
  "keyword": "Scenario"
});
formatter.step({
  "name": "an employee with initials \"ABCD\" who is a project leader",
  "keyword": "Given "
});
formatter.match({
  "location": "library_tests.ActivitySteps.an_employee_who_is_a_project_leader(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "an employee with initials \"JJKG\" is attached to the activity with name \"Projekt\" on project \"Fisk\"",
  "keyword": "When "
});
formatter.match({
  "location": "library_tests.ActivitySteps.an_employee_with_initials_is_attached_to_the_activity(java.lang.String,java.lang.String,java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the error message \"The employee is not available in that timeframe\" is given",
  "keyword": "Then "
});
formatter.match({
  "location": "library_tests.ProjectSteps.theErrorMessageIsGiven(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.uri("file:use_cases/Create_project.feature");
formatter.feature({
  "name": "Create project",
  "description": "  Description: User creates a project\n  Actor: User",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "Create project",
  "description": "",
  "keyword": "Scenario"
});
formatter.step({
  "name": "a project with year 2020, name \"Fisk\"",
  "keyword": "Given "
});
formatter.match({
  "location": "library_tests.ProjectSteps.a_project_with_year_name_number(int,java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the project with year 2020, name \"Fisk\", number 1 is created",
  "keyword": "Then "
});
formatter.match({
  "location": "library_tests.ProjectSteps.theProjectWithYearNameNumberIsCreated(int,java.lang.String,int)"
});
formatter.result({
  "status": "passed"
});
formatter.uri("file:use_cases/Edit_registered_hours.feature");
formatter.feature({
  "name": "Correct recorded data",
  "description": "  Description: An employee can see his total hours worked for the day\n  Actor: Employee",
  "keyword": "Feature"
});
formatter.background({
  "name": "A set of projects",
  "description": "",
  "keyword": "Background"
});
formatter.step({
  "name": "a project with year 2020, name \"Fisk\"",
  "keyword": "Given "
});
formatter.match({
  "location": "library_tests.ProjectSteps.a_project_with_year_name_number(int,java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "an employee with initials \"ABCD\"",
  "keyword": "And "
});
formatter.match({
  "location": "library_tests.ProjectSteps.an_employee_with_initials(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the employee with initials \"ABCD\" is chosen as Project leader for project \"Fisk\"",
  "keyword": "When "
});
formatter.match({
  "location": "library_tests.ProjectSteps.the_employee_is_chosen_as_Projectleader(java.lang.String,java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "that project leader with initials \"ABCD\" creates an activity for project \"Fisk\" with time 10.5, startweek 19, endweek 21 and name \"Projekt\"",
  "keyword": "And "
});
formatter.match({
  "location": "library_tests.ActivitySteps.that_project_leader_creates_an_activity_with_time_startdate_and_enddate(java.lang.String,java.lang.String,double,int,int,java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "an employee with initials \"ADAG\"",
  "keyword": "Given "
});
formatter.match({
  "location": "library_tests.ProjectSteps.an_employee_with_initials(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "an employee with initials \"ADAG\" is attached to the activity with name \"Projekt\" on project \"Fisk\"",
  "keyword": "And "
});
formatter.match({
  "location": "library_tests.ActivitySteps.an_employee_with_initials_is_attached_to_the_activity(java.lang.String,java.lang.String,java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the employee with initials \"ADAG\" records timespent 5.5 on an activity with name \"Projekt\" in project \"Fisk\"",
  "keyword": "When "
});
formatter.match({
  "location": "library_tests.TimeSteps.theEmployeeRecordsTimespentOnAnActivity(java.lang.String,double,java.lang.String,java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the project with year 2020, name \"Fisk\", number 1 is created",
  "keyword": "Then "
});
formatter.match({
  "location": "library_tests.ProjectSteps.theProjectWithYearNameNumberIsCreated(int,java.lang.String,int)"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "The employee corrects a registered activity",
  "description": "",
  "keyword": "Scenario"
});
formatter.step({
  "name": "an employee with initials \"ADAG\" and timespent 5.5 on the activity \"Projekt\" in project \"Fisk\"",
  "keyword": "Given "
});
formatter.match({
  "location": "library_tests.TimeSteps.anEmployeeWithInitialsAndTimespentOnAnActivity(java.lang.String,double,java.lang.String,java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the employee with initials \"ADAG\" wants to edit the timespent on the activity \"Projekt\" in project \"Fisk\" to 2.5",
  "keyword": "When "
});
formatter.match({
  "location": "library_tests.TimeSteps.theEmployeeWantsToEditTheTimespentOnTheActivityTo(java.lang.String,java.lang.String,java.lang.String,double)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the timespent for employee with initials \"ADAG\" in project \"Fisk\" on activity \"Projekt\" is updated to 2.5",
  "keyword": "Then "
});
formatter.match({
  "location": "library_tests.TimeSteps.theTimespentIsUpdatedTo(java.lang.String,java.lang.String,java.lang.String,double)"
});
formatter.result({
  "status": "passed"
});
formatter.uri("file:use_cases/Fixed_activity.feature");
formatter.feature({
  "name": "Fixed activities",
  "description": "  Description: An employee records vacation/illness etc. in the system (as a fixed activity)\n  Actor: Employee",
  "keyword": "Feature"
});
formatter.background({
  "name": "",
  "description": "",
  "keyword": "Background"
});
formatter.step({
  "name": "an employee with initials \"ABCD\"",
  "keyword": "And "
});
formatter.match({
  "location": "library_tests.ProjectSteps.an_employee_with_initials(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "An employee registers a fixed activity",
  "description": "",
  "keyword": "Scenario"
});
formatter.step({
  "name": "An employee with initials \"ABCD\" creates a fixed activity with name \"Ferie\", startweek 10 and endweek 12",
  "keyword": "Given "
});
formatter.match({
  "location": "library_tests.FixedActivitiesSteps.anEmployeeWithInitialsCreatesAFixedActivityWithNameStartdateAndEnddate(java.lang.String,java.lang.String,int,int)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the fixed activty with name \"Ferie\" is created attached to employee with initials \"ABCD\"",
  "keyword": "Then "
});
formatter.match({
  "location": "library_tests.FixedActivitiesSteps.theFixedActivtyWithNameIsCreatedAttachedToEmployeeWithInitials(java.lang.String,java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.uri("file:use_cases/Register_hours.feature");
formatter.feature({
  "name": "Records hours",
  "description": "  Description: An employee records a number of hours spent on a given activity.actor: Employee\n  Actor: Employee",
  "keyword": "Feature"
});
formatter.background({
  "name": "A set of projects",
  "description": "",
  "keyword": "Background"
});
formatter.step({
  "name": "a project with year 2020, name \"Fisk\"",
  "keyword": "Given "
});
formatter.match({
  "location": "library_tests.ProjectSteps.a_project_with_year_name_number(int,java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "an employee with initials \"ABCD\"",
  "keyword": "And "
});
formatter.match({
  "location": "library_tests.ProjectSteps.an_employee_with_initials(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "an employee with initials \"ADAG\"",
  "keyword": "And "
});
formatter.match({
  "location": "library_tests.ProjectSteps.an_employee_with_initials(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the employee with initials \"ABCD\" is chosen as Project leader for project \"Fisk\"",
  "keyword": "When "
});
formatter.match({
  "location": "library_tests.ProjectSteps.the_employee_is_chosen_as_Projectleader(java.lang.String,java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "that project leader with initials \"ABCD\" creates an activity for project \"Fisk\" with time 10.5, startweek 19, endweek 21 and name \"Projekt\"",
  "keyword": "And "
});
formatter.match({
  "location": "library_tests.ActivitySteps.that_project_leader_creates_an_activity_with_time_startdate_and_enddate(java.lang.String,java.lang.String,double,int,int,java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the project with year 2020, name \"Fisk\", number 1 is created",
  "keyword": "Then "
});
formatter.match({
  "location": "library_tests.ProjectSteps.theProjectWithYearNameNumberIsCreated(int,java.lang.String,int)"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "Employee records hours",
  "description": "",
  "keyword": "Scenario"
});
formatter.step({
  "name": "an employee with initials \"ADAG\"",
  "keyword": "Given "
});
formatter.match({
  "location": "library_tests.ProjectSteps.an_employee_with_initials(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "an employee with initials \"ADAG\" is attached to the activity with name \"Projekt\" on project \"Fisk\"",
  "keyword": "And "
});
formatter.match({
  "location": "library_tests.ActivitySteps.an_employee_with_initials_is_attached_to_the_activity(java.lang.String,java.lang.String,java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the employee with initials \"ADAG\" records timespent 5.5 on an activity with name \"Projekt\" in project \"Fisk\"",
  "keyword": "When "
});
formatter.match({
  "location": "library_tests.TimeSteps.theEmployeeRecordsTimespentOnAnActivity(java.lang.String,double,java.lang.String,java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the timespent 5.5 for employee with initials \"ADAG\" is noted on the activity with name \"Projekt\" in project \"Fisk\"",
  "keyword": "Then "
});
formatter.match({
  "location": "library_tests.TimeSteps.theTimespentIsNotedOnTheActivity(double,java.lang.String,java.lang.String,java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.uri("file:use_cases/Report_on_project.feature");
formatter.feature({
  "name": "Report on project",
  "description": "  Description: The project manager assigns an employee to an activity\n  Actor: Project manager",
  "keyword": "Feature"
});
formatter.background({
  "name": "",
  "description": "",
  "keyword": "Background"
});
formatter.step({
  "name": "a project with year 2020, name \"Fisk\"",
  "keyword": "Given "
});
formatter.match({
  "location": "library_tests.ProjectSteps.a_project_with_year_name_number(int,java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "an employee with initials \"ABCD\"",
  "keyword": "And "
});
formatter.match({
  "location": "library_tests.ProjectSteps.an_employee_with_initials(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "an employee with initials \"ADAG\"",
  "keyword": "Given "
});
formatter.match({
  "location": "library_tests.ProjectSteps.an_employee_with_initials(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "an employee with initials \"FFGK\"",
  "keyword": "Given "
});
formatter.match({
  "location": "library_tests.ProjectSteps.an_employee_with_initials(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the employee with initials \"ABCD\" is chosen as Project leader for project \"Fisk\"",
  "keyword": "When "
});
formatter.match({
  "location": "library_tests.ProjectSteps.the_employee_is_chosen_as_Projectleader(java.lang.String,java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "that project leader with initials \"ABCD\" creates an activity for project \"Fisk\" with time 10.5, startweek 19, endweek 21 and name \"status\"",
  "keyword": "And "
});
formatter.match({
  "location": "library_tests.ActivitySteps.that_project_leader_creates_an_activity_with_time_startdate_and_enddate(java.lang.String,java.lang.String,double,int,int,java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "that project leader with initials \"ABCD\" creates an activity for project \"Fisk\" with time 10.5, startweek 19, endweek 21 and name \"ProjektStart\"",
  "keyword": "And "
});
formatter.match({
  "location": "library_tests.ActivitySteps.that_project_leader_creates_an_activity_with_time_startdate_and_enddate(java.lang.String,java.lang.String,double,int,int,java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "an employee with initials \"ADAG\" is attached to the activity with name \"Status\" on project \"Fisk\"",
  "keyword": "And "
});
formatter.match({
  "location": "library_tests.ActivitySteps.an_employee_with_initials_is_attached_to_the_activity(java.lang.String,java.lang.String,java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the employee with initials \"ADAG\" records timespent 5.5 on an activity with name \"Status\" in project \"Fisk\"",
  "keyword": "When "
});
formatter.match({
  "location": "library_tests.TimeSteps.theEmployeeRecordsTimespentOnAnActivity(java.lang.String,double,java.lang.String,java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "an employee with initials \"FFGK\" is attached to the activity with name \"ProjektStart\" on project \"Fisk\"",
  "keyword": "And "
});
formatter.match({
  "location": "library_tests.ActivitySteps.an_employee_with_initials_is_attached_to_the_activity(java.lang.String,java.lang.String,java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the employee with initials \"FFGK\" records timespent 8.5 on an activity with name \"ProjektStart\" in project \"Fisk\"",
  "keyword": "When "
});
formatter.match({
  "location": "library_tests.TimeSteps.theEmployeeRecordsTimespentOnAnActivity(java.lang.String,double,java.lang.String,java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "The project manager draws a time report on the project",
  "description": "",
  "keyword": "Scenario"
});
formatter.step({
  "name": "a project leader that pulls a report on project \"Fisk\"",
  "keyword": "Given "
});
formatter.match({
  "location": "library_tests.ProjectSteps.aProjectLeaderThatPullsAReportOnProject(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "that report on project \"Fisk\" is pulled and reportcreated is updated to message \"Report have been created\"",
  "keyword": "Then "
});
formatter.match({
  "location": "library_tests.ProjectSteps.thatReportOnProjectIsPulledAndReportcreatedIsUpdatedToMessage(java.lang.String,java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.uri("file:use_cases/Total_hours_worked.feature");
formatter.feature({
  "name": "Total hours worked",
  "description": "  Description: An employee can see his total hours worked for the day\n  Actor: Employee",
  "keyword": "Feature"
});
formatter.background({
  "name": "",
  "description": "",
  "keyword": "Background"
});
formatter.step({
  "name": "a project with year 2020, name \"Fisk\"",
  "keyword": "Given "
});
formatter.match({
  "location": "library_tests.ProjectSteps.a_project_with_year_name_number(int,java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "an employee with initials \"ABCD\"",
  "keyword": "And "
});
formatter.match({
  "location": "library_tests.ProjectSteps.an_employee_with_initials(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "an employee with initials \"ADAG\"",
  "keyword": "And "
});
formatter.match({
  "location": "library_tests.ProjectSteps.an_employee_with_initials(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the employee with initials \"ABCD\" is chosen as Project leader for project \"Fisk\"",
  "keyword": "When "
});
formatter.match({
  "location": "library_tests.ProjectSteps.the_employee_is_chosen_as_Projectleader(java.lang.String,java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "that project leader with initials \"ABCD\" creates an activity for project \"Fisk\" with time 10.5, startweek 19, endweek 21 and name \"Projekt\"",
  "keyword": "And "
});
formatter.match({
  "location": "library_tests.ActivitySteps.that_project_leader_creates_an_activity_with_time_startdate_and_enddate(java.lang.String,java.lang.String,double,int,int,java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "that project leader with initials \"ABCD\" creates an activity for project \"Fisk\" with time 10.5, startweek 19, endweek 21 and name \"Projekt2\"",
  "keyword": "And "
});
formatter.match({
  "location": "library_tests.ActivitySteps.that_project_leader_creates_an_activity_with_time_startdate_and_enddate(java.lang.String,java.lang.String,double,int,int,java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "an employee with initials \"ADAG\" is attached to the activity with name \"Projekt\" on project \"Fisk\"",
  "keyword": "Given "
});
formatter.match({
  "location": "library_tests.ActivitySteps.an_employee_with_initials_is_attached_to_the_activity(java.lang.String,java.lang.String,java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "an employee with initials \"ADAG\" is attached to the activity with name \"Projekt2\" on project \"Fisk\"",
  "keyword": "Given "
});
formatter.match({
  "location": "library_tests.ActivitySteps.an_employee_with_initials_is_attached_to_the_activity(java.lang.String,java.lang.String,java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "Get total number of hours",
  "description": "",
  "keyword": "Scenario"
});
formatter.step({
  "name": "the employee with initials \"ADAG\" records timespent 7.5 on an activity with name \"Projekt\" in project \"Fisk\"",
  "keyword": "Given "
});
formatter.match({
  "location": "library_tests.TimeSteps.theEmployeeRecordsTimespentOnAnActivity(java.lang.String,double,java.lang.String,java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the employee with initials \"ADAG\" records timespent 5.5 on an activity with name \"Projekt\" in project \"Fisk\"",
  "keyword": "And "
});
formatter.match({
  "location": "library_tests.TimeSteps.theEmployeeRecordsTimespentOnAnActivity(java.lang.String,double,java.lang.String,java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the employee with initials \"ADAG\" has worked for a total of 13.0 hours that day",
  "keyword": "Then "
});
formatter.match({
  "location": "library_tests.TimeSteps.theEmployeeWithInitialsHasWorkedForATotalOfHoursThatDay(java.lang.String,double)"
});
formatter.result({
  "status": "passed"
});
});