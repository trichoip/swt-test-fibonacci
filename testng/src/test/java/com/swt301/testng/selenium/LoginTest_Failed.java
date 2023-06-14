package com.swt301.testng.selenium;

import java.sql.SQLException;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.swt301.testng.user.UserDAO;
import com.swt301.testng.user.UserDTO;

public class LoginTest_Failed extends ConfigProject {

    @Test
    public void LoginUser_Failed() throws SQLException {
        UserDTO user = UserDAO.checkLogin("trichoip", "12");
        if (user == null) {
            throw new IllegalArgumentException("username or password is incorrect");
        }
        Assert.assertEquals(user.toString(), new UserDTO("trichoip", "minh tri", "1", "US", true).toString());
    }

    @Test(dependsOnMethods = "LoginUser_Failed")
    public void UpdateUser() throws SQLException {
        UserDTO user = new UserDTO("trichoip", "tri decer", "123456", "US", true);
        Boolean userUpdate = UserDAO.update(user);
        Assert.assertTrue(userUpdate);
    }

    @Test(dependsOnMethods = "UpdateUser")
    public void SearchUser() throws SQLException {
        Boolean checkUserFullName = UserDAO.getListUser("tri decer").stream()
                .anyMatch(user -> user.getFullName().equals("tri decer"));
        Assert.assertTrue(checkUserFullName);
    }
}
