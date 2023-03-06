package com.company;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class RegistrationForm {


    public static void main(String[] args){
        System.setProperty("webdriver.chrome.driver","C:\\Users\\Simon's Descktop\\Desktop\\TestNG\\chromedriver_win32/chromedriver.exe");

        WebDriver driver=new ChromeDriver();
        driver.get("https://babyshop.mk/moja-smetka/");
        WebElement reg_email = driver.findElement(By.id("reg_email"));
        reg_email.sendKeys("tosanovs@gmail.com");




        }
}