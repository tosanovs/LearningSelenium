package com.company;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


    public class PageCommands {

        public static void main(String[] args) {


            //Create a new instance
            System.setProperty("webdriver.chrome.driver", "C:\\Users\\Simon's Descktop\\Desktop\\TestNG\\chromedriver_win32/chromedriver.exe");

            WebDriver driver = new ChromeDriver();

            //driver.object.get("Url");
            driver.get("http://www.google.com");
            String url = driver.getCurrentUrl();
            System.out.println(url);

            //Get title
            String tile = driver.getTitle();
            System.out.println(tile);

            String pagesource = driver.getPageSource();
            System.out.println(pagesource);

        }
    }
