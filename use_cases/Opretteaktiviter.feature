Feature: Create activities
  Description: The Project manager creates activities for a specific project
  Actor: Project manager

  Background: A set of projects
    Given a project with year 2020, name "Fisk"
    And an employee with initials "ABCD"
    And an employee with initials "DGGF"
    When the employee with initials "ABCD" is chosen as Project leader for project "Fisk"
    When the project "Fisk" with year 2020 is created
    And that project leader with initials "ABCD" creates an activity for project "Fisk" with time 10.5, startweek 19, endweek 20 and name "Projekt"
    Then the project with year 2020, name "Fisk", number 1 is created
    And an employee with initials "JJKG"
    When An employee with initials "JJKG" creates a fixed activity with name "Ferie", startweek 18 and endweek 20
    And An employee with initials "DGGF" creates a fixed activity with name "Ferie", startweek 10 and endweek 12



  # Main scenario
  Scenario: Project leader create an activity
    Given an employee with initials "ABCD" who is a project leader
    And that project leader with initials "ABCD" creates an activity for project "Fisk" with time 10.5, startweek 19, endweek 21 and name "Projekt"
    When an employee with initials "DGGF" is attached to the activity with name "Projekt" on project "Fisk"
    And the employee with initials "DGGF" is available between startweek 19 and endweek 21
    Then activity "Projekt" with associated employee "DGGF" in project "Fisk" is created

  #fail scenario
  Scenario: Employee tries to create an activity for a given project
   Given an employee with initials "AGAK" who is not a project leader
   When the employee tries to create an activity 10.5, startdate 20, enddate 33 and name "Projekt2" for the project "Fisk"
   Then the error message "You are not the project leader" is given

    #fail scenario
 Scenario: Project leader tries to assign an unavailable employee to an activity
   Given an employee with initials "ABCD" who is a project leader
   When an employee with initials "JJKG" is attached to the activity with name "Projekt" on project "Fisk"
   Then the error message "The employee is not available in that timeframe" is given
