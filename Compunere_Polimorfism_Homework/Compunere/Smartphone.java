package Compunere_Polimorfism_Homework.Compunere;

public class Smartphone {
    private Screen theScreen;
    private Speaker theSpeaker;
    private Microphone theMicrophone;
    private Case thePhoneCase;

    public Smartphone(Screen theScreen, Case theCase,
                      Speaker theSpeaker, Microphone theMicrophone) {
        this.theScreen = theScreen;
        this.thePhoneCase = theCase;
        this.theSpeaker = theSpeaker;
        this.theMicrophone = theMicrophone;
    }

    public Smartphone(int pixelsNo, int width, int length, int depth, int speakerMaxVol,
                      int microMaxVol) {
        this.theScreen = new Screen(pixelsNo, width, length, depth);
        this.thePhoneCase = new Case();
        this.theSpeaker = new Speaker(speakerMaxVol);
        this.theMicrophone = new Microphone(microMaxVol);
    }
    public Smartphone(int pixelsNo, int width, int length, int depth, int speakerMaxVol,
                      int microMaxVol, int microCrtVol, int speakerCrtVol) {
        this.theScreen = new Screen(pixelsNo, width, length, depth);
        this.thePhoneCase = new Case();
        this.theSpeaker = new Speaker(speakerMaxVol, speakerCrtVol);
        this.theMicrophone = new Microphone(microMaxVol, microCrtVol);
    }

    public boolean setCover(Case aCover) {
        if (this.thePhoneCase != null) {
            System.out.println("Err: A cover is already in place!");
            return false;
        }
        this.thePhoneCase = aCover;
        return true;
    }

    public Case removeCover() {
        Case referenceToCover = this.thePhoneCase;
        this.thePhoneCase = null; // remove cover
        return referenceToCover;
    }

    public void pressPowerButton() {
        this.thePhoneCase.pressPowerButton();
    }

    public void pressVolumeUp() {
        if(this.thePhoneCase != null){
            this.thePhoneCase.pressVolumeUp();
            this.theSpeaker.increaseVolume();
        }
        this.theSpeaker.increaseVolume();
    }

    public void pressVolumeDown() {
        if(this.thePhoneCase != null){
            this.thePhoneCase.pressVolumeDown();
            this.theSpeaker.decreaseVolume();
        }
        this.theSpeaker.decreaseVolume();
    }

    public void setPixel(int pixelIndex, String color){
        this.theScreen.setPixel(pixelIndex,color);
    }

    public void setColor(String color){
        this.theScreen.colorScreen(color);
    }

    public void increaseMicrophoneVolume(){
        this.theMicrophone.increaseVolume();
    }

    public void decreaseMicrophoneVolume(){
        this.theMicrophone.decreaseVolume();
    }

    public void muteMicrophone(){
        this.theMicrophone.muteMicrophone();
    }

    public void setSilenceMode(){
        this.theSpeaker.setSilenceMode();
    }
}
