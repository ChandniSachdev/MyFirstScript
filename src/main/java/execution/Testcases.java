package execution;

import com.webgmail.automation.Constant;
import com.webgmail.automation.Reuseable;
import org.apache.log4j.spi.Configurator;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import java.util.concurrent.TimeUnit;
import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import uielements.LoginPageElements;
import com.webgmail.automation.Reuseable;


public class Testcases  {

    public static WebDriver driver;
    Reuseable reuseable;

    Logger log;

    //Logger log;

    @BeforeTest
    public void setup()
    {

        String log4jConfPath = "D:\\Chandni\\Automation\\Selenium\\p_18\\MyFirstScript\\src\\main\\resources\\log4j.properties";
        PropertyConfigurator.configure(log4jConfPath);
        log= Logger.getLogger("Start Project");

    }

    /**
     * This test is Written to launch the browser
     */
    @Test(priority = 1)
    public void browserLaunch() {

        try {

            System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "\\test-output\\chromedriver.exe");
            driver = new ChromeDriver();
            driver.manage().window().maximize();
            log = Logger.getLogger("Window Maximize");
            driver.get(Constant.url);
            log = Logger.getLogger("URL Launch");

        } catch(Exception e){

            log.error(e);
            log.debug("Unable to launch URL");

        }


    }
    /**
     * This test is Written to login the gmail application
     */

    @Test(priority = 2)
    public void loginMail() {

        try {
            LoginPageElements loginPageElements = new LoginPageElements(driver);
           /* driver.findElement((By.id(Constant.username))).sendKeys("chandni@twojay.co");
            driver.findElement(By.id(Constant.next1)).click();
            driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
            driver.findElement(By.xpath(Constant.password)).sendKeys("chandni@123");
            driver.findElement(By.xpath(Constant.next2)).click();*/

    }catch (Exception e){

            log.error(e);
            log.debug("Unable to login");
        }
    }


    /**
     * This test is written to logout the gmail application
     */

    @Test(priority = 3)
    public void logoutMail() {

        try{

       //driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
       driver.findElement(By.xpath(Constant.profileIcon)).click();
       driver.findElement(By.xpath(Constant.logout)).click();

    }catch(Exception e){

            log.error(e);
            log.debug("Unable to logout");
        }
    }
 }




