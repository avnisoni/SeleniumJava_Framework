@testIncubyte
  Feature: Login to Magento
    @scenario1
    Scenario Outline: Create Mangento Account and signin
      Given User creates a magento account
        |FirstName      |LastName     |Email      |Password     |
        |<FirstName>    |<LastName>   |<Email>    |<Password>   |
      Then User verifies that account is successfully created
      And User logs out from the application
      When User signin to magento account
        |Email      |Password     |
        |<Email>    |<Password>   |
      Then User verifies account details
      And User logs out from the application
      Examples:
        |FirstName  |LastName  |Email              |Password     |
        |Avni       |Soni      |soni10@gmail.com    |Avnisoni@4   |

    @scenario2
    Scenario Outline: Signin to Existing Mangento Account

      When User signin to magento account
        |Email      |Password     |
        |<Email>    |<Password>   |
      Then User verifies account details
      And User logs out from the application
      Examples:
        |Email              |Password     |
        |soni10@gmail.com    |Avnisoni@4   |


    @scenario3
    Scenario Outline: Create Mangento Account with existing user(negative scenario)
      Given User creates a magento account
        |FirstName      |LastName     |Email      |Password     |
        |<FirstName>    |<LastName>   |<Email>    |<Password>   |
      Then User verifies account creation failure
      Examples:
        |FirstName  |LastName  |Email              |Password     |
        |Avni       |Soni      |soni10@gmail.com    |Avnisoni@4   |
