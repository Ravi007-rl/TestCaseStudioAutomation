package utils;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.io.File;
import java.nio.file.Paths;
import java.time.Duration;

public class DriverFactory {
    private static final String testCaseStudioPath = Paths.get("").toAbsolutePath() + "\\src\\resources\\TestCase-Studio.crx";

    public static WebDriver CreateWebDriver(){
        ChromeOptions options = new ChromeOptions();
        options.addExtensions(new File(testCaseStudioPath));
        WebDriver driver = WebDriverManager.chromedriver().capabilities(options).create();
        driver.manage().window().maximize();

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
        return driver;
    }
}
