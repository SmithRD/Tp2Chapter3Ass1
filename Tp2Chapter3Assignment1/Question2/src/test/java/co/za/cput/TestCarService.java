package co.za.cput;

import co.za.cput.domain.CarData;
import org.junit.Assert;
import org.junit.Test;

/**
 *
 */
public class TestCarService {

    @Test
    public void testCarModel() throws Exception {
        CarData BmwM2 = new CarData("BMW M2", 272, 4.3);
        Assert.assertEquals(BmwM2.getModel(),"BMW M2");
    }

    @Test
    public void testCarPowerInKW() throws Exception {
        CarData BmwM2 = new CarData("BMW M2", 272, 4.3);
        Assert.assertEquals(BmwM2.getPowerInKW(),272);
    }

    @Test
    public void testCarAccelerationInSec() throws Exception {
        CarData BmwM2 = new CarData("BMW M2", 272, 4.3);
        Assert.assertEquals(BmwM2.getAccelerationInSec(),4.3,0.1);
    }


}
