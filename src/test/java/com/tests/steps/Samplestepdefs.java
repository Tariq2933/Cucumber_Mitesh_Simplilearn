package com.tests.steps;

import com.tests.reports.ExtentTestManager;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import org.testng.Assert;

public class Samplestepdefs {

    int num1,num2,sum;

    @Given("first number is {int}")
    public void numberIs( int arg1) {
        System.out.println(" sample step number ="+arg1);
//        ExtentTestManager.logInfo("some step executes:number ="+arg1);

        num1=arg1;
//        ExtentTestManager.logInfo("step first Number setup is passed");
    }

    @And("second number is {int}")
    public void secondNumberIs(int arg0) {
        num2=arg0;
    }

    @And("Sum of numbers is {int}")
    public void sumOfNumbersIs(int expectedSum) {
        sum= num1+num2;
        Assert.assertEquals(sum,expectedSum);
    }
}
