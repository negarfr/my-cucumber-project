@failed_tests
  Feature: hook_test
    Scenario: TC_01_test
      Given user is on "https://www.bluerentalcars.com/login"  page
      And user enters customer_email and customer_password
        | username       | password |
        | jack@gmail.com | 12345    |
      Then verfiy the next page url contains login keyword