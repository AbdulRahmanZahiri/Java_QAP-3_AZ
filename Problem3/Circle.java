package Problem3;

public class Circle extends Ellipse {
    public Circle(double radius) {
        super(radius + 0.5, radius + 0.5); 
        this.name = "Circle";
    }

    // The getArea and getPerimeter methods are inherited from Ellipse
    @Override
    public void scale(double factor) {
        this.a *= factor;
        this.b = this.a;
    }
}
