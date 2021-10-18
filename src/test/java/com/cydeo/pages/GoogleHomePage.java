package com.cydeo.pages;

import com.cydeo.utility.BrowserWait;
import com.cydeo.utility.ConfigReader;
import com.cydeo.utility.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class GoogleHomePage {

    @FindBy(name = "q")
    private WebElement searchBox;

    @FindBy(name = "btnK")
    private WebElement searchBtn;

    public GoogleHomePage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }


    public void goTo(){
  //  Driver.getDriver().get("https://google.com");
    Driver.getDriver().get(ConfigReader.read("google.url"));//both way is the same
}

public void searchKeyword(String keyword){
    this.searchBox.sendKeys(keyword);
    BrowserWait.waitFor(1);
    this.searchBtn.submit();
}

    public boolean isAt(){
        return Driver.getDriver().getTitle().equals("Google");

    }



}
