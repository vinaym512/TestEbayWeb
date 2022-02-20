package step_def;

import page_actions.WebPageActions;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Homepage {

    @Given("^User goes to ebay home page \"([^\"]*)\"$")
    public void go_to_ebay_home_page(String url) {
        WebPageActions.openPage(url);
    }

    @When("^User enters \"([^\"]*)\" in search box$")
    public void enter_text_in_search_box(String item) {
        WebPageActions.enterTextInSearchBox(item);
    }

    @When("User select first item from the item list")
    public void select_first_item() {
        WebPageActions.selectGivenItemFromList();
    }

    @Then("^User verifies the items title has \"([^\"]*)\"$")
    public void verify_item_title(String itemTitle) {
        WebPageActions.assertText(itemTitle);
    }
}
