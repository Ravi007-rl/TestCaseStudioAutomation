package pageObjects.internetHerokuapp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import pageObjects.BasePo;

public class NumberPagePo extends BasePo {
    public NumberPagePo(WebDriver driver) {
        super(driver);
    }

    private static final By numberTextBox = By.cssSelector("input[type='number']");

    public void EnterValueInNumberTextBox(){
        helpers.EnterText(numberTextBox,"1234");
    }
}
