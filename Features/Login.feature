Feature: Login
  Scenario: Succeful Login With Valid Credentials
    Given User Launch Chrome Browser
    When User Opens URL "http://admin-demo.nopcommerce.com/login"
    And User Enters email as "admin@yourstore.com" and Password as "admin"
    And Click on Login
    Then Page Title Should be "Dashboard / nopCommerce administration"
    When User Click on log Out link
    Then Page Title Should be "Your Store.Login"
    And Close browser

  Scenario Outline: Succeful Login With Valid Credentials and Data Driven
    Given User Launch Chrome Browser
    When User Opens URL "http://admin-demo.nopcommerce.com/login"
    And User Enters email as "<email>" and Password as "<password>"
    And Click on Login
    Then Page Title Should be "Dashboard / nopCommerce administration"
    When User Click on log Out link
    Then Page Title Should be "Your Store.Login"
    And Close browser
    Examples:
      |email  |password |
      | admin@yourstore.com | admin |
      | admin1@yourstore.com | admin123 |

