Feature: Subscription Packages
  As a user
  I want to be able to view and validate the subscription packages
  So that I can make an informed decision on which package to choose

  Scenario: View and validate subscription packages SA
    Given I navigate to the subscription page https://subscribe.stctv.com/
    When I view the subscription packages for  country SA
    Then I should see the correct subscription package type and price for the bahrain
    Then I should see the correct subscription package type and price for the kuwait
