package utils;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.io.File;
import java.io.IOException;

public class UtilClass {

    private static WebDriver driver;

    public static WebDriver getWebDriver() {
        System.setProperty("webdriver.chrome.driver", "src/test/resources/drivers/chrome/chromedriver_win_98/chromedriver.exe");
        driver = new ChromeDriver();
        return driver;
    }

    public static WebDriver getGeckoDriver() {
        System.setProperty("webdriver.gecko.driver", "src/test/resources/Driver/geckodriver.exe");
        WebDriver driver = new FirefoxDriver();
        return driver;
    }

    public static WebDriver getDriver() {
        return driver;
    }

    public static void closeBrowser() {
        driver.close();
        driver.quit();
    }

    public static void takeScreenShot(String dest) {
        File src = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
        try {
            FileUtils.copyFile(src, new File("target\\screenshot\\" + dest + ".png"));
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}


