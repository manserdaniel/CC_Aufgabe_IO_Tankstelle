package com.company;

public class Workshop {
    private String name = "";
    private double surcharge = 0;

    // Constructor
    public Workshop(String name, double surcharge) {
        this.name = name;
        this.surcharge = surcharge;
    }

    // Methods
    public double makeService(Car mycar) {
        double price = priceService(mycar.getKmStatus());
        mycar.setKmUntilService(-10000);
        Bill.writeBill(mycar.owner, mycar,"Service", price);
        return price;
    }

    private double priceService(double kmStand) {
        double price = 0.0;

        if (kmStand > 50000) {
            price = 2000 + (2000/100*surcharge);
        } else if (kmStand > 25000) {
            price = 1500 + (1500/100*surcharge);
        } else if (kmStand < 25000) {
            price = 500 + (500/100*surcharge);
        }
        return price;
    }

    public double repairCar(Car myCar) {
        double price = 0.0;
        if (myCar.getTires() < 10) {
            myCar.setTires(100 - myCar.getTires());
            price = 250.0;
        }
        Bill.writeBill(myCar.owner, myCar,"Repair", price);
        return price;
    }
}
