package com.company;

      import org.openqa.selenium.By;
      import org.openqa.selenium.WebDriver;
      import org.openqa.selenium.WebElement;
      import org.openqa.selenium.chrome.ChromeDriver;

 public class SeleniumLocators {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Simon's Descktop\\Desktop\\TestNG\\chromedriver_win32/chromedriver.exe");

        WebDriver driver = new ChromeDriver();
       driver.get("http://login.yahoo.com");

       //Id Locator
        WebElement username=driver.findElement(By.id("login-username"));
        username.sendKeys("tosanovs@yahoo.com");

      /* Name locator
        WebElement next = driver.findElement(By.name("signin"));
        next.click();



        //Link text locator
        WebElement forgotUsername =driver.findElement(By.linkText("Forgot username?"));
        boolean forgot = forgotUsername.isDisplayed();
        System.out.println(forgot);

        // PartialLinkText locator
        driver.findElement(By.linkText("Forgot username?")).click();
         */
        // Gornite testovi se iskluceni!


        //Css locator
        driver.findElement(By.cssSelector("#login-username"));

        //Classname locator
        driver.findElement(By.className("phone-no"));
    }
}
