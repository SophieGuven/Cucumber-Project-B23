
##below line is how we do tag to a feature at feature level
  ##you can add more than one tags on anything
  @Calculator @non_ui
Feature: Calculator feature
  As a user,
  I should be able
  to use the calculator,
  de that I can do
  arithmetic operations.


  ##below line is how we do tag to a scenario level
  @addition
  Scenario: Add 2 numbers
    Given calculator app is open
    Then I add 2 with 2
    Then I should get result 4 displayed

  @smoke @salad
  Scenario: Add 2 numbers
    Given calculator app is open
    Then I add 5 with 4
    Then I should get result 9 displayed