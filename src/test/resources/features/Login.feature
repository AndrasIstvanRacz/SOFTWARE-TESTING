Feature: Login

  Background:
    Given the Login page

  Scenario: Log in with existing user
    Given user enters username "Rabsz Olga"
    And user enters password "valamijelszo"
    When clicks on Log in button
    Then user should see "Welcome Rabsz Olga"

  Scenario: Log in with non existing user
    Given user enters username "Teszt Elek"
    And user enters password "makosguba"
    When clicks on Log in button
    Then error message displayed

