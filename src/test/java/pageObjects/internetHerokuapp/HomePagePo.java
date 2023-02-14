package pageObjects.internetHerokuapp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import pageObjects.BasePo;

public class HomePagePo extends BasePo {
    public HomePagePo(WebDriver driver) {
        super(driver);
    }

    private static final By inputLink = By.xpath("//a[text()='Inputs']");

    public void ClickOnInputLink(){
        helpers.clickOn(inputLink);
    }
}
