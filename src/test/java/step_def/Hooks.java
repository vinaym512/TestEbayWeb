package step_def;

import utils.UtilClass;
import io.cucumber.java.After;
import io.cucumber.java.BeforeAll;

public class Hooks {

    @BeforeAll
    public static void setup() {
        UtilClass.getWebDriver();
    }

    @After
    public static void teardown() {
        UtilClass.closeBrowser();
    }
}
