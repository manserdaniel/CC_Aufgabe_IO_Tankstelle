package com.company;

public class Car {
    private String brand = "";
    private String type = "";
    private Fuel fuel = Fuel.DIESEL;

    private double power = 0;
    private double kmUntilService = 10000;
    private double kmStatus = 0;
    private double fuelGauge = 100;
    private double tankCapacity = 0.0;
    private double tires = 100;
    Person owner;

    @Override
    public String toString() {
        return "Car{" +
                "brand='" + brand + '\'' +
                ", type='" + type + '\'' +
                ", fuel=" + fuel +
                ", fuel gauge=" + Math.round(fuelGauge) +
                ", kmUntilService=" + kmUntilService +
                ", kmStatus=" + kmStatus +
                '}';
    }

    // Constructor
    public Car(String brand, String type, int power, int kmStatus, Fuel fuel, double tankCapacity, Person owner) {
        this.brand = brand;
        this.type = type;
        this.power = power;
        this.kmStatus = kmStatus;
        this.fuel = fuel;
        this.tankCapacity = tankCapacity;
        this.owner = owner;
    }


    // Methods
    private double newFuel(double km){
        return 100/60*(km*4.5);
    }

    public String drive(double km) {
        setKmStatus(+km);
        setKmUntilService(km);
        setFuelGauge(getFuelGauge()-km/10);
        setTires(-km/10);
        String state = "";

        if (getFuelGauge() <= 1) {
            state = "Tank leer! Bitte tanken!";
        } else if (getFuelGauge() < 10) {
            state = "Tank fast leer!";
        } else if (getKmUntilService() < 100) {
            state = "Service in " + getKmUntilService() + " km";
        }
        return state;
    }

    // Getter & Setter
    public double getPower() {
        return power;
    }

    public void setPower(double power) {
        this.power = power;
    }

    public double getKmUntilService() {
        return kmUntilService;
    }

    public void setKmUntilService(double kmUntilService) {
        this.kmUntilService = this.kmUntilService - kmUntilService;
    }

    public double getKmStatus() {
        return kmStatus;
    }

    public void setKmStatus(double kmStatus) {
        this.kmStatus = this.kmStatus + kmStatus;
    }

    public double getFuelGauge() {
        return fuelGauge;
    }

    public void setFuelGauge(double fuelGauge) {
        this.fuelGauge = fuelGauge;
    }

    public double getTankCapacity() {
        return tankCapacity;
    }

    public void setTankCapacity(double tankCapacity) {
        this.tankCapacity = tankCapacity;
    }

    public double getTires() {
        return tires;
    }

    public void setTires(double tires) {
        this.tires = this.tires + tires;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}
