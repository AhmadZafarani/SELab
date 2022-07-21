@tag
Feature: CalculatorFull

  Scenario: multiply two numbers
    Given Tree input values, 2, 3 and *
    When I press Calculate button
    Then Expected result is 6

  Scenario Outline: operations between two numbers
    Given Tree input values, <first>, <second> and <opt>
    When I press Calculate button
    Then Expected result is <result>
    Examples:
      | first | second | opt | result |
      | 6     | 2      | *   | 12     |
      | 6     | 2      | /   | 3      |
      | 6     | 2      | ^   | 36     |
      | -2    | 3      | *   | -6     |
      | -3    | -3     | /   | 1      |
      | -2    | 3      | ^   | -8     |
      | 5     | 2      | /   | 2      |