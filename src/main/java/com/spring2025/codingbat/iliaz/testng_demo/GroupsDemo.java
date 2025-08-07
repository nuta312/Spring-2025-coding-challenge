package com.spring2025.codingbat.iliaz.testng_demo;

import org.testng.annotations.Test;

public class GroupsDemo {
    @Test(groups = {"LoginTest"})
    void loginWithValidCreds(){
        System.out.println("Login with valet creds");
    }
    @Test(groups = {"LoginTest"})
    void loginWithValidUserNameAndInvalidPassword(){
        System.out.println("login with valid username and invalid password");
    }
    @Test(groups = {"LoginTest"})
    void loginWithInvalidUserNameAndValidPassword(){
        System.out.println("login with invalid username and valid password");
    }
    @Test(groups = {"LoginTest"})
    void loginWithInvalidUserNameAndInvalidPassword(){
        System.out.println("login with invalid username and invalid password");
    }
    @Test(groups = {"registerTest"})
    void registerWithValidData(){
        System.out.println("Register with valid data");
    }
    @Test(groups = {"registerTest"})
    void registerWithInvalidData(){
        System.out.println("Register with invalid data");
    }
}
