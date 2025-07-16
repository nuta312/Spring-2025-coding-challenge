package testing;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ParametrsDemo {

    @Test(groups ="loginTests" )
    @Parameters({"browser", "username", "password"})
    void buyIphoneTest(String browser, String username, String password){
        System.out.println("Login" +username+"\n" +
                "password: "+password +"\n"
                +browser + "Test: buy Iphone");

    }
    @Test(groups ="loginTests" )
    @Parameters({"browser","username", "password"})
    void buySamsungTest(String browser, String username, String password){
        System.out.println("Login" +username+"\n" +
                "password: "+password +"\n"
                +browser + "Test: buy Samsung");

    }
    @Test(groups ="loginTests" )
    @Parameters({"browser","username", "password"})
    void buyRedmiTest(String browser, String username, String password){
        System.out.println("Login" +username+"\n" +
                "password: "+password +"\n"
                +browser + "Test: buy Redmi");


    }
    @Test(groups ="loginTests" )
    @Parameters({"browser","username", "password"})
    void buyNokiaTest(String browser, String username, String password){
        System.out.println("Login" +username+"\n" +
                "password: "+password +"\n"
                +browser + "Test: buy Nokia");


    }
    @Test(groups ="loginTests" )
    @Parameters({"browser","username", "password"})
    void buyFonexTest(String browser, String username, String password){
        System.out.println("Login" +username+"\n" +
                "password: "+password +"\n"
                +browser + "Test: buy Iphone");


    }
}

