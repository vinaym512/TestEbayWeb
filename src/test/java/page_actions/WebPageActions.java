package page_actions;

import page_objects.GetHomePageObjects;
import utils.UtilClass;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;

public class WebPageActions {

    private static WebDriver driver = UtilClass.getDriver();

    public static void openPage(String url) {
        driver.get(url);
        UtilClass.takeScreenShot("HomePage");
    }

    public static void enterTextInSearchBox(String item) {
        if (driver.findElement(GetHomePageObjects.boxSearch).isDisplayed()) {
            driver.findElement(GetHomePageObjects.boxSearch).sendKeys(item);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        driver.findElement(GetHomePageObjects.drpSearch).click();
        UtilClass.takeScreenShot("SearchBox");
    }

    public static void selectGivenItemFromList() {
        driver.findElement(GetHomePageObjects.btnSearch);
        UtilClass.takeScreenShot("ListofMatchingItems");
    }

    public static void assertText(String txtAssert) {
        if (driver.findElement(GetHomePageObjects.itemTitle).isDisplayed()) {
            Assert.assertTrue(driver.findElement(GetHomePageObjects.itemTitle).getText().contains(txtAssert));
        }
    }

}