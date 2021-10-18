package com.cydeo.step_definitions;

import com.cydeo.pages.WAllProductPage;
import com.cydeo.pages.WCommonArea;
import com.cydeo.pages.WOrder_Page;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.java.eo.Se;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Set;

import static org.junit.Assert.assertEquals;

public class WebOrderStepDefs {
    @When("we select {string} tab from sidebar")
    public void weSelectTabFromSidebar(String tabName) {
        System.out.println("tabName = " + tabName);
        WCommonArea commonArea = new WCommonArea();
        switch (tabName){
            case "View all products" :
                commonArea.viewAllProductTab.click();
                break;
            case "View all orders":
                commonArea.viewAllOrder.click();
                break;
            case "Order":
            commonArea.orderTab.click();
                break;


        }


    }

    @Then("we should see below options in Product dropdown list")
    public void weShouldSeeBelowOptionsInProductDropdownList(List<String> expectedOptions) {
        System.out.println("expectedOptions = " + expectedOptions);
        WOrder_Page orderPage = new WOrder_Page();

        List<String> acrualOptions = orderPage.getAllProductOptionFromList();
        assertEquals(expectedOptions,acrualOptions);


    }

    @Then("we should see table with below content")
    public void weShouldSeeTableWithBelowContent(List<Map<String,String>> productMapLst) {

        System.out.println("productMapLst = " + productMapLst);

        // how to get first map
        Map<String,String> expectedFirstRowMap = productMapLst.get(0) ;

        WAllProductPage allProductPage= new WAllProductPage();

        System.out.println("allProductPage.getRowMapFromWebTable() = " + allProductPage.getRowMapFromWebTable());

        Map<String,String> actualFirstRowMap = allProductPage.getRowMapFromWebTable() ;

        // assert two maps are equal
        assertEquals(  expectedFirstRowMap , actualFirstRowMap );
/*
//      get expected header:
        Set<String> headerSet= productMapLst.get(0).keySet();
        System.out.println("headerSet = " + headerSet);

        //get actual header
        List<String> actualHeaders= allProductPage.getAllHeaderText();
        System.out.println("actualHeaders = " + actualHeaders);

        //check the size is the same--->list and set different data type so we cant compare
        assertEquals(headerSet.size(), actualHeaders.size());//can compare size

        // list to set equality check will not work
        // so we need to turn the set into list
        List<String> expectedHeaders= new ArrayList<>(headerSet);//set into the list
        assertEquals(expectedHeaders, actualHeaders);

 */

    }
}
