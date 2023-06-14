package com.swt301.testng.dataprovider;

import org.testng.annotations.Test;

public class DataProviderTest {

    @Test(dataProvider = "dataSet", dataProviderClass = DataProviderList.class)
    public void testDataProvider(String username, String password) {
        System.out.println(username + "============" + password);
        // Assert.assertEquals(username, password);
    }

}
