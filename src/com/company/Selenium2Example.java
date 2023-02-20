package com.company;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Selenium2Example {

    public static void main(String[]args){


        //Create a new instance
        System.setProperty("webdriver.chrome.driver","C:\\Users\\Simon's Descktop\\Desktop\\TestNG\\chromedriver_win32/chromedriver.exe");

        WebDriver driver = new ChromeDriver();

        //And now use this to visit Google
        driver.get("http://www.google.com");


        //Find the text input by it's name
        WebElement element=driver.findElement( By.name("q"));

        //Enter something to search for
        element.sendKeys("Cheese!");

        //Now submit the form
        element.submit();

        //Should see: Cheese! - Google search
        System.out.println("Page title is " +driver.getTitle());

        //Close the Browser
        driver.quit();
    }
}
