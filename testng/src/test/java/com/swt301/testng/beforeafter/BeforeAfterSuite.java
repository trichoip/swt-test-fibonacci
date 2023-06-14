package com.swt301.testng.beforeafter;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

public class BeforeAfterSuite {

    @BeforeSuite
    public void dataSetupBeforeSuite() {
        System.out.println("run this Before suite");
    }

    @AfterSuite
    public void dataSetupAfterSuite() {
        System.out.println("run this After suite");
    }

}
