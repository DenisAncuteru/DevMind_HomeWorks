package Proiect2;

public class LiFoBag extends AbstractBag {

    @Override
    public ISurprise takeout() {
        return getBagOfSurprises().get(getBagOfSurprises().size()-1);

    }
}
