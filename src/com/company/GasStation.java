package com.company;

public abstract class GasStation {

    Fuel fuel = Fuel.DIESEL;
    private String name = "";

    // Constructor
    public GasStation(String name, Fuel fuel) {
        this.name = name;
        this.fuel = fuel;
    }

    // Methods
    public void refuel(Car mycar) {
        double price = priceTankful() * setTankful(mycar.getFuelGauge(), mycar.getTankCapacity());
        price = Math.round(price);
        mycar.owner.setFuelCosts(price);
        mycar.setFuelGauge(100);
        Bill.writeBill(mycar.owner, mycar,"Tanken", price);
    }

    private double setTankful(double tankLevel, double tankCapacity) {
        return tankCapacity - (tankCapacity / 100 * tankLevel);
    }

    abstract double priceTankful();



    // Getter & Setter

}
