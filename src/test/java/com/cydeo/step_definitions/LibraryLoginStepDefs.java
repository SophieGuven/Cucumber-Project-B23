package com.cydeo.step_definitions;

import com.cydeo.pages.LibraryLoginPage;
import com.cydeo.utility.BrowserWait;
import com.cydeo.utility.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import static org.junit.Assert.assertEquals;

public class LibraryLoginStepDefs {
    LibraryLoginPage loginPage = new LibraryLoginPage();

    @Given("user is at library login page")
    public void userIsAtLibraryLoginPage() {
        loginPage.goTo();
    }

    @When("user use username {string} and passcode {string}")
    public void userUseUsernameAndPasscode(String email, String password) {
        loginPage.login(email, password);
    }

    @Then("user should be at dashboard page")
    public void userShouldBeAtDashboardPage() {
        BrowserWait.waitFor(2);
        //check the title is now library after logging in
        assertEquals("Library", Driver.getDriver().getTitle());
    }


}

