Feature: Search for more than one item test

  Background: 
    Given Am on the home page

  Scenario Outline: As a user I want to search for product using the search field
    When customer search for an "<item>"item

    Examples: 
      | item             |
      | power cord       |
      | Industrial cable |
      | Compression tool |
