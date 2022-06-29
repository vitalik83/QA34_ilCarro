package tests;

import org.testng.annotations.Test;

public class LoginTests extends TestBase {
    @Test
    public void loginSuccess(){
        openLoginFrom();
        fillLoginForm("vkynitzki@mail.ru","Vitalik83$");
        submintLogin();

    }




}
