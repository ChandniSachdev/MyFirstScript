package uielements;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

/** This class contains all the webelements of Login Page
 * Created by Chandni Sachdev on 19/09/2018*/

public class LoginPageElements {

    public class LoginPageElements{

        public LoginPageElements(WebDriver driver)  {
//This initlements method will create all Webelements
            PageFactory.initElements(driver, this); }

         @FindBy(id="identifierId")
         public WebElement username;

         @FindBy(id="identifierNext")
         public WebElement next_1;

         @FindBy(xpath="//*[@id=\"passwordNext\"]/div[2]")
         public WebElement next_2;

         @FindBy(xpath="//*[@id=\"password\"]/div[1]/div/div[1]/input")
         public WebElement password;


        }

    }





}
