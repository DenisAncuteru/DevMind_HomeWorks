package Proiect2;

public class GiveSurpriseAndHug extends AbstractGiveSurprises{

    public GiveSurpriseAndHug(String bagType, int waitTime) {
        super(bagType, waitTime);
    }

    @Override
    public  void giveWithPassion(){
        System.out.println("Warm wishes and a big hug!\n");

    }
}
