package com.cydeo.utility;

import org.openqa.selenium.By;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.ArrayList;
import java.util.List;

public class BrowserWait {

    public static void waitFor(int seconds){
        try{
            Thread.sleep(1000);
        }catch (InterruptedException e){
            e.printStackTrace();
        }
    }
    public static boolean checkVisibilityOfElement(By locator, int timeToWait){
        boolean result= false;

        WebDriverWait wait= new WebDriverWait(com.cydeo.utility.Driver.getDriver(), timeToWait);

        try {
            wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
            result= true;//when u find it result will be true
        }catch (TimeoutException e){
            System.out.println("e.getMessage() = " + e.getMessage());
        }
        return result;
    }
    /*


     */

    public static List<String> getAllText(List<WebElement> lstOfWebElements){
        List<String> allTextLst = new ArrayList<>();
        for(WebElement eachElement : lstOfWebElements){
            allTextLst.add(eachElement.getText());

        }
        return allTextLst;
    }





}
