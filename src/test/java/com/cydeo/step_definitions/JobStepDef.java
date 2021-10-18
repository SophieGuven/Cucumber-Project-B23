package com.cydeo.step_definitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class JobStepDef {

    @Given("student attend all the classes")
    public void student_attend_all_the_classes() {
        System.out.println("student attend all the classes");

    }
    @When("student learn all the topics")
    public void student_learn_all_the_topics() {
        System.out.println("student learn all the topics");
    }
    @Then("student should be ready for the job")
    public void student_should_be_ready_for_the_job() {
        System.out.println("student should be ready for the job");
    }


    @Given("student is prepared")
    public void student_is_prepared() {
        System.out.println("student is prepared");
    }
    @When("student upload their resume")
    public void student_upload_their_resume() {
        System.out.println("student upload their resume");
    }
    @Then("student will be in the market")
    public void student_will_be_in_the_market() {
        System.out.println("student will be in the market");
    }


    @Given("you are prepared for a job")
    public void you_are_prepared_for_a_job() {
        System.out.println("prepare for the job condition1");
    }
    @Given("you are in the market")
    public void you_are_in_the_market() {
        System.out.println("market is hot condition 2");
    }
    @When("you apply for {int} jobs a day")
    public void you_apply_for_jobs_a_day(Integer int1) {
        System.out.println("apply all the jobs");
    }
    @Then("you will eventually get the job")
    public void you_will_eventually_get_the_job() {
        System.out.println("then get the job");
    }



}
