@MedunnaRoom
Feature: medunna_room_creation


  Background: Sign In Medunna
    Given user is on "https://medunna.com/" page
    When click on user icon
    Then click on Sign In option
    And  enter "john_doe" in Username input
    And  enter "John.123" in Password input
    And click on Remember me checkbox
    And click on Sign In button

  Scenario Outline: Create Room
    And click on Items&Titles
    And click on Room option
    And click on Create a new Room button
    And enter "<room_number>" in room number input
    And select Suite option from Room Type dropdown
    And click on Status checkbox
    And enter "<price>" in price input
    And enter "<Description>" in description input
    And click on Save button
    And click on Created date
    Then assert that room is created via "<room_number>"
    And close the application
    Examples:
      | room_number | price | Description |
      | 4567500 | 123 | Good  |
      | 9860900 | 801 | excellent |
      | 1239500| 560 | very good   |
      |456020| 165 | Good  |
