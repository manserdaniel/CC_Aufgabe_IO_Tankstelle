package com.company;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Bill {

    private static FileWriter billWriter;
    private static File bill = new File("C:\\Users\\daniel\\Desktop\\CodingCampus\\Objekte\\Car\\src\\Bill.txt");

    public static void writeBill(Person person, Car car, String service, double price) {
        try {
            billWriter = new FileWriter(bill, true);
            billWriter.write("\n" + person.getFirstName() + " " + person.getLastName() + ";"  + car.getBrand() + car.getType() + ";" + service + ";" + price);
            billWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
