Feature: Create a new address

  Scenario Outline: System is able to create a new address
      Given user is at home page
      When registered user logins to account with barack.obama@xyz.com, eRKFKLEUS5c
      And fills form with <alias> <address> <city> <postcode> <phone>
      And clicks on Save
      Then new address is created with success message - Address successfully added!
      And closes browser

      Examples:
        | alias | address  | city | postcode  | phone |
        | barack | Street |  London   | XX-123 | 555444111 |