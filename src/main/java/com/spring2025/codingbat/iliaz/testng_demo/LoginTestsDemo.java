package com.spring2025.codingbat.iliaz.testng_demo;

import org.testng.annotations.Test;

public class LoginTestsDemo {
    @Test(groups = {"LoginTest"})
    void loginWithValidCreds(){
        System.out.println("LoginTestsDemo: Login with valet creds");
    }
    @Test(groups = {"LoginTest"})
    void loginWithValidUserNameAndInvalidPassword(){
        System.out.println("LoginTestsDemo: login with valid username and invalid password");
    }
    @Test(groups = {"LoginTest"})
    void loginWithInvalidUserNameAndValidPassword(){
        System.out.println("LoginTestsDemo: login with invalid username and valid password");
    }
    @Test(groups = {"LoginTest"})
    void loginWithInvalidUserNameAndInvalidPassword(){
        System.out.println("LoginTestsDemo: login with invalid username and invalid password");
    }
}
