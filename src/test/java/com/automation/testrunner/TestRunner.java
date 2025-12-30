package com.automation.testrunner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
        features = {"C:\\backup\\Subba Reddy K\\Desktop\\subbareddy_workspace\\HomZera\\src\\test\\resources\\features\\Login.feature",
        		"C:\\backup\\Subba Reddy K\\Desktop\\subbareddy_workspace\\HomZera\\src\\test\\resources\\features\\admin.feature",
        		"C:\\backup\\Subba Reddy K\\Desktop\\subbareddy_workspace\\HomZera\\src\\test\\resources\\features\\Pim.feature"
        	},
        glue = {"com.automation.stepdefinitions", "com.automation.hooks"}, 
        plugin = {"pretty", "html:target/cucumber-report.html"},
        monochrome = true
)
public class TestRunner extends AbstractTestNGCucumberTests {
}

