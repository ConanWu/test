Feature: example Feature
  Scenario Outline: Add two numbers
    Given I have two numbers "<a>" and "<b>"
    When I add them
    Then I should get "<result>"

    Examples:
    |a|b|result|
    |4|5|9     |
    |7|9|16    |