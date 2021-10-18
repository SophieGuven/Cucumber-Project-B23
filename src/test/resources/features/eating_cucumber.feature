Feature: Eating too many cucumbers may not be good for you
  Eating too much of anything may not be good for you
  Scenario: Eating a few is no problem
    Given John is hungry
    When he eats 3 cucumbers
    Then he will be full

    Scenario:
      Given Ivan is hungry
      When he eats 10 cucumbers
      Then he will be sick