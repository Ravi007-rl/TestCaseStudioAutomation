package pageObjects;

import utils.Helpers;
import org.openqa.selenium.WebDriver;

public class BasePo {
    protected WebDriver driver;
    protected Helpers helpers;

    public BasePo(WebDriver driver){
        this.driver = driver;
        helpers = new Helpers(driver);
    }
}
