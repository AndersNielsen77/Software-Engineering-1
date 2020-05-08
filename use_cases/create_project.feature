Feature: Create project
  Description: User creates a project
  Actor: User

  # Main scenario
  Scenario: Create project
    Given a project with year 2020, name "Fisk"
    Then the project with year 2020, name "Fisk", number 1 is created
