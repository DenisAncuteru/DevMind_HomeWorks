package Proiect2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;

public final class GatherSurprises {

    private ISurprise[] surprises;
    private static Random randomNumber = new Random();

    private GatherSurprises(){}

    private static ISurprise generateSurprise(){


        int surpriseType = randomNumber.nextInt(3);

        switch(surpriseType){
            case 0:
                return FortuneCookie.generate();
            case 1:
                return Candies.generate();
            case 2:
                return MinionToy.generate();
            default:
                return null;
        }
    }

    public static ISurprise[] gather(int n) {

        ISurprise[] surprises = new ISurprise[n];
        for (int i = 0; i < n; i++) {
            surprises[i] = generateSurprise();
        }
        return surprises;
    }


    public static ISurprise gather(){
        return generateSurprise();
    }

}
