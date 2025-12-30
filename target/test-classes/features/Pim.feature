Feature: Pim functionality
  
Scenario: add employee
   When User click Pim module
   Then User click on Add Employee option
   Then User enter data in employee registration page
   And User click on save button
   

Scenario: Delete employee
   When User click Pim module
   Then User click Employee list option
   Then User click on delete Icon 
   And User click on yes Delete button in pop up window