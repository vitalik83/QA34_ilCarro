package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import java.time.Duration;

public class TestBase {
    WebDriver wd;
    @BeforeMethod
    public  void  preCondition(){
        wd = new ChromeDriver();
        wd.manage().window().maximize();
        wd.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        wd.navigate().to("https://ilcarro-1578153671498.web.app/search");
    }
@AfterMethod
    public  void tearDown(){
        wd.quit();
}
    public void openLoginFrom() {

   // wd.findElement(By.cssSelector("a[href='/login?url=%2Fsearch']")).click();
   // wd.findElement(By.cssSelector("a[href ^='/login']")).click();
   // wd.findElement(By.xpath("//a[starts-with(@href,'/login')]")).click();
    wd.findElement(By.xpath("//a[text()=' Log in ']")).click();
}
public void fillLoginForm(String email, String password)
{
    type(By.id("email"),email);
    type(By.id("password"),password);
}
public void type(By locator,String text){
        if(text != null){
            WebElement element =wd.findElement(locator);
            element.click();
            element.clear();
            element.sendKeys(text);
        }
}
public  void  submintLogin()
{
     wd.findElement(By.cssSelector("button[type='submit']")).click();

  // wd.findElement(By.xpath("//button[text()='Y’alla!']")).click();//YEalla!
}
}
