Feature: NCS-TC-7-Verify admin is able to send invitation to new users

  @sanity @NCS-TC-7
  Scenario: Verify that user is able to log in successfully
    Given I have navigated to the Norden login page
    When I select "Administrator" profile to access Norden
    And I enter the user credentials and login to Norden
    Then I verify that user successfully logged in
    When I select "Settings" sub menu from "User" main menu