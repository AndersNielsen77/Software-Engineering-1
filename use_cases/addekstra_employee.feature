Feature: Assign another employee to an activity
  Description: An employee assign themselves to an activity
  Actor: Employee

  Background:
    Given a project with year 2020, name "Fisk"
    And an employee with initials "ABCD"
    When the employee with initials "ABCD" is chosen as Project leader for project "Fisk"
    When the project "Fisk" with year 2020 is created
    And that project leader creates an activity for project "Fisk" with time 10.5, startweek 19, endweek 21 and name "Projekt"
    And an employee with initials "ADAG"
    And an employee with initials "GAFG"
    Given an employee with initials "ADAG" is attached to the activity with name "Projekt" on project "Fisk"
    When the employee with initials "ADAG" records timespent 5.5 on an activity with name "Projekt" in project "Fisk"


  Scenario: An employee assign themselves to an activity to help out another employee
    Given an employee with initials "GAFG" is attached to the activity with name "Projekt" on project "Fisk"
    When the employee with initials "GAFG" records timespent 7.5 on an activity with name "Projekt" in project "Fisk"
    Then the total timespent 13.0 is noted on the activity "Projekt" in project "Fisk"