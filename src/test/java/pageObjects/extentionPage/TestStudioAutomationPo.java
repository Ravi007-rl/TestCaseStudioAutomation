package pageObjects.extentionPage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import pageObjects.BasePo;

public class TestStudioAutomationPo extends BasePo {

    public TestStudioAutomationPo(WebDriver driver){
        super(driver);
    }

    private static final String ExtensionUrl = "chrome-extension://loopjjegnlccnhgfehekecpanpmielcj/testCaseStudio/studioWindow.html";

    //Web Elements
    private static final By SaveButton = By.id("save_btn");
    private static final By recordedSteps = By.id("records-grid");

    public void OpenExtensionPage(){
        extensionUtil.openNewTab();
        driver.navigate().to(ExtensionUrl);
    }

    public void ClickOnSaveButton(){
        extensionUtil.clickOn(SaveButton);
    }

}
