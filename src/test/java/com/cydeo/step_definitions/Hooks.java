package com.cydeo.step_definitions;

import com.cydeo.utility.Driver;
import io.cucumber.java.After;      //import is important to cucumber
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import java.util.concurrent.TimeUnit;

public class Hooks {
    @Before("@ui")
    public void setupDriver(){
        System.out.println("This is from @Before inside hooks class ");
        Driver.getDriver().manage().window().maximize();
        Driver.getDriver().manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }

    @After("@ui")
    public void tearDown(Scenario scenario){

        //check if scenario failed or not
        if(scenario.isFailed()){
            //this is how we take screenshot in selenium
            TakesScreenshot ts= (TakesScreenshot) Driver.getDriver();//do casting
            byte[] screenshot= ts.getScreenshotAs(OutputType.BYTES);
            scenario.attach(screenshot, "image/png", "what ever u want");
        }

        System.out.println("This is from @After inside hooks class");
        Driver.closeBrowser();
    }

}
