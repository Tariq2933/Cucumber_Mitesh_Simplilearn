package com.tests.reports;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

public class ExtentTestManager {

    static ExtentReports extentReportsObj=null;
    static ExtentTest extentTest;

    public static void setExtentReportObj(String path){
        if (extentReportsObj == null) {
            extentReportsObj = new ExtentReports(path);
        }
    }

    public static ExtentReports getExtentReportObj(){
        return extentReportsObj;
    }

    public static ExtentTest getTest(){
        return extentTest;
    }

    public static void flushReport(){
        getExtentReportObj().flush();
    }

    public static void startTest(String nameOfTest){
        extentTest=getExtentReportObj().startTest(nameOfTest);
    }

    public static void endTest(){
        getExtentReportObj().endTest(extentTest);
    }

    public static void logInfo(String message){
        getTest().log(LogStatus.INFO,message);
    }

    public static void logSuccess(String message){
        getTest().log(LogStatus.PASS,message);
    }

    public static void logFailure(String message){
        getTest().log(LogStatus.FAIL,message);
    }
}
