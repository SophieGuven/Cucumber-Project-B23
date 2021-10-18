package com.cydeo.step_definitions;

import com.cydeo.pages.WLoginPage;
import com.cydeo.utility.BrowserWait;
import com.cydeo.utility.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import static org.junit.Assert.*;

public class WebOrderLoginStepDef {

    WLoginPage loginPage;//putting it the top level so we can have access the methods

    @Given("we are at web order login page")
    public void we_are_at_web_order_login_page() {
       //navigate to login page
        loginPage = new WLoginPage();
        loginPage.goTo();


    }
    @When("we provide valid credentials")
    public void we_provide_valid_credentials() {

        loginPage.login("Tester", "test");

    }
    @Then("we should see all order page")
    public void we_should_see_all_order_page() {

        //cucumber-junit dependency allready come with junit4
        //so we will be just using assertions methods coming from junit 4
        //it's extremely similar just coming from different dependency
        //so the package import will be different
        //this is where the assetions methods are coming from

        //import static org.junit.Assert.*
        BrowserWait.waitFor(2);
        System.out.println("Driver.getDriver().getTitle() = " + Driver.getDriver().getTitle());
        assertEquals("Web Orders", Driver.getDriver().getTitle());


    }

    @When("we provide invalid credentials")
    public void weProvideInvalidCredentials() {

        loginPage.login("bla","bla");
    }

    @Then("we should still be at login page")
    public void weShouldStillBeAtLoginPage() {
        assertEquals("Web Orders Login", Driver.getDriver().getTitle());

    }

    @And("login error message should be present")
    public void loginErrorMessageShouldBePresent() {

        assertTrue(loginPage.loginErrorMsgPresent());
    }

    @When("user provide username {string} and password {string}")
    public void userProvideUsernameAndPassword(String username, String password) {

        loginPage.login(username, password);


    }
}
