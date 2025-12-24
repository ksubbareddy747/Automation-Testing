package com.automation.stepdefinitions;
import com.automation.base.BaseClass;
import com.automation.pages.LoginPage;
import com.automation.utils.ConfigReader;
import com.github.dockerjava.api.model.Driver;

import io.cucumber.java.en.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginSteps {

    LoginPage loginPage;
    
   // login with valid credentials

    @Given("User is on Login Page")
    public void user_is_on_login_page() {
        loginPage = new LoginPage(BaseClass.getDriver());
    }

    @When("User enters valid username and password")
    public void user_enters_valid_username_and_password() {
        loginPage.loginWithConfigData(
                ConfigReader.getProperty("username"),
                ConfigReader.getProperty("password")
        );
        
      
    }


    @When("User click on Login button")
    public void user_click_on_login_button() {
        loginPage.clickLogin();
    }

    @Then("User should navigate to Dashboard")
    public void user_should_navigate_to_dashboard() {
        loginPage.login_success_or_not();
    }
    
    //login with invalid credentials
   /* @When("^User enters invalid (.*) and (.*)$")
    public void user_enters_invalid_admin_admin_com_and_passw0rd(String username, String password) {
    	loginPage.loginWithInvalidData(username, password);
        
    }
    @When("User click on signin button")
    public void user_click_on_signin_button() {
        loginPage.clickLogin();
    }
    @Then("User check err msg displayed or not while user after enter invalid credentials")
    public void user_check_err_msg_displayed_or_not_while_user_after_enter_invalid_credentials() throws Exception {
        loginPage.getToastifyMessage();
    }*/
}
