Feature: Fixed activities
  Description: An employee records vacation/illness etc. in the system (as a fixed activity)
  Actor: Employee

  # Main scenario
  Background:
    And an employee with initials "ABCD"

  Scenario: An employee registers a fixed activity
    Given An employee with initials "ABCD" creates a fixed activity with name "Ferie", startweek 10 and endweek 12
    Then the fixed activty with name "Ferie" is created attached to employee with initials "ABCD"

