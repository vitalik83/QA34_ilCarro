package tests;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class LoginTests extends TestBase {

    @BeforeMethod
    public void preCondition() {

        if (app.getHelperUser().isLogged()) {
            app.getHelperUser().logout();
            logger.info("Test start with logout");
        }
    }

    @Test
    public void loginSuccess() {
        logger.info("Test start with email : 'vkynitzki@mail.ru' & password 'Vitalik83$'");
        app.getHelperUser().openLoginForm();
        app.getHelperUser().fillLoginForm("vkynitzki@mail.ru", "Vitalik83$");
        app.getHelperUser().submit();
        Assert.assertEquals(app.getHelperUser().getMessage(), "Logged in");
        logger.info("Test passed");

    }

    @Test
    public void loginSuccess2() {
        app.getHelperUser().openLoginForm();
        app.getHelperUser().fillLoginForm("vkynitzki@mail.ru", "Vitalik83$");
        app.getHelperUser().submit();
        Assert.assertEquals(app.getHelperUser().getMessage(), "Logged in");

    }

    @AfterMethod
    public void postCondition() {
        app.getHelperUser().clickOk();
    }
}


