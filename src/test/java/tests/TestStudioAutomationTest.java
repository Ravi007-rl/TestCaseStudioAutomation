package tests;

import pageObjects.extentionPage.TestStudioAutomationPOM;
import utils.ExtensionUtils;
import utils.DriverFactory;
import hooks.ExtensionHook;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import pageObjects.internetHerokuapp.LoginPagePOM;

public class TestStudioAutomationTest {

    private WebDriver driver ;
    private final static String BASEURL = "https://the-internet.herokuapp.com/";

    @BeforeTest
    public void beforeTest(){
        driver = DriverFactory.CreateWebDriver();
        ExtensionHook.SetUpExtension(driver);
    }

    @Test
    public void Test() {
        var loginPagePo= new LoginPagePOM(driver);

        //Open "Login" page of Internet Herokuapp
        driver.get(BASEURL+"login");

        //Enter UserName and Password & Click On Login Button
        loginPagePo.EnterUserNameAndPassword();
        loginPagePo.ClickOnLogInButton();
    }

    @AfterTest
    public void afterTest(){
        ExtensionHook.ClenUp(driver);
        driver.quit();
    }
}
