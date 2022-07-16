package manager;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class HelperBase {
    WebDriver wd;

    public HelperBase(WebDriver wd) {
        this.wd = wd;
    }

    public void type(By locator, String text){
        if(text!=null){
            WebElement element = wd.findElement(locator);
            element.click();
            element.clear();
            element.sendKeys(text);
        }
    }

    public void click(By locator){wd.findElement(locator).click();
    }
    public String getMessage() {
        //pause
        // pause(2000);
        //wait container
        new WebDriverWait(wd, Duration.ofSeconds(5))
                .until(ExpectedConditions.visibilityOf(wd.findElement(By.cssSelector("div.dialog-container"))));

        // String  message = wd.findElement(By.cssSelector("div.dialog-container h1")).getText();
        return wd.findElement(By.cssSelector("div.dialog-container h1")).getText();
    }

    public void submit(){
        new WebDriverWait(wd,Duration.ofSeconds(5))
                .until(ExpectedConditions.elementToBeClickable(wd.findElement(By.cssSelector("button[type='submit']"))));
        wd.findElement(By.cssSelector("button[type='submit']")).click();
        // wd.findElement(By.xpath("//button[text()='Y’alla!']")).click();  // YЕalla!
    }

    public  boolean isElementPresent(By locator){
        return wd.findElements(locator).size()>0;
    }
public  void  pause(int time){
    try {
        Thread.sleep(time);
    } catch (InterruptedException e) {
        throw new RuntimeException(e);
    }
}
}
