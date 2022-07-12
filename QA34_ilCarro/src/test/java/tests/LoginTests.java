package tests;

import org.testng.annotations.Test;

public class LoginTests extends TestBase{

    @Test
    public void loginSuccess(){
        app.getHelperUser().openLoginForm();
        app.getHelperUser().fillLoginForm("vkynitzki@mail.ru","Vitalik83$");
        app.getHelperUser().submit();

    }


}


