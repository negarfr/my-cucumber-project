@blue_rental_cars
Feature:blue_rental_cars

  Scenario Outline: US167854_manager_login_test

    Given user goes  on "https://www.bluerentalcars.com/"
    Then user navigates to the login page
    And enters username into "<username>"
    And enters password into "<password>"
    And click on login button
    Then Verify the login is successful
    And close the application
    Examples:
      | username | password |
      | sam.walker@bluerentalcars.com  | c!fas_art |
      | kate.brown@bluerentalcars.com  | tad1$Fas |
      | raj.khan@bluerentalcars.com    | v7Hg_va^ |
      | pam.raymond@bluerentalcars.com | Nga^g6!  |












