package com.cydeo.utility;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Driver {//        IMPORTANT!!!
    /*
    Create a Singleton class called Driver

1. create private no arg constructor
2. create private static field with name obj
     Data type of variable should be WebDriver
3. create public static method
     name : getDriver()
     return type :WebDriver
     param : none

     check if obj is null or not
         if yes - create ChromeDriver with all set up
        if no  -- return same obj
     */

    private static WebDriver obj;

    private Driver(){

    }

    public static WebDriver getDriver(){
        //read the browser type you want to luch from properties file
        String browserName= ConfigReader.read("browser");
        if(obj ==null) {
            //according to browser type set up driver correctly
            switch (browserName.toLowerCase() ){

                case "chrome" :
                    WebDriverManager.chromedriver().setup();
                    obj = new ChromeDriver();
                    break;
                case "firefox" :
                    WebDriverManager.firefoxdriver().setup();
                    obj = new FirefoxDriver();
                    break;
                default:
                    System.out.println("UNKNOWN BROWSER TYPE " + browserName);
                    obj = null ;
            }
            obj.manage().window().maximize();
            return obj;

           // System.out.println("creating object first time");
           // WebDriverManager.chromedriver().setup();
           // obj = new ChromeDriver();
           // obj.manage().window().maximize();
        }else{
          //  System.out.println("object already exists returning existing one");
            return obj;
        }
    }

    public static void closeBrowser(){
        //check if we have WebDriver instance or not
        //basically checking if obj is null or not
        //if not null
            //quit the browser
            //make it null, bc once quit it can not be used
        if(obj !=null){
            obj.quit();//so when ask for it again
            obj= null;
        }
    }
}