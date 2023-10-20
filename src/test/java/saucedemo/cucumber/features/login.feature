Feature: Login Page Aplikasi Saucedemo

  Scenario: Success Login
    Given Halaman login saucedemo
    When Input username
    And Input Password
    And click Login button
    Then User is on Products page

  Scenario: Failed Login
    Given Halaman login saucedemo
    When Input username
    And Input Invalid Password
    And click Login button
    Then User get error message


