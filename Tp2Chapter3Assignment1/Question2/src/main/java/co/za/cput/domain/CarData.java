package co.za.cput.domain;

import co.za.cput.implementations.FordFocusRsImpl;

import java.io.Serializable;

/**
 *
 */
public class CarData {
    private String model;
    private int powerInKW;
    private double accelerationInSec;

    public CarData(String model, int powerInKW, double accelerationInSec){

        this.model = model;
        this.powerInKW = powerInKW;
        this.accelerationInSec = accelerationInSec;
    }

    public String getModel() {
        return model;
    }

    public int getPowerInKW() {
        return powerInKW;
    }

    public double getAccelerationInSec() {
        return accelerationInSec;
    }

    @Override
    public String toString() {
        return "CarData{" +
                "Model ='" + model + '\'' +
                ", Power in KW =" + powerInKW +
                ", Acceleration in Sec =" + accelerationInSec +
                '}';
    }

}
