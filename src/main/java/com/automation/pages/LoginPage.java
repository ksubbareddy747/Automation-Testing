package com.automation.pages;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.automation.utils.ConfigReader;

public class LoginPage {

    WebDriver driver;
    public LoginPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this); // REQUIRED
    }

    @FindBy(xpath = "//input[@name='username']")WebElement usernameField;
    @FindBy(xpath = "//input[@name='password']")WebElement passwordField;
    @FindBy(xpath = "//button[text()=' Login ']")WebElement LoginButton;
    @FindBy(xpath="//label[text()='Email']/../small[@class='text-danger']")WebElement Toastifymsg;
    @FindBy(xpath="//small[contains(text(),'email')]")WebElement emailErrorMsg;
    @FindBy(xpath="//small[contains(text(),'Password')]")WebElement PasswordErrorMsg;
    

    
    public void loginWithConfigData(String username, String password) {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        WebElement usernameEle = wait.until(ExpectedConditions.visibilityOf(usernameField));
        usernameEle.sendKeys(username);
        passwordField.sendKeys(password);
    }

	
	  public void clickLogin() { 
		  LoginButton.click(); 
	}
	 
	 public void login_success_or_not() throws Exception {
		 String expectedUrl="https://opensource-demo.orangehrmlive.com/web/index.php/dashboard/index";
	    String actualUrl=driver.getCurrentUrl();
	    Thread.sleep(2000);
	    if(actualUrl.equals(expectedUrl)) {
	    	System.out.println("Login Successfull");
	    }
	 }
	 public void loginWithInvalidData(String username, String Password) {
		 usernameField.sendKeys(username);
		 passwordField.sendKeys(Password);
		
	 }
	 public void getToastifyMessage() throws Exception {
		    boolean toast = false;
		    boolean email = false;
		    boolean password = false;
		    try { 
		    	Thread.sleep(2000);
		    	toast = Toastifymsg.isDisplayed(); } 
		    catch (Exception e) {}

		    try { email = emailErrorMsg.isDisplayed(); } 
		    catch (Exception e) {}

		    try { password = PasswordErrorMsg.isDisplayed(); } 
		    catch (Exception e) {}

		    if (toast || email || password) {
		        System.out.println("Error message is displayed");
		    } else {
		        System.out.println("No error message found");
		    }
		}


	 
	 
}
