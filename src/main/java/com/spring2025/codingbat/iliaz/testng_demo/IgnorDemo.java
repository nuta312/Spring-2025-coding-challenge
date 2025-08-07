package com.spring2025.codingbat.iliaz.testng_demo;

import org.testng.Assert;
import org.testng.annotations.Ignore;
import org.testng.annotations.Test;

public class IgnorDemo {

    @Test
    void test1(){
        System.out.println("Test 1");
    }
    @Test(enabled = false)
    void test2(){
        System.out.println("Test 2");

    }
    @Test
    void test3(){
        System.out.println("Test 3");
    }

    @Test
    void test4(){
        System.out.println("Test 4");
    }
    @Test
    void test5(){
        System.out.println("Test 5");
    }

}
