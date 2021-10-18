package com.cydeo.utility;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebElement;

public class WebOrderUtility_New {

    public static void openWebOrderApp(){
      //  Driver.getDriver().get("http://secure.smartbearsoftware.com/samples/TestComplete11/WebOrders/Login.aspx");

        Driver.getDriver().get(ConfigReader.read("weborder_url"));
    }

    public static void login(){
        //enter username
        Driver.getDriver().findElement(By.id("ctl00_MainContent_username")).sendKeys("Tester");
        //or u can write getDriver().find.... then u need to import it
        //enter password
        Driver.getDriver().findElement(By.id("ctl00_MainContent_password")).sendKeys("test");
        //click login
        Driver.getDriver().findElement(By.id("ctl00_MainContent_login_button")).click();

    }

    public static void login( String username, String password){
        //enter username
        Driver.getDriver().findElement(By.id("ctl00_MainContent_username")).sendKeys(username);
        //enter password
        Driver.getDriver().findElement(By.id("ctl00_MainContent_password")).sendKeys(password);
        //click login
        Driver.getDriver().findElement(By.id("ctl00_MainContent_login_button")).click();

    }

    public static void logout(){
        Driver.getDriver().findElement(By.id("ctl00_logout")).click();


    }

    public static boolean isAtOrderPage(){
        boolean result= false;
        try {
            WebElement header =  Driver.getDriver().findElement(By.xpath("//h2[normalize-space(.)='List of All Orders']"));//to get rid of space normalize..
            System.out.println("Element was identified");
        }catch (NoSuchElementException e){
            System.out.println("No such element!!you r not at the right place");

        }
        return result;

    }

    public static boolean verifyUserName(String userName){
        WebElement loginInfoArea =Driver.getDriver().findElement(By.cssSelector("div.login_info"));
        System.out.println("loginInfoArea.getText() = " + loginInfoArea.getText());
        return loginInfoArea.getText().contains(userName);
    }

    public static String getUserWelcomeMsg(){
        WebElement loginInfoArea =Driver.getDriver().findElement(By.cssSelector("div.login_info"));
        String welcomeMsg = loginInfoArea.getText();//Welcome, Tester! | Logout
    return welcomeMsg.replace("Welcome, ", "").replace("! | Logout", "");

    }

    public static boolean loginErrorMsgVisible(){//check for login error message is visible or not, by calling the BrowserWait method we created
        boolean elementFound=
                BrowserWait.checkVisibilityOfElement(By.xpath("//span[.='Invalid Login or Password.']"),2);
        return elementFound;
    }

    public static void selectSidebarTab(String tabName){
      //  List<String> allTabs= Arrays.asList("View all orders", "View all products", "Order");
      //  if(allTabs.contains(tabName)) {
            Driver.getDriver().findElement(By.linkText(tabName)).click();
       // }else{
        //    Driver.getDriver().findElement(By.linkText("tabName")).click();
        }
    }


