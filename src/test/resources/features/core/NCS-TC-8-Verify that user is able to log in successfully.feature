Feature: NCS-TC-8-Verify that user is able to log in successfully

  @sanity @NCS-TC-8
  Scenario: Verify that user is able to log in successfully
    Given I have navigated to the Norden login page
    When I select "Administrator" profile to access Norden
    And I enter the user credentials and login to Norden
    Then I verify that user successfully logged in