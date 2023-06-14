package com.swt301.testng.dependency;

import org.testng.annotations.Test;

public class DependencyTest {

    @Test
    public void test1() {
        System.out.println("test1");
        assert true;
    }

    @Test
    public void test2() {
        System.out.println("test2");
        assert false;
    }

    @Test(dependsOnMethods = { "test1", "test2" })
    public void test3() {
        System.out.println("test3");
    }

    @Test
    public void test4() {
        System.out.println("test4");
    }
}
