package testing;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

public class BeforeSuiteDemo {

    @BeforeSuite(alwaysRun = true)
    public void browserCobfiguration(){
        System.out.println("Window size is: 1920-1740");

    }
    @AfterSuite(alwaysRun=true)
    public void browserConfiguration2(){
        System.out.println("After suite:Clear cookies");
    }

}
