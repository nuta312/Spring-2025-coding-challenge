package testing;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class BeforeMethodDemo extends BeforeSuiteDemo{


    @BeforeMethod
    public void BeforeMethod(){
        System.out.println("Open aviasales.kg");

    }
    @Test
    void test(){

        System.out.println("Ticket to Thailand");
        Assert.assertTrue(true);
    }
    @Test
    void test1(){
        System.out.println("Ticket to Turkey");
        Assert.assertTrue(true);
    }
    @Test
    void test2(){
        System.out.println("Ticket to Italy");
        Assert.assertTrue(true);
    }
    @AfterMethod
    public void AfterMethod(){
        System.out.println("Close aviasales.kg");
    }


}
