package Compunere_Polimorfism_Homework.Compunere;

public class Speaker {

    private int maxVolume;
    private int crtVolume;

    public Speaker(int maxVolume){

        this.maxVolume = maxVolume;
        this.crtVolume = maxVolume / 4;

    }

    public Speaker(int maxVolume, int crtVolume){
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

    public boolean setSilenceMode(){
        this.crtVolume = 0;
        return true;
    }

}
