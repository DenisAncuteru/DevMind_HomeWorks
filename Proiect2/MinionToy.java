package Proiect2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;

public class MinionToy implements ISurprise{



    private static String[] names = {"Dave", "Carl", "Michael", "Kevin", "Stuart", "Tim"};
    private static ArrayList<String> minionName = new ArrayList<String>(Arrays.asList(getNames()));
    private static int counter;
    private String minionToGive;

    public static String[] getNames() {
        return names;
    }

    public String getMinionToGive() {
        return minionToGive;
    }

    public void setMinionToGive(String minionToGive) {
        this.minionToGive = minionToGive;
    }


    public MinionToy(String minionToGive){
        minionName.addAll(Arrays.asList(names));
        this.minionToGive = minionToGive;
    }
    
    public static MinionToy generate(){
        if(counter == minionName.size()){
            counter = 0;
        }

        String minion = minionName.get(counter);
        counter++;
        MinionToy toGive = new MinionToy(minion);

        return toGive;
    }

    public void enjoy(){
        System.out.println("Congrats! You received " + getMinionToGive() + "." );
    }

    @Override
    public String toString(){

        return "Minionul: " + minionToGive;
    }
}
