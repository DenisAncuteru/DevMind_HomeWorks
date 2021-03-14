package Proiect2;

public class FiFoBag extends AbstractBag {

    public FiFoBag(){
    }

    @Override
    public ISurprise takeout() {
       return getBagOfSurprises().get(0);

    }




}
