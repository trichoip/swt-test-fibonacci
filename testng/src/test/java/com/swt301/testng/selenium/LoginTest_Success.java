package com.swt301.testng.selenium;

import java.sql.SQLException;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.swt301.testng.user.UserDAO;
import com.swt301.testng.user.UserDTO;

public class LoginTest_Success extends ConfigProject {

    @Test
    public void LoginUser_Success() throws SQLException {
        UserDTO user = UserDAO.checkLogin("trichoip", "1");
    }

    @Test(dependsOnMethods = "LoginUser_Success")
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
