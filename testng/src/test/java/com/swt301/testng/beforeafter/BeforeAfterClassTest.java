package com.swt301.testng.beforeafter;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class BeforeAfterClassTest {

    // class
    @BeforeClass
    public void dataSetupBeforeClass() {
        System.out.println("\nrun this Before Class 1");
    }

    @AfterClass
    public void dataSetupAfterClass() {
        System.out.println("run this After Class 1");
    }

    @BeforeTest
    public void dataSetupBeforeTest() {
        System.out.println("run this Before Test");
    }

    @AfterTest
    public void dataSetupAfterTest() {
        System.out.println("run this After Test");
    }

    @Test
    public void test1() {
        System.out.println("test 1 in class 1");
    }

    @Test
    public void test2() {
        System.out.println("test 2 in class 1");
    }

    @Test
    public void test3() {
        System.out.println("test 3 in class 1");
    }

    @Test
    public void test4() {
        System.out.println("test 4 in class 1");
    }

}
