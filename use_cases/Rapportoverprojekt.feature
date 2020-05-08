Feature: Report on project
  Description: The project manager assigns an employee to an activity
  Actor: Project manager

  Background:
    Given a project with year 2020, name "Fisk"
    And an employee with initials "ABCD"
    Given an employee with initials "ADAG"
    Given an employee with initials "FFGK"
    When the employee with initials "ABCD" is chosen as Project leader for project "Fisk"
    When the project "Fisk" with year 2020 is created
    And that project leader with initials "ABCD" creates an activity for project "Fisk" with time 10.5, startweek 19, endweek 21 and name "status"
    And that project leader with initials "ABCD" creates an activity for project "Fisk" with time 10.5, startweek 19, endweek 21 and name "ProjektStart"
    And an employee with initials "ADAG" is attached to the activity with name "Status" on project "Fisk"
    When the employee with initials "ADAG" records timespent 5.5 on an activity with name "Status" in project "Fisk"
    And an employee with initials "FFGK" is attached to the activity with name "ProjektStart" on project "Fisk"
    When the employee with initials "FFGK" records timespent 8.5 on an activity with name "ProjektStart" in project "Fisk"

  # Main scenario
  Scenario: The project manager draws a time report on the project
    Given a project leader that pulls a report on project "Fisk"
    Then that report on project "Fisk" is pulled and reportcreated is updated to message "Report have been created"