package co.za.cput.implementations;

import co.za.cput.domain.CarData;
import co.za.cput.services.CarService;

/**
 *
 */
public class BmwM2Impl implements CarService{

    public CarData getCarData()
    {
        CarData BmwM2 = new CarData("BMW M2", 272, 4.3);
        return BmwM2;
    }
}
