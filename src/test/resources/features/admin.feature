Feature: Register Job Title functionality
  
Scenario: add job title
   When User click admin modulue and click on Job Dropdown
   Then User click on JobTitle option
   Then User click on Add button and enter details in Job Title page
   And User click on save button
   
Scenario: Edit Job title
    When User click admin modulue and click on Job Dropdown
   Then User click on JobTitle option
   Then User click on edit icon and update details
   And User click on save button
   
Scenario: Delete job title
   When User click admin modulue and click on Job Dropdown
   Then User click on JobTitle option
   Then User click on delete icon 
   And User click on yes Delete button in pop up window