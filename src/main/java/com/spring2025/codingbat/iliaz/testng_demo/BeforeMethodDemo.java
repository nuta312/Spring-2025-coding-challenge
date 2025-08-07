package com.spring2025.codingbat.iliaz.testng_demo;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class BeforeMethodDemo extends BeforeSuiteDemo {

    @BeforeMethod
    public void beforeMethod(){
        System.out.println("BeforeMethodDemo --> Before Method");
    }

    @Test
    void test() {
        System.out.println("Ticket to Turkey");
        Assert.assertTrue(true);
    }

    @Test
    void test1() {
        System.out.println("Ticket to Italy");
        Assert.assertTrue(true);
    }

    @Test
    void test2() {
        System.out.println("Ticket to Thailand");
        Assert.assertTrue(true);
    }
    @AfterMethod
    public void afterMethod(){
        System.out.println("BeforeMethodDemo --> After Method");
    }
}
