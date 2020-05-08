Feature: Correct recorded data
  Description: An employee can see his total hours worked for the day
  Actor: Employee

  Background: A set of projects
    Given a project with year 2020, name "Fisk"
    And an employee with initials "ABCD"
    When the employee with initials "ABCD" is chosen as Project leader for project "Fisk"
    When the project "Fisk" with year 2020 is created
    And that project leader with initials "ABCD" creates an activity for project "Fisk" with time 10.5, startweek 19, endweek 21 and name "Projekt"
    Given an employee with initials "ADAG"
    And an employee with initials "ADAG" is attached to the activity with name "Projekt" on project "Fisk"
    When the employee with initials "ADAG" records timespent 5.5 on an activity with name "Projekt" in project "Fisk"
    Then the project with year 2020, name "Fisk", number 1 is created


  # Main scenario
  Scenario: The employee corrects a registered activity
    Given an employee with initials "ADAG" and timespent 5.5 on the activity "Projekt" in project "Fisk"
    When the employee with initials "ADAG" wants to edit the timespent on the activity "Projekt" in project "Fisk" to 2.5
    Then the timespent for employee with initials "ADAG" in project "Fisk" on activity "Projekt" is updated to 2.5

  # fail scenario
  #Scenario: The employee tries to correct a non-existent activity
   # When A user requests number of hours for the day
    #And The activity does not exist
    #hen The system gives an error message that the activity does not exist