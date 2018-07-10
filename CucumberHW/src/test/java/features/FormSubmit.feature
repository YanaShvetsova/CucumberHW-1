Feature: Form automationAs a student I want to navigate to the test form,Fill it and submit

Background:
  Given user navigates to the app url

  Scenario: Form Submit

    When user fills first name with value "Ivan"
    And User fills last name with value "Petrov"
    And User fills Gender "Male"
    And User fills Date of birth "2/20/1980"
    And User fills Address "500 W Monroe st, Chicago, IL"
    And User fills Email "ivanpetrov@yahoo.com"
    And User fills Password "123456789"
    And User fills Company "Orange Inc"
    And User fills Role "Developer"
    And User select Job expectation "Excellent colleagues"
    And User fills Comment "Technical Competency"
    And User click button "Submit"
    Then form is submitted

