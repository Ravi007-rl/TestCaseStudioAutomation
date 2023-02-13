package pageObjects.extentionPage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import pageObjects.BasePo;

public class TestStudioAutomationPOM extends BasePo {

    public TestStudioAutomationPOM(WebDriver driver){
        super(driver);
    }

    private static final String ExtensionUrl = "chrome-extension://loopjjegnlccnhgfehekecpanpmielcj/testCaseStudio/studioWindow.html";

    //Web Elements
    private static final By SaveButton = By.id("save_btn");

    public void OpenExtensionPage(){
        extensionUtil.openNewTab();
        driver.navigate().to(ExtensionUrl);
    }

    public void ClickOnSaveButton(){
        extensionUtil.clickOn(SaveButton);
    }

}
