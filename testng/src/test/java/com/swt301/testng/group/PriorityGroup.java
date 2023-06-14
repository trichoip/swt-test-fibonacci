package com.swt301.testng.group;

import org.testng.annotations.Test;

@Test(groups = "test-class-group")
public class PriorityGroup {

    @Test(priority = 3, groups = "functest", description = "Print the second test method")
    public void test1() {
        System.out.println("test 1");
    }

    @Test(priority = 1, groups = "functest", enabled = true, description = "Print the first test method")
    public void test2() {
        System.out.println("test 2");

    }

    @Test(priority = 2, groups = { "functest", "checkintest" })
    public void test3() {
        System.out.println("test 3");
    }

    @Test(priority = 4, groups = { "checkintest" })
    public void test4() {
        System.out.println("test 4");
    }

    @Test(priority = 1, groups = { "windown.net" })
    public void test5() {
        System.out.println("test windown.net");
    }

    @Test(priority = 4, groups = { "linux.muc" })
    public void test6() {
        System.out.println("test linux.muc");
    }

}
