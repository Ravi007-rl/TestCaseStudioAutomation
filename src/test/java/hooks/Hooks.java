package hooks;

import utils.Helpers;
import org.openqa.selenium.WebDriver;
import pageObjects.extentionPage.ExtensionPo;

public class Hooks {
    public static void SetUpExtension(WebDriver driver){
        var extensionPo = new ExtensionPo(driver);
        var helpers = new Helpers(driver);

        //Open Extension in New Window
        extensionPo.OpenExtensionPage();

        //Switch to first Tab
        helpers.switchToFirstTab();
    }

    public static void CleanUp(WebDriver driver){
        var helpers = new Helpers(driver);
        var extensionPo = new ExtensionPo(driver);

        //switch to last tab
        helpers.switchToLastTab();

        //click on saveButton
        extensionPo.ClickOnSaveButton();

        //Wait for 5 sec
        helpers.HardWait(5);
    }
}
