package com.company;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrowserNavigationCommands {

    public static void main(String[] args) {


        //Create a new instance
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Simon's Descktop\\Desktop\\TestNG\\chromedriver_win32/chromedriver.exe");

        WebDriver driver = new ChromeDriver();

        //driver.object.get("Url");
        driver.get("http://www.google.com");
        String url= driver.getCurrentUrl();
        System.out.println(url);

        //driver.object.navigate.to("Url");
        driver.navigate().to("http://login.yahoo.com");
        url=driver.getCurrentUrl();
        System.out.println("url");

        //driver.object.navigate.to back("Url");
        driver.navigate().back();
        url=driver.getCurrentUrl();
        System.out.println("url");

        //Closing browser
        //driverObject.close()
        driver.quit();
    }
}