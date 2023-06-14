package com.swt301.testng.listeners;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class InvokedMethodListener implements ITestListener {

    @Override
    public void onStart(ITestContext context) {
        System.out.println("Start:");
    }

    @Override
    public void onFinish(ITestContext context) {
        System.out.println("Finish: numbertest success: " + context.getPassedTests().size() + " numbertest failed: "
                + context.getFailedTests().size() + " numbertest skipped: " + context.getSkippedTests().size());
    }

    @Override
    public void onTestStart(ITestResult result) {
        System.out.println("TestStart: " + result.getName());
    }

    @Override
    public void onTestFailure(ITestResult result) {
        System.out.println("TestFailure: " + result.getName() + " ||" + result.getThrowable().getMessage());
    }

    @Override
    public void onTestSkipped(ITestResult result) {
        System.out.println("TestSkipped: " + result.getName() + " ||" + result.getThrowable().getMessage());
    }

    @Override
    public void onTestSuccess(ITestResult result) {
        System.out.println("TestSuccess: " + result.getName());
    }

}
