Feature: Records hours
  Description: An employee records a number of hours spent on a given activity.actor: Employee
  Actor: Employee

  Background: A set of projects
    Given a project with year 2020, name "Fisk"
    And an employee with initials "ABCD"
    And an employee with initials "ADAG"
    When the employee with initials "ABCD" is chosen as Project leader for project "Fisk"
    And that project leader with initials "ABCD" creates an activity for project "Fisk" with time 10.5, startweek 19, endweek 21 and name "Projekt"
    Then the project with year 2020, name "Fisk", number 1 is created

  # Main scenario
  Scenario: Employee records hours
    Given an employee with initials "ADAG"
    And an employee with initials "ADAG" is attached to the activity with name "Projekt" on project "Fisk"
    When the employee with initials "ADAG" records timespent 5.5 on an activity with name "Projekt" in project "Fisk"
    Then the timespent 5.5 for employee with initials "ADAG" is noted on the activity with name "Projekt" in project "Fisk"