package com.swt301.testng.report;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.Reporter;

public class ReporterListener implements ITestListener {

    @Override
    public void onTestStart(ITestResult result) {
        Reporter.log("TestStart: " + result.getName());

    }

    @Override
    public void onTestFailure(ITestResult result) {
        Reporter.log("TestFailure: " + result.getName() + " ||" + result.getThrowable().getMessage());

    }

    @Override
    public void onTestSkipped(ITestResult result) {
        Reporter.log("TestSkipped: " + result.getName() + " ||" + result.getThrowable().getMessage());
    }

    @Override
    public void onTestSuccess(ITestResult result) {
        Reporter.log("TestSuccess: " + result.getName());

    }

}
