package Proiect2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public abstract class AbstractBag implements IBag {

    private ArrayList<ISurprise> bagOfSurprises;

    public AbstractBag() {
        this.bagOfSurprises = new ArrayList<>();
    }

    public ArrayList<ISurprise> getBagOfSurprises() {

        return bagOfSurprises;
    }

    public void setBagOfSurprises(ArrayList<ISurprise> bagOfSurprises) {
        this.bagOfSurprises = bagOfSurprises;
    }

    public void put(ISurprise surprise){
        bagOfSurprises.add(surprise);
    }
    public void put(IBag anotherBag){

        bagOfSurprises.addAll(((AbstractBag)anotherBag).getBagOfSurprises());

    }

    public boolean isEmpty(){
        if(this.bagOfSurprises.size() == 0) {
            return true;
        }
        return false;
    }
    public int size(){
        return bagOfSurprises.size();
    } //number of surprises


}
