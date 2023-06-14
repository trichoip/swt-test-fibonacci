package com.swt301.testng.dataprovider;

import org.testng.annotations.DataProvider;

public class DataProviderList {

    @DataProvider(name = "dataSet")
    public static Object[][] dataSet() {
        return new Object[][] {
                { "user3", "user3" },
                { "user1", "password1" },
                { "user2", "password2" },
                { "user3", "user3" }

        };
    };

}
