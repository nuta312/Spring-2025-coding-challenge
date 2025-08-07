package com.spring2025.codingbat.iliaz.testng_demo;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

public class BeforeSuiteDemo {
    @BeforeSuite(alwaysRun = true)
    public void browserConfiguration(){
        System.out.println("Before Suite: Window size is: 1920-1740");
    }
    @AfterSuite(alwaysRun = true)
    public void browserConfiguration2(){
        System.out.println("After suite : Clear cookies");
    }
}
