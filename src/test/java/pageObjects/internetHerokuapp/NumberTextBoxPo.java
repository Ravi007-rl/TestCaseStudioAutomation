package pageObjects.internetHerokuapp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import pageObjects.BasePo;

public class NumberTextBoxPo extends BasePo {
    public NumberTextBoxPo(WebDriver driver) {
        super(driver);
    }

    private static final By numberTextBox = By.cssSelector("input[type='number']");

    public void EnterValueInNumberTextBox(){
        extensionUtil.EnterText(numberTextBox,"1234");
    }
}
