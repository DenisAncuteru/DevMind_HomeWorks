package Proiect2;

import java.util.ArrayList;
import java.util.concurrent.TimeUnit;

public abstract class AbstractGiveSurprises implements IBagFactory {

    private AbstractBag bag;
    private int waitTime;


    public AbstractGiveSurprises(String bagType, int waitTime) {
        this.bag = (AbstractBag) makeBag(bagType);
        this.waitTime = waitTime;
        
    }

    public IBag makeBag(String type){
        switch( type.toUpperCase()){
            case "FIFO":
                return new FiFoBag();
            case "LIFO":
                return new LiFoBag();
            case "RANDOM":
                return new RandomBag();
            default:
                return null;
        }
    }

    public void put(ISurprise newSurprise){
        this.bag.put(newSurprise);
    }

    public void put (IBag surprises){
        this.bag.put(surprises);
    }

    public void give(){
        this.bag.takeout();
    }

    public  void giveAll(){
        try {
            for(int i=0; i < bag.size(); i++){
                give();
                TimeUnit.SECONDS.sleep(this.waitTime);
            }
        } catch (InterruptedException e) {

            e.printStackTrace();
        }

    }

    public boolean isEmpty(){
        if(bag.isEmpty()) {
            return true;
        }
        return false;
    }

    public abstract void giveWithPassion();
}
