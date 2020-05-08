Feature: Choose project leader
  Description: An employee is chosen as a project leader
  Actor: Employee

  Background: A set of projects
    Given a project with year 2020, name "Fisk"
    Then the project with year 2020, name "Fisk", number 1 is created
    And an employee with initials "ABCD"

  # Main scenario
  Scenario: Choose project leader
    Given there is a project "Fisk" without a project leader
    When the employee with initials "ABCD" is chosen as Project leader for project "Fisk"
    Then the employee is Project leader

   #fail scenario
  Scenario: The project has a project leader
    Given there is a project "Fisk" without a project leader
    And an employee with initials "ABCD" who is chosen as project leader for project "Fisk"
    When another employee with initials "DFGH" is chosen as project leader for project "Fisk"
    Then the error message "There is already an existing project leader" is given