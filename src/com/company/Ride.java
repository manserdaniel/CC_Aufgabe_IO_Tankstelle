package com.company;

public class Ride {

    private double km = 0;
    private double fuel = 100;
    private double tires = 0;

    // Constructor
    public Ride(double km) {
        this.km = km;
    }

    // Methods
    private double newFuel(double km){
        return 100/60*(km*4.5);
    }

    public void drive(Car car, double km) {
        car.setKmStatus(+km);
        car.setFuelGauge(-newFuel(this.km));
    }
}
