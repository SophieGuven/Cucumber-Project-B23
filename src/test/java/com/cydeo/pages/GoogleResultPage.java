package com.cydeo.pages;

import com.cydeo.utility.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class GoogleResultPage {

    @FindBy(id="result-stats")
    private WebElement searchResultCount;

    @FindBy(xpath = "//h3[@class='LC20lb DKV0Md']")//grab all the links with below style
    private List<WebElement> resultLinks;

    public GoogleResultPage(){
        PageFactory.initElements(Driver.getDriver(), this);
    }

    public String getResultCountText(){
        return searchResultCount.getText();
    }

    //print out the text of all the resulting link
    public void printAllSearchResultLinks(){
        System.out.println("resultLinks.size() = " + resultLinks.size());
        for (WebElement eachLinkElement : resultLinks) {
            System.out.println("eachLinkElement.getText() = " + eachLinkElement.getText());


        }
    }



}
/*
 * - Google SearchResultPage
 *   - Fields
 *      searchResultCount
 *      resultLinks (list of webelement )
 *   - Methods
 *      getResultCountText
 *      getAllResultLinkText
 */