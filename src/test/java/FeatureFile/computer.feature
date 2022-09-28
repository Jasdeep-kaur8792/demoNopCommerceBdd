Feature: Check computer module Functionality
  Scenario: Checking Functionality of top Left Computer Module
    Given User is on home page
    And User click on computer module and click or add to cart product
    When Verify product the product is added or not
    Then checkout the product