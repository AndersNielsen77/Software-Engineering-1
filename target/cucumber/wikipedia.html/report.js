$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:use_cases/Fasteaktiviteter.feature");
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
  "location": "library_tests.ActivitySteps.anEmployeeWithInitialsCreatesAFixedActivityWithNameStartdateAndEnddate(java.lang.String,java.lang.String,int,int)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the fixed activty with name \"Ferie\" is created attached to employee with initials \"ABCD\"",
  "keyword": "Then "
});
formatter.match({
  "location": "library_tests.ActivitySteps.theFixedActivtyWithNameIsCreatedAttachedToEmployeeWithInitials(java.lang.String,java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.uri("file:use_cases/Opretteaktiviter.feature");
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
  "name": "a project with year 2020, name \"Fisk\", number 1",
  "keyword": "Given "
});
formatter.match({
  "location": "library_tests.ProjectSteps.a_project_with_year_name_number(int,java.lang.String,int)"
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
  "name": "the employee with initials \"ABCD\" is chosen as Project leader",
  "keyword": "When "
});
formatter.match({
  "location": "library_tests.ProjectSteps.the_employee_is_chosen_as_Projectleader(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the project is created",
  "keyword": "When "
});
formatter.match({
  "location": "library_tests.ProjectSteps.the_project_is_created()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "that project leader creates an activity for project 1 with time 10.5, startweek 19, endweek 21 and name \"Projekt\"",
  "keyword": "And "
});
formatter.match({
  "location": "library_tests.ActivitySteps.that_project_leader_creates_an_activity_with_time_startdate_and_enddate(int,double,int,int,java.lang.String)"
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
  "location": "library_tests.ActivitySteps.anEmployeeWithInitialsCreatesAFixedActivityWithNameStartdateAndEnddate(java.lang.String,java.lang.String,int,int)"
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
  "name": "that project leader creates an activity for project 1 with time 10.5, startweek 19, endweek 21 and name \"Projekt\"",
  "keyword": "And "
});
formatter.match({
  "location": "library_tests.ActivitySteps.that_project_leader_creates_an_activity_with_time_startdate_and_enddate(int,double,int,int,java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "an employee with initials \"DGGF\" is attached to the activity with name \"Projekt\" on project 1",
  "keyword": "When "
});
formatter.match({
  "location": "library_tests.ActivitySteps.an_employee_with_initials_is_attached_to_the_activity(java.lang.String,java.lang.String,int)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "activity with associated employee is created",
  "keyword": "Then "
});
formatter.match({
  "location": "library_tests.ActivitySteps.activity_with_associated_employee_is_created()"
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
  "name": "a project with year 2020, name \"Fisk\", number 1",
  "keyword": "Given "
});
formatter.match({
  "location": "library_tests.ProjectSteps.a_project_with_year_name_number(int,java.lang.String,int)"
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
  "name": "the employee with initials \"ABCD\" is chosen as Project leader",
  "keyword": "When "
});
formatter.match({
  "location": "library_tests.ProjectSteps.the_employee_is_chosen_as_Projectleader(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the project is created",
  "keyword": "When "
});
formatter.match({
  "location": "library_tests.ProjectSteps.the_project_is_created()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "that project leader creates an activity for project 1 with time 10.5, startweek 19, endweek 21 and name \"Projekt\"",
  "keyword": "And "
});
formatter.match({
  "location": "library_tests.ActivitySteps.that_project_leader_creates_an_activity_with_time_startdate_and_enddate(int,double,int,int,java.lang.String)"
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
  "location": "library_tests.ActivitySteps.anEmployeeWithInitialsCreatesAFixedActivityWithNameStartdateAndEnddate(java.lang.String,java.lang.String,int,int)"
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
  "name": "the employee tries to create an activity 10.5, startdate 2003, enddate 3003 and name \"Projekt2\" with for a given project",
  "keyword": "When "
});
formatter.match({
  "location": "library_tests.ActivitySteps.theEmployeeTriesToCreateAnActivityStartdateEnddateAndNameWithForAGivenProject(double,int,int,java.lang.String)"
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
  "name": "a project with year 2020, name \"Fisk\", number 1",
  "keyword": "Given "
});
formatter.match({
  "location": "library_tests.ProjectSteps.a_project_with_year_name_number(int,java.lang.String,int)"
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
  "name": "the employee with initials \"ABCD\" is chosen as Project leader",
  "keyword": "When "
});
formatter.match({
  "location": "library_tests.ProjectSteps.the_employee_is_chosen_as_Projectleader(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the project is created",
  "keyword": "When "
});
formatter.match({
  "location": "library_tests.ProjectSteps.the_project_is_created()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "that project leader creates an activity for project 1 with time 10.5, startweek 19, endweek 21 and name \"Projekt\"",
  "keyword": "And "
});
formatter.match({
  "location": "library_tests.ActivitySteps.that_project_leader_creates_an_activity_with_time_startdate_and_enddate(int,double,int,int,java.lang.String)"
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
  "location": "library_tests.ActivitySteps.anEmployeeWithInitialsCreatesAFixedActivityWithNameStartdateAndEnddate(java.lang.String,java.lang.String,int,int)"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "Project leader tries to assign an unavailiable employee to an activity",
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
  "name": "an employee with initials \"JJKG\" is attached to the activity with name \"Projekt\" on project 1",
  "keyword": "When "
});
formatter.match({
  "location": "library_tests.ActivitySteps.an_employee_with_initials_is_attached_to_the_activity(java.lang.String,java.lang.String,int)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the error message \"The employee is not availiable in that timeframe\" is given",
  "keyword": "Then "
});
formatter.match({
  "location": "library_tests.ProjectSteps.theErrorMessageIsGiven(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.uri("file:use_cases/Rapportoverprojekt.feature");
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
  "name": "a project with year 2020, name \"Fisk\", number 1",
  "keyword": "Given "
});
formatter.match({
  "location": "library_tests.ProjectSteps.a_project_with_year_name_number(int,java.lang.String,int)"
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
  "name": "the employee with initials \"ABCD\" is chosen as Project leader",
  "keyword": "When "
});
formatter.match({
  "location": "library_tests.ProjectSteps.the_employee_is_chosen_as_Projectleader(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the project is created",
  "keyword": "When "
});
formatter.match({
  "location": "library_tests.ProjectSteps.the_project_is_created()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "that project leader creates an activity for project 1 with time 10.0, startweek 19, endweek 21 and name \"Status\"",
  "keyword": "And "
});
formatter.match({
  "location": "library_tests.ActivitySteps.that_project_leader_creates_an_activity_with_time_startdate_and_enddate(int,double,int,int,java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "that project leader creates an activity for project 1 with time 12.0, startweek 19, endweek 21 and name \"ProjektStart\"",
  "keyword": "And "
});
formatter.match({
  "location": "library_tests.ActivitySteps.that_project_leader_creates_an_activity_with_time_startdate_and_enddate(int,double,int,int,java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "an employee with initials \"ADAG\" is attached to the activity with name \"Status\" on project 1",
  "keyword": "And "
});
formatter.match({
  "location": "library_tests.ActivitySteps.an_employee_with_initials_is_attached_to_the_activity(java.lang.String,java.lang.String,int)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the employee with initials \"ADAG\" records timespent 5.5 on an activity with name \"Status\"",
  "keyword": "When "
});
formatter.match({
  "location": "library_tests.ActivitySteps.theEmployeeRecordsTimespentOnAnActivity(java.lang.String,double,java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "an employee with initials \"FFGK\" is attached to the activity with name \"ProjektStart\" on project 1",
  "keyword": "And "
});
formatter.match({
  "location": "library_tests.ActivitySteps.an_employee_with_initials_is_attached_to_the_activity(java.lang.String,java.lang.String,int)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the employee with initials \"FFGK\" records timespent 8.5 on an activity with name \"ProjektStart\"",
  "keyword": "When "
});
formatter.match({
  "location": "library_tests.ActivitySteps.theEmployeeRecordsTimespentOnAnActivity(java.lang.String,double,java.lang.String)"
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
  "name": "a project leader that pulls a report on project 1",
  "keyword": "Given "
});
formatter.match({
  "location": "library_tests.ProjectSteps.aProjectLeaderThatPullsAReportOnProject(int)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "that report on project 1 is pulled and reportcreated is updated to message \"Report have been created\"",
  "keyword": "Then "
});
formatter.match({
  "location": "library_tests.ProjectSteps.thatReportOnProjectIsPulledAndReportcreatedIsUpdatedToMessage(int,java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.uri("file:use_cases/Registrertimer.feature");
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
  "name": "a project with year 2020, name \"Fisk\", number 1",
  "keyword": "Given "
});
formatter.match({
  "location": "library_tests.ProjectSteps.a_project_with_year_name_number(int,java.lang.String,int)"
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
  "name": "the employee with initials \"ABCD\" is chosen as Project leader",
  "keyword": "When "
});
formatter.match({
  "location": "library_tests.ProjectSteps.the_employee_is_chosen_as_Projectleader(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the project is created",
  "keyword": "When "
});
formatter.match({
  "location": "library_tests.ProjectSteps.the_project_is_created()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "that project leader creates an activity for project 1 with time 10.5, startweek 1903, endweek 3103 and name \"Projekt\"",
  "keyword": "And "
});
formatter.match({
  "location": "library_tests.ActivitySteps.that_project_leader_creates_an_activity_with_time_startdate_and_enddate(int,double,int,int,java.lang.String)"
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
  "name": "an employee with initials \"ADAG\" is attached to the activity with name \"Projekt\" on project 1",
  "keyword": "And "
});
formatter.match({
  "location": "library_tests.ActivitySteps.an_employee_with_initials_is_attached_to_the_activity(java.lang.String,java.lang.String,int)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the employee with initials \"ADAG\" records timespent 5.5 on an activity with name \"Projekt\"",
  "keyword": "When "
});
formatter.match({
  "location": "library_tests.ActivitySteps.theEmployeeRecordsTimespentOnAnActivity(java.lang.String,double,java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the timespent 5.5 for employee with initials \"ADAG\" is noted on the activity with name \"Projekt\"",
  "keyword": "Then "
});
formatter.match({
  "location": "library_tests.ActivitySteps.theTimespentIsNotedOnTheActivity(double,java.lang.String,java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.uri("file:use_cases/Retteiregistreretdata.feature");
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
  "name": "a project with year 2020, name \"Fisk\", number 1",
  "keyword": "Given "
});
formatter.match({
  "location": "library_tests.ProjectSteps.a_project_with_year_name_number(int,java.lang.String,int)"
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
  "name": "the employee with initials \"ABCD\" is chosen as Project leader",
  "keyword": "When "
});
formatter.match({
  "location": "library_tests.ProjectSteps.the_employee_is_chosen_as_Projectleader(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the project is created",
  "keyword": "When "
});
formatter.match({
  "location": "library_tests.ProjectSteps.the_project_is_created()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "that project leader creates an activity for project 1 with time 10.5, startweek 1903, endweek 3103 and name \"Projekt\"",
  "keyword": "And "
});
formatter.match({
  "location": "library_tests.ActivitySteps.that_project_leader_creates_an_activity_with_time_startdate_and_enddate(int,double,int,int,java.lang.String)"
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
  "name": "an employee with initials \"ADAG\" is attached to the activity with name \"Projekt\" on project 1",
  "keyword": "And "
});
formatter.match({
  "location": "library_tests.ActivitySteps.an_employee_with_initials_is_attached_to_the_activity(java.lang.String,java.lang.String,int)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the employee with initials \"ADAG\" records timespent 5.5 on an activity with name \"Projekt\"",
  "keyword": "When "
});
formatter.match({
  "location": "library_tests.ActivitySteps.theEmployeeRecordsTimespentOnAnActivity(java.lang.String,double,java.lang.String)"
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
  "name": "an employee with initials \"ADAG\" and timespent 5.5 on an activity",
  "keyword": "Given "
});
formatter.match({
  "location": "library_tests.ActivitySteps.anEmployeeWithInitialsAndTimespentOnAnActivity(java.lang.String,double)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the employee with initials \"ADAG\" wants to edit the timespent on the activity to 2.5",
  "keyword": "When "
});
formatter.match({
  "location": "library_tests.ActivitySteps.theEmployeeWantsToEditTheTimespentOnTheActivityTo(java.lang.String,double)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the timespent for employee with initials \"ADAG\" is updated to 2.5",
  "keyword": "Then "
});
formatter.match({
  "location": "library_tests.ActivitySteps.theTimespentIsUpdatedTo(java.lang.String,double)"
});
formatter.result({
  "status": "passed"
});
formatter.uri("file:use_cases/Totaltantaltimerarbejdet.feature");
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
  "name": "a project with year 2020, name \"Fisk\", number 1",
  "keyword": "Given "
});
formatter.match({
  "location": "library_tests.ProjectSteps.a_project_with_year_name_number(int,java.lang.String,int)"
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
  "name": "the employee with initials \"ABCD\" is chosen as Project leader",
  "keyword": "When "
});
formatter.match({
  "location": "library_tests.ProjectSteps.the_employee_is_chosen_as_Projectleader(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the project is created",
  "keyword": "When "
});
formatter.match({
  "location": "library_tests.ProjectSteps.the_project_is_created()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "that project leader creates an activity for project 1 with time 10.0, startweek 1903, endweek 3103 and name \"Projekt\"",
  "keyword": "And "
});
formatter.match({
  "location": "library_tests.ActivitySteps.that_project_leader_creates_an_activity_with_time_startdate_and_enddate(int,double,int,int,java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "that project leader creates an activity for project 1 with time 12.0, startweek 1903, endweek 3103 and name \"Projekt2\"",
  "keyword": "And "
});
formatter.match({
  "location": "library_tests.ActivitySteps.that_project_leader_creates_an_activity_with_time_startdate_and_enddate(int,double,int,int,java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "an employee with initials \"ADAG\" is attached to the activity with name \"Projekt\" on project 1",
  "keyword": "Given "
});
formatter.match({
  "location": "library_tests.ActivitySteps.an_employee_with_initials_is_attached_to_the_activity(java.lang.String,java.lang.String,int)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "an employee with initials \"ADAG\" is attached to the activity with name \"Projekt2\" on project 1",
  "keyword": "Given "
});
formatter.match({
  "location": "library_tests.ActivitySteps.an_employee_with_initials_is_attached_to_the_activity(java.lang.String,java.lang.String,int)"
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
  "name": "the employee with initials \"ADAG\" records timespent 7.5 on an activity with name \"Projekt\"",
  "keyword": "Given "
});
formatter.match({
  "location": "library_tests.ActivitySteps.theEmployeeRecordsTimespentOnAnActivity(java.lang.String,double,java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the employee with initials \"ADAG\" records timespent 5.5 on an activity with name \"Projekt\"",
  "keyword": "And "
});
formatter.match({
  "location": "library_tests.ActivitySteps.theEmployeeRecordsTimespentOnAnActivity(java.lang.String,double,java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the employee with initials \"ADAG\" has worked for a total of 13.0 hours that day",
  "keyword": "Then "
});
formatter.match({
  "location": "library_tests.ActivitySteps.theEmployeeWithInitialsHasWorkedForATotalOfHoursThatDay(java.lang.String,double)"
});
formatter.result({
  "status": "passed"
});
formatter.uri("file:use_cases/addekstra_employee.feature");
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
  "name": "a project with year 2020, name \"Fisk\", number 1",
  "keyword": "Given "
});
formatter.match({
  "location": "library_tests.ProjectSteps.a_project_with_year_name_number(int,java.lang.String,int)"
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
  "name": "the employee with initials \"ABCD\" is chosen as Project leader",
  "keyword": "When "
});
formatter.match({
  "location": "library_tests.ProjectSteps.the_employee_is_chosen_as_Projectleader(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the project is created",
  "keyword": "When "
});
formatter.match({
  "location": "library_tests.ProjectSteps.the_project_is_created()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "that project leader creates an activity for project 1 with time 10.0, startweek 1903, endweek 3103 and name \"Projekt\"",
  "keyword": "And "
});
formatter.match({
  "location": "library_tests.ActivitySteps.that_project_leader_creates_an_activity_with_time_startdate_and_enddate(int,double,int,int,java.lang.String)"
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
  "name": "an employee with initials \"ADAG\" is attached to the activity with name \"Projekt\" on project 1",
  "keyword": "Given "
});
formatter.match({
  "location": "library_tests.ActivitySteps.an_employee_with_initials_is_attached_to_the_activity(java.lang.String,java.lang.String,int)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the employee with initials \"ADAG\" records timespent 5.5 on an activity with name \"Projekt\"",
  "keyword": "When "
});
formatter.match({
  "location": "library_tests.ActivitySteps.theEmployeeRecordsTimespentOnAnActivity(java.lang.String,double,java.lang.String)"
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
  "name": "an employee with initials \"GAFG\" is attached to the activity with name \"Projekt\" on project 1",
  "keyword": "Given "
});
formatter.match({
  "location": "library_tests.ActivitySteps.an_employee_with_initials_is_attached_to_the_activity(java.lang.String,java.lang.String,int)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the employee with initials \"GAFG\" records timespent 7.5 on an activity with name \"Projekt\"",
  "keyword": "When "
});
formatter.match({
  "location": "library_tests.ActivitySteps.theEmployeeRecordsTimespentOnAnActivity(java.lang.String,double,java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the total timespent 13.0 is noted on the activity",
  "keyword": "Then "
});
formatter.match({
  "location": "library_tests.ActivitySteps.theTotalTimespentIsNotedOnTheActivity(double)"
});
formatter.result({
  "status": "passed"
});
formatter.uri("file:use_cases/choose_projectleader.feature");
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
  "name": "a project with year 2020, name \"Fisk\", number 1",
  "keyword": "Given "
});
formatter.match({
  "location": "library_tests.ProjectSteps.a_project_with_year_name_number(int,java.lang.String,int)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the project is created",
  "keyword": "When "
});
formatter.match({
  "location": "library_tests.ProjectSteps.the_project_is_created()"
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
  "name": "Choose project leader",
  "description": "",
  "keyword": "Scenario"
});
formatter.step({
  "name": "there is a project without a project leader",
  "keyword": "Given "
});
formatter.match({
  "location": "library_tests.ProjectSteps.there_is_a_project_without_a_project_leader()"
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
  "name": "the employee with initials \"ABCD\" is chosen as Project leader",
  "keyword": "When "
});
formatter.match({
  "location": "library_tests.ProjectSteps.the_employee_is_chosen_as_Projectleader(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the employee with initials \"ABCD\" is Project leader",
  "keyword": "Then "
});
formatter.match({
  "location": "library_tests.ProjectSteps.the_employee_with_initials_is_Projectleader(java.lang.String)"
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
  "name": "a project with year 2020, name \"Fisk\", number 1",
  "keyword": "Given "
});
formatter.match({
  "location": "library_tests.ProjectSteps.a_project_with_year_name_number(int,java.lang.String,int)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the project is created",
  "keyword": "When "
});
formatter.match({
  "location": "library_tests.ProjectSteps.the_project_is_created()"
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
  "name": "The project has a project leader",
  "description": "",
  "keyword": "Scenario"
});
formatter.step({
  "name": "there is a project without a project leader",
  "keyword": "Given "
});
formatter.match({
  "location": "library_tests.ProjectSteps.there_is_a_project_without_a_project_leader()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "an employee with initials \"ABCD\" who is chosen as project leader",
  "keyword": "And "
});
formatter.match({
  "location": "library_tests.ProjectSteps.anEmployeeWithInitialsWhoIsChosennAsProjectLeader(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "another employee with initials \"DFGH\" is chosen as project leader for the same project",
  "keyword": "When "
});
formatter.match({
  "location": "library_tests.ProjectSteps.anotherEmployeeWithInitialsIsChosenAsProjectLeaderForTheSameProject(java.lang.String)"
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
formatter.uri("file:use_cases/create_project.feature");
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
  "name": "a project with year 2020, name \"Fisk\", number 1",
  "keyword": "Given "
});
formatter.match({
  "location": "library_tests.ProjectSteps.a_project_with_year_name_number(int,java.lang.String,int)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the project is created",
  "keyword": "When "
});
formatter.match({
  "location": "library_tests.ProjectSteps.the_project_is_created()"
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
});