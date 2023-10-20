Feature: Validate Web Ordering
  Scenario: place a single item in the shopping cart
    Given The user is on the home page
    And Input username 2
    And Input password 2
    And click Login button 2
    And The user chooses a "<item>" by clicking 'Add To Cart'
    And The user clicks on the shopping cart
    Then There should be "1" items in the shopping cart