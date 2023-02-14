package tests;

import org.testng.annotations.Test;
import pageObjects.internetHerokuapp.HomePagePo;
import pageObjects.internetHerokuapp.LoginPagePo;
import pageObjects.internetHerokuapp.NumberPagePo;

public class TestCaseStudioAutomationTest extends BaseTest{


    @Test
    public void VerifyLoginFunctionalityWorksSuccessfully() {
        var loginPagePo= new LoginPagePo(driver);

        //Open "Login" page of Internet Herokuapp
        driver.get(BASEURL+"login");

        //Enter UserName and Password & Click On Login Button
        loginPagePo.EnterUserNameAndPassword();
        loginPagePo.ClickOnLogInButton();
    }

    @Test
    public void VerifyUserCanEnterNumberInTextBox(){
        var homePagePo = new HomePagePo(driver);
        var numberPagePo = new NumberPagePo(driver);

        //Open "Base Url" page of Internet Herokuapp
        driver.get(BASEURL);

        //Enter go to "Input page" & Enter value in number field
        homePagePo.ClickOnInputLink();
        numberPagePo.EnterValueInNumberTextBox();
    }
}
