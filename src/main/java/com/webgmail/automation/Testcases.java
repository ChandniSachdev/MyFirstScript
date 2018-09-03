package com.webgmail.automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import java.util.concurrent.TimeUnit;

public class Testcases {
    WebDriver driver;

    /**
     * This test is written to launch the browser
     */
    @Test(priority = 1)
    public void browserLaunch() {

        System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "\\test-output\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get(Constant.url);

    }

    /**
     * This test is written to login the gmail application
     */

    @Test(priority = 2)
    public void loginMail() {

        driver.findElement((By.id(Constant.Username))).sendKeys("chandni@twojay.co");
        driver.findElement(By.id(Constant.Next)).click();
        driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
        driver.findElement(By.xpath(Constant.Password)).sendKeys("chandni@123");
        driver.findElement(By.id(Constant.Login)).click();

    }

    /**
     * This test is written to logout the gmail application
     */

 //   @Test(priority = 3)
   // public void logoutMail() {

        //driver.findElements(By.xpath(Constant.ProfileId)).click();
       // driver.findElements(By.xpath(Constant.Logout)).click();


    }





