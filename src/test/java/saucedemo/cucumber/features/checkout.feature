Feature: Checkout
  Scenario: checkout process
    Given The user is on the home page2
    And Input username 3
    And Input password 3
    And click Login button 3
    And The user chooses a "<item>" by clicking 'Add To Cart'2
    And The user clicks on the shopping cart2
    And click checkout button
    And input first name
    And input last name
    And input zip or postal code
    And The user clicks on button Continue
    And clicks finish
    Then User get message checkout complete


  Scenario: postal code is null
    Given The user is on the home page2
    And Input username 3
    And Input password 3
    And click Login button 3
    And The user chooses a "<item>" by clicking 'Add To Cart'2
    And The user clicks on the shopping cart2
    And click checkout button
    And input first name
    And input last name
    And The user clicks on button Continue
    Then User get error message postal code required