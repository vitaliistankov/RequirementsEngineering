@tag
Feature: Testing the form for registration
  
 
  
  Scenario Outline:Registration with invalid user name
    Given User will push registartion button
    And registration form will show
    When User will enter invalid name "<username>" 
    Then Will see a message "Invalid username!"

    Examples: 
      | username  |
      | a |
      | aa |
      | aaa |
      
    Scenario Outline:Registration with invalid password
    Given User will push registartion button
    And registration form will show
    When User will enter invalid name "<password>" 
    Then Will see a message "Invalid password!"

    Examples: 
      | password  |
      | 1 |
      | 123 |
      | 12 |