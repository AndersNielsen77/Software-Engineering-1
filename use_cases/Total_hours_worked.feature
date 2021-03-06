Feature: Total hours worked
  Description: An employee can see his total hours worked for the day
  Actor: Employee

  Background:
    Given a project with year 2020, name "Fisk"
    And an employee with initials "ABCD"
    And an employee with initials "ADAG"
    When the employee with initials "ABCD" is chosen as Project leader for project "Fisk"
    And that project leader with initials "ABCD" creates an activity for project "Fisk" with time 10.5, startweek 19, endweek 21 and name "Projekt"
    And that project leader with initials "ABCD" creates an activity for project "Fisk" with time 10.5, startweek 19, endweek 21 and name "Projekt2"
    Given an employee with initials "ADAG" is attached to the activity with name "Projekt" on project "Fisk"
    Given an employee with initials "ADAG" is attached to the activity with name "Projekt2" on project "Fisk"

  # Main scenario
  Scenario: Get total number of hours
    Given the employee with initials "ADAG" records timespent 7.5 on an activity with name "Projekt" in project "Fisk"
    And the employee with initials "ADAG" records timespent 5.5 on an activity with name "Projekt" in project "Fisk"
    Then the employee with initials "ADAG" has worked for a total of 13.0 hours that day
