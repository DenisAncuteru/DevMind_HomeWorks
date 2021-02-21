package Compunere_Polimorfism_Homework.Polimorfism;

public class Vehicle {
    private  int numberOfWheels;
    private String color;

    public Vehicle (int numberOfWheels, String color){
        this.numberOfWheels = numberOfWheels;
        this.color = color;
    }

    public void move(){
        System.out.println("No specific vehicle");
    }
}
