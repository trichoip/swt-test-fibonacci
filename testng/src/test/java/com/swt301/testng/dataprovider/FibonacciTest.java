/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/EmptyTestNGTest.java to edit this template
 */
package com.swt301.testng.dataprovider;

import static org.testng.Assert.*;
import org.testng.annotations.Test;
import com.swt301.testng.fibo.FibonacciUtil;

/**
 *
 * @author dangh
 */
public class FibonacciTest {

    @Test(expectedExceptions = { IllegalArgumentException.class })
    public void testFibonacciGivenWrongArgumentThrowsException() {
        // Test case: đưa data cà chớn, n âm, n quá lớn
        // hàm đc thiết kế ném về ngoại lệ !!!
        // Thấy ngoại lệ xuất hiện như kì vọng -> passed cái test -> màu xanh
        System.out.println("Invalid n. n must be a positive number");
        FibonacciUtil.Fibonacci(-5);
    }
}
