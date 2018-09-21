package com.webgmail.automation;


import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import uielements.LogOutElements;
import uielements.LoginPageElements;
import java.util.concurrent.TimeUnit;
import static execution.Testcases.driver;

public class Reuseable  {


    static LoginPageElements loginPageElements = new LoginPageElements(driver);
    static LogOutElements logOutElements = new LogOutElements(driver);

    public static void clickOnElement(WebElement element) {
        WebDriverWait wait = new WebDriverWait(driver, 10);
        wait.until(ExpectedConditions.visibilityOf(element));

        try {
            element.click();

        } catch (Exception e) {
            e.printStackTrace();
        }


    }

    public static void sendKeys(WebElement element, String text) {
        WebDriverWait wait = new WebDriverWait(driver, 10);
        wait.until(ExpectedConditions.visibilityOf(element));

        try {
            element.sendKeys(text);
        } catch (
                Exception e) {
            e.printStackTrace();
        }
    }

    public static void implicitWait(long time) {
        driver.manage().timeouts().implicitlyWait(time, TimeUnit.SECONDS);
    }

    public static void login(String username, String password) {
        try {
            implicitWait(100);
            sendKeys(loginPageElements.username, username);
            clickOnElement(loginPageElements.next_1);
            sendKeys(loginPageElements.password, password);
            clickOnElement(loginPageElements.next_2);

        } catch(Exception e)
        {
            e.printStackTrace();
        }



        }

    }

