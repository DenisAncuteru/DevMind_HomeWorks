package Compunere_Polimorfism_Homework.Compunere;

import java.util.ArrayList;

public class Screen {

    private ArrayList<Pixel> pixels;
    private Dimensions dimensions;

    public Screen(int pixelNo, int width, int height, int depth){
        this.pixels = new ArrayList<Pixel>(pixelNo);
        this.dimensions = new Dimensions(width,height,depth);
    }

    public void setPixel(int pixelIndex, String newColor){
        for(Pixel pixelsArray: pixels){
            pixels.get(pixelIndex).setPixel(newColor);
        }
    }

    public void colorScreen(String color){
        for(Pixel pixelsArray: pixels){
            pixelsArray.setPixel(color);
        }
    }


}
