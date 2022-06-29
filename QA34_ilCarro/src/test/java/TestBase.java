import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class TestBase {
    WebDriver wd;
    @BeforeMethod
    public  void  preCondition(){
        wd = new ChromeDriver();
        wd.manage().window().maximize();
        wd.manage().timeouts();
        wd.navigate().to("https://ilcarro-1578153671498.web.app/search");
    }
@AfterMethod
    public  void tearDown(){
        wd.quit();
}
}
