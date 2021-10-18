@Calculator @non_ui
Feature: Calculator feature with data
  As a user,
  I should be able
  to use the calculator,
  de that I can do
  arithmetic operations.

  @salad
  Scenario Outline: Add 2 numbers multiple example
    Given calculator app is open
    When I add <num1> with <num2>
    Then I should get result <expectedResult> displayed
    Examples:
      | num1 | num2 | expectedResult |
      | 3    | 4    | 7              |
      | 4    | 7    | 11             |
      | 6    | 11   | 17             |
      | 13   | 5    | 18             |
      | 41   | 7    | 48             |
      | 60   | 10   | 70             |

  ##below line is how we do tag to a scenario level
#  @addition
#  Scenario: Add 2 numbers 1
#   Given calculator app is open
#  Then I add 2 with 2
# Then I should get result 4 displayed

#  @addition
#  Scenario: Add 2 numbers 2
#    Given calculator app is open
#    Then I add 3 with 2
#    Then I should get result 5 displayed
  #@addition
  # Scenario: Add 2 numbers 3
  #  Given calculator app is open
  #  Then I add 21 with 20
  #  Then I should get result 5 displayed