package Proiect2;

public interface IBag {

    void put(ISurprise surprise); // add a surprise in the bag
    void put(IBag bagOfSurprises); //adds all surprises from another IBag;
    ISurprise takeout(); // removes a surprise from the bag and returns it
    boolean isEmpty(); // check if the bag is empty or not
    int size(); //number of surprises

}
