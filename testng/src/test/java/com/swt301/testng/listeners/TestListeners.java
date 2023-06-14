package com.swt301.testng.listeners;

import org.testng.Assert;
import org.testng.SkipException;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners(value = InvokedMethodListener.class)
public class TestListeners {

    @Test
    public void testcase_1() {
        Assert.assertTrue(true);

    }

    @Test
    public void testcase_2() {
        assert false : "Testcase 2 is failed";
    }

    @Test
    public void testcase_3() {
        throw new SkipException("This test case is skipped");
    }

}
