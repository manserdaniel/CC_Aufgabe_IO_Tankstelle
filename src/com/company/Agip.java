package com.company;

public class Agip extends GasStation {
    public Agip(String name, Fuel fuel) {
        super(name, fuel);
    }

    @Override
    double priceTankful() {

        double price = 0.0;

        switch (super.fuel) {
            case DIESEL:
                price = 1.0;
                break;
            case PETROL:
                price = 1.10;
                break;
        }

        return price;
    }

}
