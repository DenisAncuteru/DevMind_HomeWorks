package GeometricFigures;

import Recap_String.StringToNumber;

import java.security.PublicKey;

public class Triangle extends  Shape {
    private int base;
    private int height;

    public Triangle() {
        this.base = 0;
        this.height = 0;
    }

    public Triangle(String text, String material, int base, int height) {
        super(text, material);
        this.base = base;
        this.height = height;
    }
    @Override
    public void displayHeight(){
        System.out.println("Triangle Height is: " + this.height);
    }

    public void displayTriangleHeight(){
        System.out.println("Downcasting -> Triangle Height is: " + this.height);
    }

    @Override
    public int getSize() {
        return this.base * this.height / 2;
    }

    @Override
    public String toString(){
        return "Triangle: height is " + this.height + " base is: " + this.base
                + super.toString();
    }
    @Override
    public boolean equals(Object obj){
        if(this == obj){
            return true;
        }
        if(obj == null){
            return false;
        }
        if(this.getClass() != obj.getClass()){
            return false;
        }
        Triangle thisTriangle = (Triangle) obj;
        if(super.equals(thisTriangle) &&
                this.base == (thisTriangle.base) &&
                this.height == (thisTriangle.height)){
            return true;
        }
        return false;
    }

    @Override
    public int hashCode(){
        int prime = 31;
        int result = super.hashCode();
        result = prime * result + this.base;
        result = prime * result + this.height;
        return result;
    }
}


