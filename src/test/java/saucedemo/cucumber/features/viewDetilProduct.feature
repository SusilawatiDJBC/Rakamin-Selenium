Feature: View Details Product
  Scenario: View product description
    Given The user is on the login page
    And Input username_valid
    And Input password_valid
    And click Login
    And The user clicks on the product image
    Then user can see product details