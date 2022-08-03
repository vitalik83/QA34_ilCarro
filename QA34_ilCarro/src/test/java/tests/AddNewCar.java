package tests;

import models.Car;
import models.User;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.Random;

public class AddNewCar extends TestBase {

    @BeforeMethod
    public void preCondition(){
        if(!app.getHelperUser().isLogged()){
            app.getHelperUser().login(new User().setEmail("vkynitzki@mail.ru").setPassword("Vitalik83$"));

        }
        //logged?
    }
    @Test
    public  void  addNewCarSuccess(){
        Random random = new Random();
       int i = random.nextInt(1000)+1000;
        Car car = Car.builder()
                .address("Haifa, Israel")
                .make("BMW")
                .model("M5")
                .year("2021")
                .engine("2.5")
                .fuel("Petrol")
                .gear("AT")
                .wD("AWD")
                .doors("5")
                .seats("4")
                .clasS("C")
                .fuelConsumption("6.5")
                .carRegNumber("22-333-"+i)
                .price("65")
                .distanceIncluded("800")
                .features("type of features")
                .about("very nice car")



                .build();


        app.car().openCarForm();
        app.car().fillCarForm(car);
        app.car().attachPhoto("QA34_ilCarro/src/test/screenshots/screen-1.png");
        app.car().submit();
        Assert.assertEquals(app.car().getMessage(),"Car added");
    }
@AfterMethod
    public void postCondition(){
        app.car().returnToHome();
}

}
