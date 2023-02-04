@grid_feature
Feature: grid_feature

  @grid_chrome
  Scenario: TC01_running_tests_on_Chrome
    Given user is on the application_url using chrome
    Then verify the page title contains "Techpro Education"
    Then close the application

  @grid_firefox
  Scenario: TC01_running_tests_on_Firefox
    Given user is on the application_url using Firefox
    Then verify the page title contains "Techpro Education"
    Then close the application


  @grid_edge
  Scenario: TC01_running_tests_on_Firefox
    Given user is on the application_url using Firefox
    Then verify the page title contains "Techpro Education"
    Then close the application