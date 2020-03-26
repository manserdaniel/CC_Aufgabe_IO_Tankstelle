package com.company;

public class OMV extends GasStation{

    public OMV(String name, Fuel fuel) {
        super(name, fuel);
    }

    @Override
    double priceTankful() {

        double price = 0.0;

        switch (super.fuel) {
            case DIESEL:
                price = 1.074;
                break;
            case PETROL:
                price = 1.15;
                break;
        }

        return price;
    }

}
