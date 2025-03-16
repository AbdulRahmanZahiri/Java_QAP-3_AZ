package Problem3;

// The EquilateralTriangle class is a subclass of the Triangle class
public class EquilateralTriangle extends Triangle {
    public EquilateralTriangle(double side) {
        super(side + 0.4, side + 0.4, side + 0.4);
        this.name = "EquilateralTriangle";
    }
}
