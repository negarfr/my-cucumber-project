@google_search
Feature: first feature file

  Background: user_goes_to_google_page
    Given user is on the google home page

  @iphone_search
  Scenario: TC_01_first_scenario

    When user search for iphone
    Then verify page  title contains iPhone
    Then close the application

  @teapot_search
  Scenario: TC_02_teapot_search

  When user search for Teapot
  Then verify page title contains Teapot
  Then close the application

#  All feature files must begin with "Feature:" keyword
#  Feature : To declare the file as a cucumber feature file. Mandatory. There can be ONLY one Feature: keyword
#  Scenario : To create test case. In a feature file there may be more than one Scenario:
# to RUN : write click on FeatureFile on left and run it
# we use runner to run the feature file
# Background : Used to run before each Scenarios. this is used for repeated pre_conditions

# CUCUMBER steps :
#  1. create feature file and test scenarios
#  2. run the feature file and generate step definitions. dryRun=true
#  3. use the step definitions to complete the java code
#  4. dryRun=false to execute test cases
#===============