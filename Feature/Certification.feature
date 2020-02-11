#Author: your.email@your.domain.com
#Keywords Summary :
#Feature: List of scenarios.
#Scenario: Business rule through list of steps with arguments.
#Given: Some precondition step
#When: Some key actions
#Then: To observe outcomes or validation
#And,But: To enumerate more Given,When,Then steps
#Scenario Outline: List of steps for data-driven as an Examples and <placeholder>
#Examples: Container for s table
#Background: List of steps run before each of the scenarios
#""" (Doc Strings)
#| (Data Tables)
#@ (Tags/Labels):To group Scenarios
#<> (placeholder)
#""
## (Comments)
#Sample Feature Definition Template

Feature: Certification Feature
  Each user is can pass exam to get certified

  
  Scenario: Passing exam within requred duration and marks 
    Given User is on ExamHomeScreen
    And Presses the start button
    And Timer is started
    When Passes exam within requred duration
    And Passes exam getting requred number of marks
    
    
   
    Scenario: Passing exam out of requred duration and marks 
    Given User is on ExamHomeScreen
    And Presses the start button
    And Timer is started
    When Not passes exam within requred duration
    And Not passes exam within requred number of marks
    
    
    
    Scenario: Passing exam out of requred duration
    Given User is on ExamHomeScreen
    And Presses the start button
    And Timer is started
    When Not passes exam within requred duration
    
    
    
    Scenario: Passing exam out of requred number of marks
    Given User is on ExamHomeScreen
    And Presses the start button
    And Timer is started
    When Not passes exam within requred number of marks
    
 