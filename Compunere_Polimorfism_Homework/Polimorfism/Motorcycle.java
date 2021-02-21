package Compunere_Polimorfism_Homework.Polimorfism;

public class Motorcycle extends Vehicle {
    private double cmcCapacity;
    private int maxRpm;
    private boolean customExhaust;

    public Motorcycle(int numberOfWheels, String color, double cmcCapacity, int maxRpm, boolean customExhaust){
        super(numberOfWheels, color);
        this.cmcCapacity = cmcCapacity;
        this.maxRpm = maxRpm;
        this.customExhaust = customExhaust;
    }
    @Override
    public void move(){
        System.out.println("I wanna taste the freedom");
    }
    public void makeNoise(){
        System.out.println("Rapapapapa - 90db");
    }

    public void makeNoise (boolean customExhaust){
        customExhaust = true;
        System.out.println("RUTUTUTUTUTUTU - 120db");
    }
}
