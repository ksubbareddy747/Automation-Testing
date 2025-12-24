package com.automation.stepdefinitions;

import com.automation.base.BaseClass;
import com.automation.pages.AdminPage;

import io.cucumber.java.en.*;

public class AdminSteps {
 AdminPage adminPage;
        
      public AdminSteps() {
        adminPage = new AdminPage(BaseClass.getDriver());
       }
 

@When("User click admin modulue and click on Job Dropdown")
public void User_click_admin_modulue_and_click_on_Job_Dropdown() {
	adminPage.clickAdminModule();
    adminPage.clickJobDropdown();
}

@Then("User click on JobTitle option")
public void user_click_on_job_title_option() {
    adminPage.clickJobTitleOption();
}

@Then("User click on Add button and enter details in Job Title page")
public void user_click_on_add_button_and_enter_details_in_job_title_page() {
    adminPage.clickAddButton();
    adminPage.enterJobTitle();
}

@Then("User click on save button")
public void user_click_on_save_button() {
    adminPage.clickSaveButton();
    adminPage. verifysuccessmessage();
 }


//delete jobtitle
@Then("User click on delete icon")
public void user_click_on_delete_icon() {
   adminPage.clickDeleteIcon();
}

@Then("User click on yes Delete button in pop up window")
public void user_click_on_yes_delete_button_in_pop_up_window() {
    adminPage.clickYesDeleteButton();
    adminPage.verifysuccessmessage();
    }





}
