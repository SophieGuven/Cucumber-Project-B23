package com.cydeo.step_definitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class EatStepDefinition {
    @Given("John is hungry")
    public void john_is_hungry() {
        System.out.println("This is @Given code john is hungry");

    }
    @When("he eats {int} cucumbers")
    public void he_eats_cucumbers(Integer quantity) {
        System.out.println("This is @When code he eats cucumbers " + quantity);

    }
    @Then("he will be full")
    public void he_will_be_full() {
        System.out.println("This is @Then code he will be full");

    }
    @Given("Ivan is hungry")
    public void ivan_is_hungry() {
        System.out.println("@Given Ivan is hungry");
    }
    @Then("he will be sick")
    public void he_will_be_sick() {
        System.out.println("@Then he get sick");

    }




}
