Feature: Records hours
  Description: An employee records a number of hours spent on a given activity.actor: Employee
  Actor: Employee

  Background: A set of projects
    Given a project with year 2020, name "Fisk", number 1
    And an employee with initials "ABCD"
    And an employee with initials "ADAG"
    When the employee with initials "ABCD" is chosen as Project leader
    When the project is created
    And that project leader creates an activity for project 1 with time 10.5, startweek 1903, endweek 3103 and name "Projekt"
    Then the project with year 2020, name "Fisk", number 1 is created

  # Main scenario
  Scenario: Employee records hours
    Given an employee with initials "ADAG"
    And an employee with initials "ADAG" is attached to the activity with name "Projekt" on project 1
    When the employee with initials "ADAG" records timespent 5.5 on an activity with name "Projekt"
    Then the timespent 5.5 for employee with initials "ADAG" is noted on the activity with name "Projekt"

  # fail scenario
 # Scenario: The project has a project manager
  #  When The data is incorrect format
   # Then The system gives an error message that the format is incorrect