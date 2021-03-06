package com.cydeo.pages;

import com.cydeo.utility.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertEquals;

public class WOrder_Page {

    @FindBy(xpath = "//h2[normalize-space(.)='Order']")
    public WebElement header;

    @FindBy(id = "ctl00_MainContent_fmwOrder_ddlProduct")
    public WebElement productDropdown;

    @FindBy(id = "ctl00_MainContent_fmwOrder_txtQuantity")
    public WebElement quantityBox;

    @FindBy(id = "ctl00_MainContent_fmwOrder_txtUnitPrice")
    public WebElement priceBox;

    @FindBy(id = "ctl00_MainContent_fmwOrder_txtDiscount")
    public WebElement discountBox;

    @FindBy(id = "ctl00_MainContent_fmwOrder_txtTotal")
    public WebElement totalBox;

    @FindBy(css = "input[type='submit'][value='Calculate']")
    public WebElement calculateButton;

    @FindBy(id = "ctl00_MainContent_fmwOrder_TextBox2")
    public WebElement customerNameBox;

    public WOrder_Page() {
        PageFactory.initElements(Driver.getDriver(), this);

    }

    public List<String> getAllProductOptionFromList() {
        /**
         * get All Product Options From Product Dropdown List
         * @return List<String> that hold all the options text
         */

            Select selectObj = new Select(productDropdown);

//        List<String> actualOptions =
//                selectObj.getOptions().stream()    // get Stream<WebElement> from List<WebElement>
//                        .map(eachOption-> eachOption.getText()) // get List<String> from List<WebElement>
//                        .collect(Collectors.toList()); // eventually collect it as a list

            //getOptions method from select class is used
            // to return all dropdown options as List of webelement
            List<WebElement> allProductOptions = selectObj.getOptions();
            // this is the list to store actual option so we can compare with expected
            List<String> actualOptions = new ArrayList<>();

            for (WebElement eachOption : allProductOptions) {
                System.out.println("eachOption.getText() = " + eachOption.getText());
                actualOptions.add(eachOption.getText());
            }

            return actualOptions;
        }
    }

