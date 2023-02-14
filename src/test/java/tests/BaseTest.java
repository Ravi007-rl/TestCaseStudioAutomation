package tests;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import utils.DriverFactory;
import hooks.Hooks;
import org.openqa.selenium.WebDriver;

public class BaseTest {

    protected WebDriver driver ;
    protected final static String BASEURL = "https://the-internet.herokuapp.com/";

    @BeforeMethod
    public void beforeMethod(){
        driver = DriverFactory.CreateWebDriver();
        Hooks.SetUpExtension(driver);
    }

    @AfterMethod
    public void afterMethod(){
        Hooks.CleanUp(driver);
        driver.quit();
    }
}
