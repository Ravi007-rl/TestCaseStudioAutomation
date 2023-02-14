package utils;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.ArrayList;

public class Helpers {

    private final WebDriver driver;
    private final WebDriverWait wait;

    public Helpers(WebDriver driver){
        this.driver = driver;
        wait = new WebDriverWait(driver, Duration.ofSeconds(30));
    }

    //Driver Extension
    public void openNewTab(){
        driver.switchTo().newWindow(WindowType.TAB);
    }

    public void switchToFirstTab(){
        ArrayList<String> tabs = new ArrayList<>(driver.getWindowHandles());
        driver.switchTo().window(tabs.get(0));
    }

    public void switchToLastTab() {
        ArrayList<String> tabs = new ArrayList<>(driver.getWindowHandles());
        driver.switchTo().window(tabs.get(tabs.size()-1));
    }

    public void HardWait(int duration){
        try {
            Thread.sleep(duration* 1000L);
        }
        catch (Exception e){
            //Nothing
        }
    }


    //Element Extension
    public void clickOn(By by){
        var element = wait.until(ExpectedConditions.elementToBeClickable(by));
        element.click();
    }

    public void EnterText(By by,String text){
        var element = wait.until(ExpectedConditions.visibilityOfElementLocated(by));
        element.clear();
        element.sendKeys(text);
    }
}
