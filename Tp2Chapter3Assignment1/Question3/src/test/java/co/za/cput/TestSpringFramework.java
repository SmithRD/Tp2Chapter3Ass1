package co.za.cput;

import co.za.cput.configeration.ConfigApp;
import co.za.cput.domain.CarData;
import co.za.cput.services.CarService;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;


/**
 *
 */
public class TestSpringFramework {

    private CarService car;

    @Before
    public void setUp() throws Exception
    {
        ApplicationContext context = new AnnotationConfigApplicationContext(ConfigApp.class);
        car = (CarService)context.getBean("BmwM2");
    }

    @Test
    public void testCarModel() throws Exception {
    CarData obj = car.getCarData();
    Assert.assertEquals(obj.getModel(),"BMW M2");
    }

    @Test
    public void testPowerInKW() throws Exception {
        CarData obj = car.getCarData();
        Assert.assertEquals(obj.getPowerInKW(), 272);
    }
        @Test
        public void testAccelerationInSec() throws Exception {
            CarData obj = car.getCarData();
            Assert.assertEquals(obj.getAccelerationInSec(), 4.3,0.1);
        }
}