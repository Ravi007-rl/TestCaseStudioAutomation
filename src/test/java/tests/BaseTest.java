package tests;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import utils.DriverFactory;
import hooks.ExtensionHook;
import org.openqa.selenium.WebDriver;

public class BaseTest {

    protected WebDriver driver ;
    protected final static String BASEURL = "https://the-internet.herokuapp.com/";

    @BeforeMethod
    public void beforeMethod(){
        driver = DriverFactory.CreateWebDriver();
        ExtensionHook.SetUpExtension(driver);
    }

    @AfterMethod
    public void afterMethod(){
        ExtensionHook.ClenUp(driver);
        driver.quit();
    }
}
