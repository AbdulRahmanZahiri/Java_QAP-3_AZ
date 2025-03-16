package Problem4;

import Problem3.Circle;
import Problem3.Ellipse;
import Problem3.EquilateralTriangle;
import Problem3.Shape;
import Problem3.Triangle;

public class Demo {
    public static void scaleAll(Shape[] shapes, double factor) {
        for (Shape shape : shapes) {
            if (shape instanceof Scalable) {
                ((Scalable) shape).scale(factor);
            }
        }
    }

    public static void main(String[] args) {
        Shape[] shapes = new Shape[4];
        shapes[0] = new Circle(5.7); 
        shapes[1] = new Ellipse(7.4, 3.6); 
        shapes[2] = new Triangle(3.5, 4.2, 5.1); 
        shapes[3] = new EquilateralTriangle(6.8); 

        // Print the shapes before scaling
        System.out.println("Before scaling:");
        for (Shape shape : shapes) {
            System.out.println(shape);
        }

        // Scale all shapes by a factor of 1.8
        scaleAll(shapes, 1.8);

        System.out.println("\nAfter scaling:");
        for (Shape shape : shapes) {
            System.out.println(shape);
        }
    }
}
