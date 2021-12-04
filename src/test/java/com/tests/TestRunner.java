package com.tests;

import com.tests.reports.ExtentTestManager;
import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.DataProvider;


@CucumberOptions(
        features = "classpath:features",
        glue = "com.tests.steps",
        tags = "@SanityTest",
        plugin = {"pretty",
                "html:target/cucumber-report.html"
                ,"json:target/cucumber.json",}
)

public class TestRunner extends AbstractTestNGCucumberTests {
    @BeforeSuite
    public void beforesuite(){
        System.out.println(" beofre suite...");
        String pathOfProject = System.getProperty("user.dir");
        ExtentTestManager.setExtentReportObj(pathOfProject+"/target/extentReport.html");
    }
    @AfterSuite
    public void as() {
    	
    	ExtentTestManager.flushReport();
    }

    @DataProvider
    @Override
    public Object[][] scenarios() {
        return super.scenarios();
    }
}
