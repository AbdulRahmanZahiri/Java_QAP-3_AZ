package Problem2;

public class Demo {
    public static void main(String[] args) {
        MovablePoint movablePoint = new MovablePoint(1.5f, 2.5f, 0.2f, 0.2f); 
        System.out.println("Starting " + movablePoint + "\n");

        movablePoint.move();
        System.out.println("After moving: " + movablePoint + "\n");
    }
}
