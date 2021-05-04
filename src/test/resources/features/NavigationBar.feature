Feature: Navigation bar

  Scenario Outline: Navigation bar page redirections
    Given the user press the <btnXpath> button
    Then the <link> page should be loaded

  Examples:
  | btnXpath                          | link                                  |
  | "/html/body/nav/div[1]/ul/li[1]/a"| "https://www.demoblaze.com/index.html"|
  | "/html/body/nav/div[1]/ul/li[4]/a"| "https://www.demoblaze.com/cart.html" |

  Scenario Outline: Navigation bar popups
    Given the user press the <btnXpath> button
    Then the <popupXpath> should showed

    Examples:
    | btnXpath                          | popupXpath         |
    | "/html/body/nav/div[1]/ul/li[2]/a"| "/html/body/div[1]"|
    | "/html/body/nav/div[1]/ul/li[3]/a"| "/html/body/div[4]"|
    | "/html/body/nav/div[1]/ul/li[5]/a"| "/html/body/div[3]"|
    | "/html/body/nav/div[1]/ul/li[8]/a"| "/html/body/div[2]"|