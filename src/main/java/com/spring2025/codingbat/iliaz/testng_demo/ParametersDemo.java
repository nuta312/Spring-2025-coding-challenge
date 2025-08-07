package com.spring2025.codingbat.iliaz.testng_demo;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ParametersDemo {

    @Test
    @Parameters({"browser", "username", "password"})
    void buyIphoneTest(String browser, String username, String password){
        System.out.println("Login: " + username + "\n" + "Password: " +
                password + "\n" + browser + " Test: By iPhone");
    }
    @Test
    @Parameters("browser")
    void buySamsungTest(String browser){
        System.out.println(browser + " Test: By Samsung");
    }
    @Test
    @Parameters("browser")
    void buyXiaomiTest(String browser){
        System.out.println(browser + " Test: By Xiaomi");
    }
    @Test
    @Parameters("browser")
    void buyHonorTest(String browser){
        System.out.println(browser + " Test: By Honor");
    }
    @Test
    @Parameters("browser")
    void buyHuaweiTest(String browser){
        System.out.println(browser + " Test: By Huawei");
    }
}
