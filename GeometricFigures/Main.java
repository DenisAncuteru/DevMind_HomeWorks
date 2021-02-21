package GeometricFigures;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

//        Shape firstShape = new Shape("First Shape", "Plastic");
//        Shape secondShape = new Shape("Second Shape", "Metal");
        Triangle firstTriangle = new Triangle("First Triangle", "Carbon", 10, 7);
        Triangle secondTriangle = new Triangle("Second Triangle", "Nichel", 28, 12);
        Rectangle firstRectangle = new Rectangle("First Rectangular", "Wood", 3, 4);
        Rectangle secondRectangle = new Rectangle("Second Rectangular", "Glass", 50, 50);


        System.out.println(firstTriangle.equals(secondTriangle));
        System.out.println(firstTriangle.equals(firstRectangle));
        System.out.println(firstTriangle.hashCode());
        System.out.println(secondTriangle.hashCode());
        System.out.println(firstRectangle.hashCode());

        ArrayList<Shape> geometric = new ArrayList<Shape>();
//        geometric.add(firstShape);
//        geometric.add(secondShape);
        geometric.add(firstTriangle);
        geometric.add(secondTriangle);
        geometric.add(firstRectangle);
        geometric.add(secondRectangle);

        for (Shape tableOfShapes : geometric) {
//            tableOfShapes.displayHeight();

            if (tableOfShapes instanceof Rectangle) {
                Rectangle rectangle = (Rectangle) tableOfShapes;
                rectangle.displayRectangleHeight();
            } else if (tableOfShapes instanceof Triangle) {
                Triangle triangle = (Triangle) tableOfShapes;
                triangle.displayTriangleHeight();
            } else {
                System.out.println("Didn't know the shape of the height");
            }
        }
    }
}
