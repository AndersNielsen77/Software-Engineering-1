Feature: Report on project
  Description: The project manager assigns an employee to an activity
  Actor: Project manager

  Background:
    Given a project with year 2020, name "Fisk", number 1
    And an employee with initials "ABCD"
    Given an employee with initials "ADAG"
    Given an employee with initials "FFGK"
    When the employee with initials "ABCD" is chosen as Project leader
    When the project is created
    And that project leader creates an activity for project 1 with time 10.0, startweek 19, endweek 21 and name "Status"
    And that project leader creates an activity for project 1 with time 12.0, startweek 19, endweek 21 and name "ProjektStart"
    And an employee with initials "ADAG" is attached to the activity with name "Status" on project 1
    When the employee with initials "ADAG" records timespent 5.5 on an activity with name "Status"
    And an employee with initials "FFGK" is attached to the activity with name "ProjektStart" on project 1
    When the employee with initials "FFGK" records timespent 8.5 on an activity with name "ProjektStart"


  # Main scenario
  Scenario: The project manager draws a time report on the project
    Given a project leader that pulls a report on project 1
    Then that report on project 1 is pulled and reportcreated is updated to message "Report have been created"

  # fail scenario
  #Scenario: Employee tries to make a time report on the project
   # When A user makes a report on the project
    #And The user is not a project manager
    #Then The system provides an error message that only one project manager can pull a report