package testing;

import org.testng.Assert;
import org.testng.annotations.*;

public class BeforeClassDemo extends BeforeSuiteDemo{

@BeforeClass
public void BeforeMethod(){
    System.out.println("BeforeMethodCLassDemo---->Before Method");
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

    @BeforeClass
    public void openBAseUrl(){
        System.out.println("Open aviasales.kg");
        System.out.println("Create new user");
    }
    @AfterClass
    public void CloseBAseUrl(){
        System.out.println("Close aviasales.kg");
        System.out.println("Delete user");

    }
@BeforeMethod
    public void openBaseMethod(){
    System.out.println("Before Method");
    }
    @AfterMethod
    public void closeBaseMethod(){
        System.out.println("Close");
    }
}
