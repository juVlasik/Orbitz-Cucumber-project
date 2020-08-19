
Feature: Login feature
As a tester, I want to check login functionality using login page

  @temp
  Scenario: Negative login using random email and password
  
    Given I am on home page
    And I click on Account button
    And I click on Sign In button
    When I type in random username and no password
    And I click on Sign In button again
    Then I should see an error message
    
    

