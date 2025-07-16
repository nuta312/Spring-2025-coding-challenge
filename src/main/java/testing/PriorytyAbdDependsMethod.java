package testing;

import org.testng.Assert;
import org.testng.annotations.Test;

public class PriorytyAbdDependsMethod {

//    @Test(priority = 3)
//    void TestA(){
//        System.out.println("Test A");
//    }
//    @Test(priority = 2)
//    void TestB(){
//        System.out.println("Test B");
//    }
//    @Test(priority = 1)
//    void TestC(){
//        System.out.println("Test C");
//    }
//Depends-зависимость тестов между собой ,1 и 3 запустится если сработают предыдующие тесты, с которыми он связан
    @Test(dependsOnMethods = "test2")
    void test1(){
        System.out.println("Test 1");
    }
    @Test
    void test2(){
        System.out.println("Test 2");
        Assert.fail();
    }
    @Test(dependsOnMethods = "test1")
    void test3(){
        System.out.println("Test 3");
    }
}
