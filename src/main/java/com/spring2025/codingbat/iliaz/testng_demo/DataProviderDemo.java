package com.spring2025.codingbat.iliaz.testng_demo;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProviderDemo extends BeforeSuiteDemo{

    @DataProvider(name = "loginData")
    public Object[][] logindata() {
        return new Object[][]{
                {"admin", "validPassword"},
                {"invalidUsername", "invalidPassword"},
                {"validUsername", "invalidPassword"},
                {"invalidUsername", "validPassword"},

        };
    }


    @Test(dataProvider = "loginData")
    void loginWithValidUsernameAndPassword(String username, String password) {
        System.out.println("Testing the login with: " + username + " and password: " + password);
    }

}
