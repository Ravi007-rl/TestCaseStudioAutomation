package pageObjects.extentionPage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import pageObjects.BasePo;

public class ExtensionPo extends BasePo {

    public ExtensionPo(WebDriver driver){
        super(driver);
    }

    //Extension url
    private static final String extensionUrl = "chrome-extension://loopjjegnlccnhgfehekecpanpmielcj/testCaseStudio/studioWindow.html";

    //Web Elements
    private static final By saveButton = By.id("save_btn");

    public void OpenExtensionPage(){
        helpers.openNewTab();
        driver.navigate().to(extensionUrl);
    }
    public void ClickOnSaveButton(){
        helpers.clickOn(saveButton);
    }
}
