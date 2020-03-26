package com.company;

public class Person {

    // Variables
    private String firstName = "";
    private String lastName = "";
    private double carCosts = 0.0;
    private double fuelCosts = 0.0;


    @Override
    public String toString() {
        return firstName + " " + lastName + ", Car costs: " + String.format("%.2f", carCosts) + ", Fuel costs: " + String.format("%.2f", fuelCosts);
    }

    // Constructor
    public Person(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    // Methods

    // Getter & Setter
    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public double getCarCosts() {
        return carCosts;
    }

    public void setCarCosts(double carCosts) {
        this.carCosts = this.carCosts + carCosts;
    }

    public double getFuelCosts() {
        return fuelCosts;
    }

    public void setFuelCosts(double fuelCosts) {
        this.fuelCosts = this.fuelCosts + fuelCosts;
    }


}
