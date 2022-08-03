package tests;

import org.testng.Assert;
import org.testng.annotations.Test;

public class SearchTest  extends  TestBase{

@Test
    public void searchCurrentMonth()
{
    app.search().searchCurrentMonth("Tel Aviv","8/5/2022","8/21/2022");
    app.search().submit();
   // Assert.isTrue(app.search().isList0CarsAppeared);


}
@Test
    public  void  searchCurrentYaer()
{
    app.search().searchCurrentYear("Tel Aviv","8/10/2022","10/20/2022");
    app.search().submit();
}
}
