package com.company;

import java.util.Date;

public class Main {

    public static void main(String[] args) {
        Person me = new Person("Daniel", "Manser");

        GasStation omv = new OMV("OMV", Fuel.DIESEL);
        GasStation agip = new OMV("Agip", Fuel.DIESEL);

        Workshop vertragsWerkstatt = new Workshop("KFZ-Werkstatt", 50);
        Workshop sonstWerkstatt = new Workshop("Faire Werkstatt", 15);

        Car myBMW = new Car("BMW", "116d", 120, 10000, Fuel.DIESEL,60, me);

        System.out.println(myBMW);

        myBMW.drive(954);

        me.setCarCosts(sonstWerkstatt.makeService(myBMW));

        System.out.println(myBMW);
        System.out.println(me);

        me.setCarCosts(vertragsWerkstatt.makeService(myBMW));

        System.out.println(myBMW);
        System.out.println(me);

        me.setCarCosts(vertragsWerkstatt.repairCar(myBMW));

        omv.refuel(myBMW);
        System.out.println(myBMW);
        System.out.println(me);
        myBMW.drive(954);

        agip.refuel(myBMW);
        System.out.println(myBMW);
        System.out.println(me);
    }
}
