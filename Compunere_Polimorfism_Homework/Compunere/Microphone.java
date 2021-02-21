package Compunere_Polimorfism_Homework.Compunere;

public class Microphone {
    private int maxVolume;
    private int crtVolume;

    public Microphone(int maxVolume){

        this.maxVolume = maxVolume;
        this.crtVolume = maxVolume / 4;

    }

    public Microphone(int maxVolume, int crtVolume){
        this.maxVolume = maxVolume;
        this.crtVolume = crtVolume;
    }

    public boolean increaseVolume(){
        if (this.crtVolume == this.maxVolume){
            return false;
        }else{
            this.crtVolume += 1;
        }
        return true;
    }
    public boolean decreaseVolume(){
        if(this.crtVolume > 0){
            crtVolume -= 1;
            return true;
        }
        return false;
    }

    public boolean muteMicrophone(){
        this.crtVolume = 0;
        return true;
    }

}
