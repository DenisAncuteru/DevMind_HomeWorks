package Compunere_Polimorfism_Homework.Polimorfism;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        Car theCar = new Car(4, "red", 4,1595,120);
        Motorcycle theMotor = new Motorcycle(2,"black",959,1200,false);

        ArrayList<Vehicle> dealership = new ArrayList<Vehicle>();
        dealership.add(theCar);
        dealership.add(theMotor);

        for(Vehicle movement: dealership){
            movement.move();
        }

        theCar.increasePower();
        theMotor.makeNoise();
        theCar.increasePower(45);
        theMotor.makeNoise(true);
    }
}
