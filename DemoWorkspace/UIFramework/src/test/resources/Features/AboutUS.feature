#Author
#Date
#Description

@AllFeatures
Feature: Feature to test AboutUS menu options
@functional
  Scenario Outline: Check if Offices located in New York, San Francisco, Salt Lake City and Kuala Lumpur are displaying when user clicks on AboutUS menu option
    Given browser is open
    When user searches for moneylion site 
    And user however over AboutUS menu option
    And Clicks on AboutUS submenu option
    Then User is navigated to AboutUS page
    And validate if <officelocation> are displayed
    
    Examples:
    |officelocation|
    |Offices located in New York City, San Francisco, Salt Lake City, and Kuala Lumpur.|
    
