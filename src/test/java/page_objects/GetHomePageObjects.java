package page_objects;

import org.openqa.selenium.By;

public class GetHomePageObjects {
        public static By boxSearch = By.cssSelector("input#gh-ac");
        public static By btnSearch = By.cssSelector("input#gh-btn");
        public static By drpSearch = By.cssSelector("ul[role='listbox'] > li:nth-of-type(1)");
        public static By itemTitle = By.cssSelector("[data-view='mi\\:1686\\|iid\\:1'] .s-item__title--has-tags");
}
