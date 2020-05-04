Feature: Choose project leader
  Description: An employee is chosen as a project leader
  Actor: Employee


  Background: A set of projects
    Given a project with year 2020, name "Fisk", number 1
    When the project is created
    Then the project with year 2020, name "Fisk", number 1 is created



  # Main scenario
  Scenario: Choose project leader
    Given there is a project without a project leader
    And an employee with initials "ABCD"
    When the employee with initials "ABCD" is chosen as Project leader
    Then the employee with initials "ABCD" is Project leader

   #fail scenario
  Scenario: The project has a project leader
    Given there is a project without a project leader
    And an employee with initials "ABCD" who is chosen as project leader
    When another employee with initials "DFGH" is chosen as project leader for the same project
    Then the error message "There is already an existing project leader" is given