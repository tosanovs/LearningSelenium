package com.company;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


     public class ConditionalCommands {

    public static void main(String[] args) {


        //Create a new instance
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Simon's Descktop\\Desktop\\TestNG\\chromedriver_win32/chromedriver.exe");

        WebDriver driver = new ChromeDriver();

        driver.get("http://google.com");


        WebElement search = driver.findElement(By.name("btnK"));
        System.out.println(search.isDisplayed());

        driver.get("http://nop40.different.com.mk/register");
        boolean male = driver.findElement(By.id("gender-male")).isSelected();
        System.out.println(male);


        }
    }
