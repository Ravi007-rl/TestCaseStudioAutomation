package hooks;

import utils.ExtensionUtils;
import org.openqa.selenium.WebDriver;
import pageObjects.extentionPage.TestStudioAutomationPOM;

public class ExtensionHook {
    public static void SetUpExtension(WebDriver driver){
        var testStudioAutomationPOM = new TestStudioAutomationPOM(driver);
        var driverExtension = new ExtensionUtils(driver);

        //Open Extension in New Window
        testStudioAutomationPOM.OpenExtensionPage();

        //Switch to first Tab
        driverExtension.switchToFirstTab();
    }

    public static void ClenUp(WebDriver driver){
        var extensionUtils = new ExtensionUtils(driver);
        var testStudio = new TestStudioAutomationPOM(driver);

        //switch to last tab
        extensionUtils.switchToLastTab();

        //click on saveButton
        testStudio.ClickOnSaveButton();

        //Wait for 5 sec
        extensionUtils.HardWait(5);
    }
}
