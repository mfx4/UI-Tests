Feature: Complete the following scenarios

  @currencies
  Scenario: Verify the HTTP status code
    When Tester sends request
    Then Tester gets response status code 200
    And Tester gets count the total number of currencies
    And Currency "GBP" is shown within the response