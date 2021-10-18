package com.cydeo.pages;

import com.cydeo.utility.ConfigReader;
import com.cydeo.utility.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class WLoginPage {

    @FindBy(id = "ctl00_MainContent_username")
    public WebElement userNameField;

    @FindBy(name = "ctl00$MainContent$password")
    public WebElement passwordField;

    @FindBy(css = "#ctl00_MainContent_login_button")
    public WebElement loginButton;

    @FindBy(xpath ="//span[.='Invalid Login or Password.']")
    public WebElement errorMsg;

    public WLoginPage(){
        //pageFactory is a selenium class that support page obj model
        //and it has method called initElements
        //once it's called it will locate all the element
        //webDriver instance and page class instance this means current instance of this class
       PageFactory.initElements(Driver.getDriver(), this);

    }
    public void goTo(){
        Driver.getDriver().navigate().to(ConfigReader.read("weborder_url"));
    }

    public void login(String username, String password){

        this.userNameField.sendKeys(username);
        this.passwordField.sendKeys(password);
        this.loginButton.click();
    }
    public boolean loginErrorMsgPresent(){
      return this.errorMsg.isDisplayed();

    }





}
