package pageObjects.internetHerokuapp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import pageObjects.BasePo;

public class LoginPagePo extends BasePo {

    public LoginPagePo(WebDriver driver){
        super(driver);
    }

    private static final By userNameTextBox = By.id("username");
    private static final By passWordTextBox = By.id("password");
    private static final By logInButton = By.xpath("//button[@type='submit']/i[contains(text(),'Login')]");

    public void ClickOnLogInButton(){
        extensionUtil.clickOn(logInButton);
    }

    public void EnterUserNameAndPassword(){
        extensionUtil.EnterText(userNameTextBox,"tomsmith");
        extensionUtil.EnterText(passWordTextBox,"SuperSecretPassword!");
    }
}
