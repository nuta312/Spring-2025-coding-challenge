package tamara.lombok_demo.testng_demo;

import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.concurrent.Callable;

public class Calculator {
    public static int add(int a, int b){
        return a+b;
    }
    public static int subtract(int a, int b){
        return a-b;

    }

    public static int multiply(int a, int b){
        return a*b;

    }
    public static int divide(int a, int b){
        return a/b;
    }

    @Test
    void testAdd() {
        Assert.assertEquals(add(1,2),3);
        Assert.assertEquals("Bob","Bob");
        Assert.assertTrue(true);
        Assert.assertFalse(false);
        Assert.assertEquals(subtract(4,3),1);
        Assert.assertEquals(multiply(3,3),9);
    }




            }



