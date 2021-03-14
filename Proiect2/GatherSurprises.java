package Proiect2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;

public final class GatherSurprises {

    private String[] surprises;
    private static Random randomNumber = new Random();

    private GatherSurprises(){}
    private static String generateSurprise(){


        int surpriseType = randomNumber.nextInt(3);

        switch(surpriseType){
            case 0:
                return FortuneCookie.generate().toString();
            case 1:
                return Candies.generate().toString();
            case 2:
                return MinionToy.generate().toString();
            default:
                break;
        }
        return "";
    }

    public static String[] gather(int n) {

        String[] surprises = new String[n];
        for (int i = 0; i < n; i++) {
            surprises[i] = generateSurprise();
        }
        return surprises;
    }


    public static String gather(){
        return generateSurprise();
    }

}
