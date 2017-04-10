package co.za.cput.implementations;

import co.za.cput.domain.CarData;
import co.za.cput.services.CarService;

/**
 *
 */
public class MercedesA45Impl implements CarService{

    public CarData getCarData()
    {
        CarData MercedesA45 = new CarData("Mercedes A45 AMG",280,4.2);
        return MercedesA45;
    }
}
