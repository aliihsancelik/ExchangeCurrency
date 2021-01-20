




 @dropdown
Feature: Currency Chart Dropdown

    Scenario: Verify Currency Chart Dropdown Options
      Given I am on the main page
      When I click Currency Chart Dropdown
      Then I should see following options
      |Ticks|
      |1 minute|
      |1 hour|
      |Daily|
      |Weekly|
      |Monthly|