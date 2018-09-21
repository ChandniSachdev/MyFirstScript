package uielements;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;


public class LogOutElements {

public LogOutElements(WebDriver driver){
    PageFactory.initElements(driver, this);}



           @FindBy(xpath="/html/body/div[7]/div[3]/div/div[1]/div[4]/div[1]/div[1]/div[1]/div/div[5]/div[1]/a/span")
           public WebElement profileIcon;

           @FindBy(xpath="//a[@id=gb_71]")
           public WebElement logout;

                    }