package com.cydeo.step_definitions;

import com.cydeo.pages.WLoginPage;
import com.cydeo.utility.Driver;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import java.nio.charset.StandardCharsets;
import java.util.List;
import java.util.Map;

public class DatatableStepDefs {

    @Given("I have a {word}")//u can also write {string}--->string u need to put " "in feature, while using {word} u don't need
    public void i_have_a(String animal) {
        System.out.println("Given I have a " + animal);
    }
    @When("I call their names")
    public void i_call_their_names() {
        System.out.println("call their names");
    }
    @Then("They come to me")
    public void they_come_to_me() {
        System.out.println("then they come to me");
    }

    @Given("I have following animals")
    public void i_have_following_animals(List<String> animalList) {
        // Write code here that turns the phrase above into concrete actions
        // For automatic transformation, change DataTable to one of
        // E, List<E>, List<List<E>>, List<Map<K,V>>, Map<K,V> or
        // Map<K, List<V>>. E,K,V must be a String, Integer, Float,
        // Double, Byte, Short, Long, BigInteger or BigDecimal.
        //
        // For other transformations you can register a DataTableType.
        System.out.println("animalList = " + animalList);
    }
    @When("I call their names with below names")
    public void i_call_their_names_with_below_names(List<String> nameList) {
        // Write code here that turns the phrase above into concrete actions
        // For automatic transformation, change DataTable to one of
        // E, List<E>, List<List<E>>, List<Map<K,V>>, Map<K,V> or
        // Map<K, List<V>>. E,K,V must be a String, Integer, Float,
        // Double, Byte, Short, Long, BigInteger or BigDecimal.
        //
        // For other transformations you can register a DataTableType.
        System.out.println("nameList = " + nameList);
    }

    @Then("They come to me with below noise")
    public void they_come_to_me_with_below_noise(Map<String, String> animalNoiseMap) {
        System.out.println("animalNoiseMap = " + animalNoiseMap);

    }

    /*
    @Then("They come to me with below noise")//prefer to use Map
    public void they_come_to_me_with_below_noise(List<List<String>> animalNoiseList) {
        System.out.println("animalNoiseList = " + animalNoiseList);
        //will print
        //animalNoiseList = [[horse, Nai], [dog, Woof], [turtle, Hiss], [zebra, Bro]]

    }

     */

    @When("we provide below credentials")
    public void weProvideBelowCredentials(Map<String, String> credentialMap) {
        System.out.println("credentialMap = " + credentialMap);
        String usernameFromTable= credentialMap.get("username");
        String passwordFromTable= credentialMap.get("password");

        WLoginPage loginPage = new WLoginPage();
        loginPage.login(usernameFromTable, passwordFromTable);

    }


    @Given("this is the product reference")
    public void thisIsTheProductReference(List<Map<String, Object>> productMapLst) {
/*
        System.out.println("productMapLst = " + productMapLst);
        for (Map<String, Object> eachRowMap : productMapLst ){
            System.out.println("eachRowMap = " + eachRowMap);

 */
        Map<String,Object> thirdRowMap=productMapLst.get(2);
        //the key is column name, the value is cell value
        System.out.println("thirdRowMap = " + thirdRowMap);
        //print Discount colum of 3rd row
        System.out.println("thirdRowMap.get(\"Discount\") = " + thirdRowMap.get("Discount"));

        //give me the price of 2nd row
        System.out.println("productMapLst.get(1).get(\"Price\") = " + productMapLst.get(1).get("Price"));


    }

    @And("I have another product reference without header")
    public void headlessTable(List<List<String>> productInfoList) {
        System.out.println("productInfoList = " + productInfoList);

        //get me entire 3rd row
       // System.out.println("productInfoList.get(2) = " + productInfoList.get(2));
        List<String> thirdRow= productInfoList.get(2);
        System.out.println("thirdRow = " + thirdRow);

        System.out.println("thirdRow.get(1) = " + thirdRow.get(1));

        System.out.println("productInfoList.get(0). get(2) = " + productInfoList.get(0).get(2));
    }

}

