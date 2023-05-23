
Feature: XYZ Bank Test

  Background: I am On Homepage

  @sanity @regression
  Scenario: Bank Manager should add customer successfully
    Given I click On Bank Manager Login Tab
    And I click On Add Customer Tab
    Then I enter First Name
    And I enter LastName
    And I enter PostCode
    And I click On Add Customer Button
    And I should verify message "Customer added successfully"
    Then I click on ok button on popup.

  @smoke @regression
  Scenario: Bank Manager should open account successfully
    Given I click On Bank Manager Login Tab
    And I click On Open Account Tab
    Then I Search customer that is created first
    And I Select currency Pound
    And I click on process button
    And I should verify message Account created successfully
    Then I click on ok button on popup.

  @regression
  Scenario:As a Customer, I should login and log out successfully
    Given I click on Customer Login Tab
    And I search customer that i created.
    And I click on Login Button
    Then I should verify Logout Tab displayed.
    And I click on Logout
    Then I should verify Your Name text displayed.

  @regression
  Scenario:As a Customer, I should Deposit money successfully
    Given I click on Customer Login Tab
    And I search customer that i created.
    And I click on Login Button
    And I click on Deposit Tab
    Then I Enter amount 100
    And I click on Deposit Button
    Then I should verify message Deposit Successful

  @regression
  Scenario:As a Customer, I should Withdraw money successfully
    Given I click on Customer Login Tab
    And I search customer that i created.
    And I click on Login Button
    And click on Withdrawal Tab
    Then I Enter amount now 50
    And I click on Withdrawal Button
    Then I should verify message Transaction Successful