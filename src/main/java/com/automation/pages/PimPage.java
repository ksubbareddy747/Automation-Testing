package com.automation.pages;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class PimPage {
	 WebDriver driver;
	    public PimPage(WebDriver driver) {
	        this.driver = driver;
	        PageFactory.initElements(driver, this); // REQUIRED
}
	    
	    @FindBy(xpath="//span[text()='PIM']")WebElement Pimmodule;
	    @FindBy(xpath="//a[text()='Add Employee']")WebElement ClickAddemployeetab;
	    @FindBy(xpath="//a[text()='Employee List']")WebElement clickemployeelisttab;
	    @FindBy(xpath="//input[@name='firstName']")WebElement firstname;
	    @FindBy(xpath="//input[@name='lastName']")WebElement lastname;
	    @FindBy(xpath="//div[text()='asdf']/../../child::div[9]/child::div/child::button[2]")WebElement deleteemployee;
	    @FindBy(xpath="/html/body/div/div[3]/div/div/div/div[3]/button[2]")WebElement YesDeleteButton;
	    
	    
	    public void clickPimModule() {
	        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
	        wait.until(ExpectedConditions.elementToBeClickable(Pimmodule)).click();
	    }
	    public void addemployeetab() {
	        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
	        wait.until(ExpectedConditions.elementToBeClickable(ClickAddemployeetab)).click();
	    }
	    public void enterfirstname() {
	        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
	        wait.until(ExpectedConditions.elementToBeClickable(firstname)).click();
	        firstname.sendKeys("asdf");
	    }
	    public void enterlastname(){
	        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
	        wait.until(ExpectedConditions.elementToBeClickable(lastname)).click();
	        lastname.sendKeys("asdf");
	    }
	    public void clickemployeelisttab() {
	    	WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
	        wait.until(ExpectedConditions.elementToBeClickable(clickemployeelisttab)).click();
	    }
	    public void deleteemployee() {
	    	WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
	        wait.until(ExpectedConditions.elementToBeClickable(deleteemployee)).click();
	    }
	    
}
