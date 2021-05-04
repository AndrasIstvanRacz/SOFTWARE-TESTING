Feature: Cart

  Scenario: Add to cart
    Given user select an item
    And Add to cart
    When user go to the cart page
    Then the selected item should shown in the cart

  Scenario: Delete from cart
    Given user select an item
    And Add to cart
    And user go to the cart page
    When user delete one item
    Then item removed from cart