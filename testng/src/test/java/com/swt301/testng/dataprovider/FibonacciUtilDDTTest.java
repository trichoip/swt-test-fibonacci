/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/EmptyTestNGTest.java to edit this template
 */
package com.swt301.testng.dataprovider;

import static org.testng.Assert.*;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import com.swt301.testng.fibo.FibonacciUtil;

/**
 *
 * @author dangh
 */
public class FibonacciUtilDDTTest {

    @DataProvider(name = "initGoodData")
    public Object[][] fibonacciTestGoodInput() {
        return new Object[][] {

                { 0, 0 },
                { 1, 1 },
                { 2, 1 },
                { 3, 2 },
                { 4, 3 },
                { 5, 5 },
                { 6, 8 }
        };
    }

    @DataProvider(name = "initBadData")
    public Object[][] fibonacciTestBadInput() {
        return new Object[][] {
                { 0, 0 },
                { 1, 1 },
                { 2, 1 },
                { 3, 2 },
                { 4.5, 3 },
                { -5, 5 },
                { 1000, 1000 }
        };
    }

    @Test(dataProvider = "initBadData")
    public void FibonacciUtilDDTTest(int actual, int expected) {
        assertEquals(FibonacciUtil.Fibonacci(actual), expected);
    }
}
