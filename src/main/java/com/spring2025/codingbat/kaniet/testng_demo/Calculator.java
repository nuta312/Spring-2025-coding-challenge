package com.spring2025.codingbat.kaniet.testng_demo;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Calculator {

    public static int add(int a, int b) {
        return a + b;
    }

    public static int subtract(int a, int b) {
        return a - b;
    }

    public static int multiply(int a, int b) {
        return a * b;
    }

    public static int divide(int a, int b) {
        return a / b;
    }

    @Test
    void testAdd() {
        Assert.assertEquals(add(1, 2), 3);
        Assert.assertTrue(true);
        Assert.assertFalse(false);
    }
}
