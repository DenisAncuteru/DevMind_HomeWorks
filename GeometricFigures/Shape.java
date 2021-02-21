package GeometricFigures;

public abstract class Shape {
    private String text;
    private String material;

    public Shape(){
        this.text = "";
        this.material = "";
    }
    public Shape(String text, String material){
        this.text = text;
        this.material = material;
    }

    public abstract void displayHeight();

    public abstract int getSize();

    @Override
    public String toString(){
        return " made of " + this.material + ", contains the text: \"" + this.text +  "\"";
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (this.getClass() != obj.getClass()) {
            return false;
        }
        Shape shape = (Shape) obj;
        if (this.text == (shape.text) && this.material == (shape.material)) {
            return true;
        }
        return false;
    }

    @Override
    public int hashCode(){
        int prime = 31;
        int result = 1;
        result = prime * result + ((text == null) ? 0 : text.hashCode());
        result = prime * result + ((material == null) ? 0 : material.hashCode());
        return result;
    }
}
