@test
  Feature: Register and login into the system
    @scenario1
    Scenario Outline: Create Account and signin
      Given User creates an account
        |Name           |Email      |
        |<FirstName>    |<Email>    |
#      Then User verifies that account is successfully created
#      And User logs out from the application
#      When User signin to magento account
#        |Email      |Password     |
#        |<Email>    |<Password>   |
#      Then User verifies account details
#      And User logs out from the application
      Examples:
        |FirstName  |Email              |
        |Avni       |soni10@gmail.com   |
