package com.spring2025.codingbat.iliaz.testng_demo;

import org.testng.Assert;
import org.testng.annotations.*;

public class BeforeClassDemo extends BeforeSuiteDemo {

    @AfterClass
    public void closeBaseUrl() {
        System.out.println("BeforeClassDemo -- After Class");

    }

    @Test
    void test() {
        System.out.println("Ticket to USA");
        Assert.assertTrue(true);
    }

    @Test
    void test1() {
        System.out.println("Ticket to Dubai");
        Assert.assertTrue(true);
    }

    @Test
    void test2() {
        System.out.println("Ticket to IK");
        Assert.assertTrue(true);
    }
    @BeforeClass
    public void openBaseUrl() {
        System.out.println("BeforeClassDemo -- Before Class");

    }

    @BeforeMethod
    public void openBaseMethod() {
        System.out.println("BeforeClassDemo -- Before method");
    }
    @AfterMethod
    public void closeBaseMethod(){
        System.out.println("BeforeClassDemo -- After method");
    }




}
