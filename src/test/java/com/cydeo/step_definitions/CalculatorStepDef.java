package com.cydeo.step_definitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

import static org.junit.Assert.assertEquals;

public class CalculatorStepDef {
    int actualResult;
    @Given("calculator app is open")
    public void calculator_app_is_open() {
        System.out.println("@Given calculator app is open");
    }
    @Then("I add {int} with {int}")
    public void i_add_with(Integer num1, Integer num2) {

        System.out.println("When I add "+ num1+" "+num2);
        actualResult= num1+num2;

    }
    @Then("I should get result {int} displayed")
    public void i_should_get_result_displayed(int expectedResult) {

        System.out.println("The result should be "+expectedResult);
        assertEquals(expectedResult, actualResult);
    }



}
