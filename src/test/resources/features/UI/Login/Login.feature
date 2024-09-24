Feature: Verify User Login page fields.
  @Release
  Scenario: Verify  Login Page fields
    Given I should see the login logo
    Then I should click on login logo
    And I should see the email login options
    Then I should click on Email login options
    And I should see Username field on this page
    When I should Input my Username
    And I should Input my My Password
    Then I should Click on Login Button
  @Release
  Scenario: Verify Mobile Category views
    Given I should see the Mobile category
    Then I should Click on Mobile Category
    And I should See Mobile product
  @Release
  Scenario: Verify Electronics Category views
    Given I should see the Electronics category
    Then I should Click on Electronics Category
    And I should See Electronics product
  @Release
  Scenario: Verify Vehicles Category views
    Given I should see the Vehicles category
    Then I should Click on Vehicles Category
    And I should See Vehicles product
  @Release
  Scenario: Verify Property Category views
    Given I should see the Property category
    Then I should Click on Property Category
    And I should See Property product
