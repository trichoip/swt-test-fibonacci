package com.swt301.testng.paramiter;

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ParamiterTest {

    @Parameters({ "datasource", "jdbcDriver" })
    @BeforeMethod
    public void beforeTest(String ds, String driver) {
        System.out.println("datasource :" + ds);
        System.out.println("jdbcDriver :" + driver);
    }

    @Parameters({ "first-name" })
    @Test
    public void testSingleString(String firstName) {
        System.out.println("firstName :" + firstName);
        // assert "admin1".equals(firstName) : "firstName is not admin1";
        Assert.assertEquals(firstName, "admin");
    }

}
