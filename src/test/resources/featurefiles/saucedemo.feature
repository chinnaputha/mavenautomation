@sauceDemo
Feature: Test Saucedemo functionality

  @saucechrome
  Scenario: Verify that user is able to login saucedemo app
    Given Launch the application on chrome browser
    And Enter valid login credentials
    Then user should be able to login
    And Verify home page displayed

  @sauceFF
  Scenario: Verify that user is able to login saucedemo app on FF browser
    Given Launch the application on Firefox browser
    And Enter valid login credentials
    Then user should be able to login
    And Verify home page displayed
