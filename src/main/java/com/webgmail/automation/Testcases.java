package com.webgmail.automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import java.util.concurrent.TimeUnit;
import org.apache.log4j.Logger;

import org.openqa.selenium.WebElement;

public class Testcases {
    WebDriver driver;
    Logger log;

    @BeforeTest
    public void setup()
    {
        log= Logger.getLogger("Start Project");

    }

    /**
     * This test is Written to launch the browser
     */
    @Test(priority = 1)
    public void browserLaunch() {

        System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "\\test-output\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        log= Logger.getLogger("Window Maximize");
        driver.get(Constant.url);
        log= Logger.getLogger("URL Launch");
    }

    /**
     * This test is Written to login the gmail application
     */

    @Test(priority = 2)
    public void loginMail() {

        driver.findElement((By.id(Constant.Username))).sendKeys("chandni@twojay.co");
        driver.findElement(By.id(Constant.Next1)).click();
        driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
        driver.findElement(By.xpath(Constant.Password)).sendKeys("chandni@1491");
        driver.findElement(By.xpath(Constant.Next2)).click();
    }

    /**
     * This test is written to logout the gmail application
     */

    @Test(priority = 3)
    public void logoutMail() {

       //driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
       driver.findElement(By.xpath(Constant.ProfileId)).click();
       driver.findElement(By.xpath(Constant.Logout)).click();

    }
}




