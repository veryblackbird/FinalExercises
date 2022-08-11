Feature: Purchase

  Scenario: System makes it possible to purchase items
    Given user is at home page
    When registered user logins to account with barack.obama@xyz.com, eRKFKLEUS5c
    And searches catalog with Sweater
    And opens sweater product page
    And chooses size M
    And chooses quantity 5, adds to chart and checks out
    And proceeds to checkout 2
    And confirms address, chooses delivery and payment and agrees to terms
    Then takes a screenshot
    And closes browser