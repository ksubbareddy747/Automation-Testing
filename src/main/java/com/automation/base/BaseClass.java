package com.automation.base;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.automation.utils.ConfigReader;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {

    public static WebDriver driver;

    public static void launchBrowser(String url) {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get(url);
    }

    public static WebDriver getDriver() {
        return driver;
    }

	
	  public static void quitBrowser() {
	   if (driver != null) {
	    driver.quit(); 
	    }
	    }
	  public static boolean isUserLoggedIn() {
		    try {
		        return driver.findElement(By.id("logoutButton")).isDisplayed();
		    } catch (Exception e) {
		        return false;
		    }
		}

		public static void login() {
		    driver.get(ConfigReader.getProperty("url"));
		    // login steps here
		}

	 
}

