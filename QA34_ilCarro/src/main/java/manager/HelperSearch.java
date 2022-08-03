package manager;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HelperSearch extends HelperBase{
    public HelperSearch(WebDriver wd) {
        super(wd);
    }

    public void searchCurrentMonth(String city, String dataFrom, String dataTo) {
        typeCity(city);
        selectPeriodCurrentMonth(dataFrom,dataTo);
    }

    private void selectPeriodCurrentMonth(String dataFrom, String dataTo) {
        //   8/3/2022","8/25/2022
        click(By.id("dates"));

        String [] from = dataFrom.split("/"); // ["8"],["3"],["2022"  from[1] = "25"

        String locator  = "//div[text()=' "+from[1]+" ']";
        click(By.xpath(locator));


        //     "7/30/2022"
        String [] to = dataTo.split("/"); // ["8"],["25"],["2022"]     to[1]

        String locator2 = String.format("//div[text()=' %s ']",to[1]);

        click(By.xpath(locator2));

    }

    private void typeCity(String city) {
        type(By.id("city"),city);
        click(By.cssSelector(".pac-item"));
        pause(500);
    }

    public void searchCurrentYear(String city, String dataFrom, String dataTo) {
        typeCity(city);
        selectPeriodCurrentYear(dataFrom, dataTo);

    }

    private void selectPeriodCurrentYear(String dataFrom, String dataTo) {
        //"8/10/2022","10/20/2022"

        String dataNow ="7/20/2022";
        String[]now = dataNow.split("/");
        String[] from = dataFrom.split("/");
        String[] to = dataTo.split("/");
        click(By.id("dates"));

        if(!now[0].equals(from[0])){
            
        }

    }
}