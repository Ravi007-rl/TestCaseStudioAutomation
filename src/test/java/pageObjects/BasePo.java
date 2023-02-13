package pageObjects;

import utils.ExtensionUtils;
import org.openqa.selenium.WebDriver;

public class BasePo {
    protected WebDriver driver;
    protected ExtensionUtils extensionUtil;

    public BasePo(WebDriver driver){
        this.driver = driver;
        extensionUtil = new ExtensionUtils(driver);
    }
}
