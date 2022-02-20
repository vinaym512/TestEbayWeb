Feature: test ebay web page
@functional
  Scenario: Assert a product's title when searched
    Given User goes to ebay home page "https://ebay.com.au"
    When User enters "Dyson V10" in search box
    And User select first item from the item list
    Then User verifies the items title has "Dyson"