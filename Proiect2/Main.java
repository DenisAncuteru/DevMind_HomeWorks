package Proiect2;

import java.util.Arrays;

public class Main  {
    public static void main (String[] args) {

        // generate a surprise
        ISurprise surprise = GatherSurprises.gather();

        //give the generated surprise and applaud
        GiveSurpriseAndApplause fifo = new GiveSurpriseAndApplause("fifo", 5);
        //add the surprise to a bag
        fifo.put(surprise);
        //offer the surprise
        fifo.giveWithPassion();

        //give the generated surprise and applaud
        GiveSurpriseAndSing lifo = new GiveSurpriseAndSing("lifo", 5);
        //add the surprise to a bag
        lifo.put(surprise);
        //offer the surprise
        lifo.giveWithPassion();

        //give the generated surprise and applaud
        GiveSurpriseAndHug random = new GiveSurpriseAndHug("random", 5);
        //add the surprise to a bag
        random.put(surprise);
        //offer the surprise
        random.giveWithPassion();

    }
}
