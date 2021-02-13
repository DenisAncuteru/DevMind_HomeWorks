package GeometricFigures;

public class Rectangle extends Shape {
    private int width;
    private int height;

    public Rectangle(){
        this.width = 0;
        this.height = 0;
    }
    public Rectangle(String text, String material, int width, int height){
        super(text,material);
        this.width = width;
        this.height = height;
    }

    @Override
    public void displayHeight(){
        System.out.println("Rectangle height is: " + this.height);
    }
    public void displayRectangleHeight(){
        System.out.println("Downcasting -> Rectangle Height is: " + this.height);
    }

    @Override
    public int getSize(){
        return this.width * this.height;
    }

    @Override
    public String toString(){
        return "Rectangle: height is " + this.height + " base is: " + this.width
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
        Rectangle thisRectangle = (Rectangle) obj;
        if(super.equals(thisRectangle) &&
                this.width == (thisRectangle.width) &&
                this.height == (thisRectangle.height)){
            return true;
        }
        return false;
    }

    @Override
    public int hashCode(){
        int prime = 31;
        int result = super.hashCode();
        result = prime * result + width;
        result = prime * result + height;
        return result;
    }
}
