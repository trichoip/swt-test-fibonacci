package com.swt301.testng.beforeafter;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class BeforeAfterMethodTest {

    @BeforeClass
    public void dataSetupBeforeClass() {
        System.out.println("\nrun this Before Class 2 \n");
    }

    @AfterClass
    public void dataSetupAfterClass() {
        System.out.println("run this After Class 2");
    }

    @BeforeMethod
    public void before() {
        System.out.println("run this Before Method");
    }

    @AfterMethod
    public void after() {
        System.out.println("run this After Method \n");
    }

    @BeforeTest
    public void dataSetupBeforeTest() {
        System.out.println("run this Before Test");
    }

    @AfterTest
    public void dataSetupAfterTest() {
        System.out.println("run this After Test");
    }

    @Test(priority = 3)
    public void testMethod1() {
        System.out.println("test 1 in class 2");
    }

    @Test(priority = 2)
    public void testMethod2() {
        System.out.println("test 2 in class 2");
    }

}
