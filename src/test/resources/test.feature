Feature: testing cucumber
  Scenario: Checking that cucumber really works
    Given cucumber is downloaded
    When I try to run a scenario
    Then cucumber works

  Scenario: Adding two numbers correctly
    Given I have a calculator
    When I add 2 and 3
    Then the result is 5

  Scenario: Adding two numbers incorrectly
    Given I have a calculator
    When I add 2 and 3
    Then the result is 6