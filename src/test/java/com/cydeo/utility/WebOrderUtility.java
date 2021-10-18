package com.cydeo.utility;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WebOrderUtility {

    public static void openWebOrderApp(WebDriver driverParam){
        driverParam.get("http://secure.smartbearsoftware.com/samples/TestComplete11/WebOrders/Login.aspx");
    }

    public static void login(WebDriver driverParam){
        //enter username
        driverParam.findElement(By.id("ctl00_MainContent_username")).sendKeys("Tester");
        //enter password
        driverParam.findElement(By.id("ctl00_MainContent_password")).sendKeys("test");
        //click login
        driverParam.findElement(By.id("ctl00_MainContent_login_button")).click();

    }

    public static void login(WebDriver driverParam, String username, String password){
        //enter username
        driverParam.findElement(By.id("ctl00_MainContent_username")).sendKeys(username);
        //enter password
        driverParam.findElement(By.id("ctl00_MainContent_password")).sendKeys(password);
        //click login
        driverParam.findElement(By.id("ctl00_MainContent_login_button")).click();

    }
    public static void logout(WebDriver driverParam){
        driverParam.findElement(By.id("ctl00_logout")).click();


    }
    public static boolean isAtOrderPage(WebDriver driverParam){
        boolean result= false;
        WebDriverWait wait= new WebDriverWait(com.cydeo.utility.Driver.getDriver(), 2);
        try {
            WebElement header = driverParam.findElement(By.xpath("//h2[normalize-space(.)='List of All Orders']"));//to get rid of space normalize..
            System.out.println("Element was identified");
        }catch (NoSuchElementException e){
            System.out.println("No such element!!you r not at the right place");

        }
        return result;

    }
}
