package com.swt301.testng.selenium;

import java.sql.SQLException;

import org.testng.ITestResult;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;

import com.swt301.testng.user.UserDAO;
import com.swt301.testng.user.UserDTO;

public class ConfigProject {

    @BeforeSuite
    public void dataSetupBeforeSuite() {
        System.out.println("Start project webapp\n");
    }

    @AfterSuite
    public void dataSetupAfterSuite() {
        System.out.println("\nend project webapp\n");

    }

    @BeforeClass
    public void startClass() {
        System.out.println("Start class " + getClass().getSimpleName() + "\n");
    }

    @AfterClass
    public void endClass() {
        System.out.println("\nend class " + getClass().getSimpleName());
    }

    @BeforeTest
    public void registerUserForLogin() throws SQLException {
        // Register a user for login
        UserDAO.insert(new UserDTO("trichoip", "minh tri", "1", "US", true));
        System.out.println("Register user success for test in class " + getClass().getSimpleName());
    }

    @AfterTest
    public void deleteUserAfterEndAllTestInClass() throws SQLException {
        // Delete user after login
        UserDAO.delete("trichoip");
        System.out.println("Delete user success after test in class " + getClass().getSimpleName() + "\n");
    }

}
