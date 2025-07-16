package testing;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProviderDemo {

    @DataProvider(name = "altynai")
    public Object[][]loginData(){
        return new Object[][]{
                {"admin","validPassword  "},
                {"validUsername","invalidPassword"},
                {"validUsername", "invalidPassword"},
                {"invalidPassword ","invalidPassword"},
        };
    }
    @Test(dataProvider = "altynai")
    void loginWithInvalidUsernamePassword(String username, String password){
        System.out.println("Testing the login with: "+username + "and password: "+password);
    }
//
//    @Test
//    void loginWithUsernameAndPassword() {
//        System.out.println("Validating username and password");
//    }
//    @Test
//    void loginWithInvalidUsernamePassword(){
//        System.out.println("Invalidating username ande password");
//    }
//    @Test
//    void loginWithinvalidUsernameAndValidPassword(){
//        System.out.println("Invalid username and valid password");
//    }
//    @Test
//    void loginWithUsernameAndInvalidPassword(){
//        System.out.println("Valid username and Invalid password");
//    }
}