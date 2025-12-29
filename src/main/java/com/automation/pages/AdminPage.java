package com.automation.pages;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AdminPage {
	 WebDriver driver;
	    public AdminPage(WebDriver driver) {
	        this.driver = driver;
	        PageFactory.initElements(driver, this); // REQUIRED
	    }
	    
	    @FindBy(xpath="//span[text()='Admin']")WebElement AdminModule;
	    @FindBy(xpath = "//span[text()='Job ']")WebElement Jobdropdown;
	    @FindBy(xpath = "//ul[@class='oxd-dropdown-menu']/li[1]")WebElement JobTitleOption;
	    @FindBy(xpath = "//button[text()=' Add ']")WebElement AddButton;
	    @FindBy(xpath="/html/body/div/div[1]/div[2]/div[2]/div/div/form/div[1]/div/div[2]/input")WebElement JobTitleField;
	    @FindBy(xpath="//button[text()=' Save ']")WebElement SaveButton;
	    @FindBy(xpath="//div[text()='asdf']/../following-sibling::div[2]/child::div/child::button[2]")WebElement EditIcon;
	    @FindBy(xpath="//div[text()='asdfasdf']/../following-sibling::div[2]/child::div/child::button[1]")WebElement DeleteIcon;
	    @FindBy(xpath="/html/body/div/div[3]/div/div/div/div[3]/button[2]")WebElement YesDeleteButton;
	    @FindBy(xpath="//p[text()='Success']/following-sibling::p")WebElement Successmessage;
	    
	    
	    
	    public void clickAdminModule() {
	        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
	        wait.until(ExpectedConditions.elementToBeClickable(AdminModule)).click();
	    }
	    public void clickJobDropdown() {
	    	WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
	        wait.until(ExpectedConditions.elementToBeClickable(Jobdropdown)).click();
	    
	    }
	    public void clickJobTitleOption() {
	    	WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
	        wait.until(ExpectedConditions.elementToBeClickable(JobTitleOption)).click();
	    	
	    }
	    public void clickAddButton() {
	    	WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
	        wait.until(ExpectedConditions.elementToBeClickable(AddButton)).click();
	    
	    }
	    public void enterJobTitle() {
	    	WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
	        wait.until(ExpectedConditions.elementToBeClickable(JobTitleField)).click();
	        JobTitleField.sendKeys("asdf"); 
	  
	    }
	    public void clickSaveButton() {
	    	WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
	        wait.until(ExpectedConditions.elementToBeClickable(SaveButton)).click();
	        
	    
	    }
	    
	    public void clickEditIcon() {
	    	WebDriverWait wait= new WebDriverWait(driver, Duration.ofSeconds(10));
	    	wait.until(ExpectedConditions.elementToBeClickable(EditIcon)).click();
	    	wait.until(ExpectedConditions.elementToBeClickable(JobTitleField)).click();
	    	JobTitleField.sendKeys("asdf");
	    }
	    public void clickDeleteIcon() {
	    	WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
	        wait.until(ExpectedConditions.elementToBeClickable(DeleteIcon)).click();
	    }
	    public void clickYesDeleteButton() {
	    	WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
	        wait.until(ExpectedConditions.elementToBeClickable(YesDeleteButton)).click();
	    }
	    public void verifysuccessmessage() {
           WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
           wait.until(ExpectedConditions.visibilityOf(Successmessage));
           if(Successmessage.isDisplayed()) {
        	   System.out.println(Successmessage.getText());
           }
	    }
}