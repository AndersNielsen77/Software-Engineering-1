Feature: Create activities
  Description: The Project manager creates activities for a specific project
  Actor: Project manager

  Background: A set of projects
    Given a project with year 2020, name "Fisk", number 1
    And an employee with initials "ABCD"
    And an employee with initials "DGGF"
    When the employee with initials "ABCD" is chosen as Project leader
    When the project is created
    And that project leader creates an activity for project 1 with time 10.5, startweek 19, endweek 21 and name "Projekt"
    Then the project with year 2020, name "Fisk", number 1 is created
    And an employee with initials "JJKG"
    When An employee with initials "JJKG" creates a fixed activity with name "Ferie", startweek 18 and endweek 20


  # Main scenario
  Scenario: Project leader create an activity
    Given an employee with initials "ABCD" who is a project leader
    And that project leader creates an activity for project 1 with time 10.5, startweek 19, endweek 21 and name "Projekt"
    When an employee with initials "DGGF" is attached to the activity with name "Projekt" on project 1
    Then activity with associated employee is created

  #fail scenario
  Scenario: Employee tries to create an activity for a given project
   Given an employee with initials "AGAK" who is not a project leader
   When the employee tries to create an activity 10.5, startdate 2003, enddate 3003 and name "Projekt2" with for a given project
   Then the error message "You are not the project leader" is given

    #fail scenario
 Scenario: Project leader tries to assign an unavailiable employee to an activity
   Given an employee with initials "ABCD" who is a project leader
   When an employee with initials "JJKG" is attached to the activity with name "Projekt" on project 1
   Then the error message "The employee is not availiable in that timeframe" is given
