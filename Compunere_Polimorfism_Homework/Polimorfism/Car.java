package Compunere_Polimorfism_Homework.Polimorfism;

public class Car extends  Vehicle{

    private int numberOfDoors;
    private double cmcCapacity;
    private int horsePower;

    public Car(int numberOfWheels, String color, int numberOfDoors, double cmcCapacity, int horsePower){
        super(numberOfWheels,color);
        this.numberOfDoors = numberOfDoors;
        this.cmcCapacity = cmcCapacity;
        this.horsePower = horsePower;
    }
    @Override
    public void move(){
        System.out.println("Let's go to a trip!");
    }

    public void increasePower(){
        this.horsePower += 25;
        System.out.println("New soft gave you 25 hp! Actual HorsePower is: " + horsePower + " HP");
    }

    public void increasePower(int howMuch){
        this.horsePower += howMuch;
        System.out.println("Okay, now you have: " + horsePower + " HP" );
    }

}
