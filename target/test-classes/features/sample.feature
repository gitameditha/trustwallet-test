Feature: Sample Mobile Test

  Scenario: Enter PIN to unlock wallet
    Given the app is launched
    When I click the "Create New Wallet" button
    And I enter the PIN "111111"
    Then I should see the wallet home screen