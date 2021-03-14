package Proiect2;

import java.util.Random;

public class RandomBag extends AbstractBag {

    private Random randomNumber = new Random();

    public RandomBag(){

    }

    @Override
    public ISurprise takeout() {

       return getBagOfSurprises().get(randomNumber.nextInt(getBagOfSurprises().size()));


    }
}
