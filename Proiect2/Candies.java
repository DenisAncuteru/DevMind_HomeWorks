package Proiect2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;

public class Candies implements ISurprise{

    private static String[] typeOfCandies = {"Ciocolate", "Jeleuri", "Oua de ciocolata", "Drajeuri", "Napolitane", "Biscuiti"};
    private static ArrayList<String> candies = new ArrayList<String>(Arrays.asList(getTypeOfCandies()));
    private String candiesType;
    private static Random randomNumber = new Random();
    private int candiesNo;

    public String getCandiesType() {
        return candiesType;
    }
    public static String[] getTypeOfCandies() {
        return typeOfCandies;
    }

    public void setCandiesType(String candiesType) {
        this.candiesType = candiesType;
    }

    public int getCandiesNo() {
        return candiesNo;
    }

    public void setCandiesNo(int candiesNo) {
        this.candiesNo = candiesNo;
    }


    public Candies(String candiesType, int candiesNo){
        this.candiesType = candiesType;
        this.candiesNo = candiesNo;
    }


    public static Candies generate(){

        String candiesType = candies.get(randomNumber.nextInt(candies.size()-1));
        int candiesNumber = randomNumber.nextInt(10);
        Candies candieSurprise = new Candies(candiesType,candiesNumber);

        return candieSurprise;
    }

    @Override
    public void enjoy(){
        System.out.println("Congrats! You received " + getCandiesNo() + " " + getCandiesType());
    }

    @Override
    public String toString(){

        return candiesNo + " " + candiesType;
    }
}
