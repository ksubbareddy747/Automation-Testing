package com.automation.stepdefinitions;

import com.automation.base.BaseClass;
import com.automation.pages.AdminPage;
import com.automation.pages.PimPage;

import io.cucumber.java.en.*;

public class PimSteps {
	 PimPage pimPage;
     
     public PimSteps() {
       pimPage = new PimPage(BaseClass.getDriver());
      }


@When("User click Pim module")
public void user_click_pim_module() {
    pimPage.clickPimModule();
}

@Then("User click on Add Employee option")
public void user_click_on_add_employee_option() {
    pimPage.addemployeetab();
}

@Then("User enter data in employee registration page")
public void user_enter_data_in_employee_registration_page() {
    pimPage.enterfirstname();
    pimPage.enterlastname();
}


//delete employee

@Then("User click Employee list option")
public void user_click_employee_list_option() {
    pimPage.clickemployeelisttab();
}

@Then("User click on delete Icon")
public void user_click_on_delete_icon() {
    pimPage.deleteemployee();
}



}
