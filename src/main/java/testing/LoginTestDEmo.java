package testing;

import org.testng.annotations.Test;

public class LoginTestDEmo {
    @Test(groups={"loginTest"})
    void loginWithVAlidCreds(){
        System.out.println("LoginTestDemo: Login with");
    }@Test(groups={"loginTest"})
    void loginWithValidCreds(){
        System.out.println("Login with valid creds");
    }
    @Test(groups = "loginTest")
    void loginWithValidUsernameInvalidPassword(){
        System.out.println("Login with valid username and invalid password");
    }
    @Test(groups ="loginTest")
    void loginWithInvalidUsernameInvalidPassword(){
        System.out.println("Login with invalid username and valid password");
    }
    @Test(groups="loginTest")
    void loginWithUsernameAndInvalidPassword(){
        System.out.println("Login with ivalid password");
    }
}
