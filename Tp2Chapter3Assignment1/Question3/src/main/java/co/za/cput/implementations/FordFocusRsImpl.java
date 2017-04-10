package co.za.cput.implementations;

import co.za.cput.domain.CarData;
import co.za.cput.services.CarService;



/**
 *
 */
public class FordFocusRsImpl implements CarService{
    public CarData getCarData ()
    {
        CarData FordFocusRs = new CarData("Ford Focus RS", 257, 4.7);
        return FordFocusRs;
    }
}
