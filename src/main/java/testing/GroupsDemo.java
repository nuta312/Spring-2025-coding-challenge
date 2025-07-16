package testing;

import org.testng.annotations.Test;

public class GroupsDemo {

    @Test(groups={"loginTest"})
    void loginWithValidCreds(){
        System.out.println("Login with valid creds");
    }
    @Test(groups = "loginTest")
    void loginWithValidUsernameInvalidPassword(){
        System.out.println("Login with valid username and invalid password");
    }
    @Test(groups ="loginTest")
    void loginWithInvalidUsernameAndInvalidPassword(){
        System.out.println("Login with invalid username and valid password");
    }
   @Test(groups = "loginTest")
    void loginWithUsernameAndInvalidPassword(){
       System.out.println("Login with ivalid password");
   }
}
