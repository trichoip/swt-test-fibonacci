package com.swt301.testng.selenium;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.Reporter;

public class LoginListener implements ITestListener {

    @Override
    public void onTestFailure(ITestResult result) {
        System.out.println("Test: " + result.getName() + " failed -> " + result.getThrowable().getMessage());
        Reporter.log("Test: " + result.getName() + " failed -> " + result.getThrowable().getMessage());
    }

    @Override
    public void onTestSkipped(ITestResult result) {
        System.out.println("Test: " + result.getName() + " is skipped ");
        Reporter.log("Test: " + result.getName() + " is skipped ");
    }

    @Override
    public void onTestStart(ITestResult result) {
        Reporter.log("Start test " + result.getName());
    }

    @Override
    public void onTestSuccess(ITestResult result) {
        System.out.println("Test: " + result.getName() + " success");
        Reporter.log("Test: " + result.getName() + " success");
    }
}
