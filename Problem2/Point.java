package Problem2;

public class Point {
    private float x = 0.5f;  
    private float y = 1.5f;  

    // Constructor with x and y coordinates
    public Point(float x, float y) {
        this.x = x;
        this.y = y;
    }

    // No-arg constructor with default values
    public Point() {
        this.x = 0.5f;
        this.y = 1.5f;
    }

    // Getters
    public float getX() {
        return x;
    }

    public float getY() {
        return y;
    }

    public float[] getXY() {
        return new float[] { x, y };
    }

    // Setters
    public void setX(float x) {
        this.x = x;
    }

    public void setY(float y) {
        this.y = y;
    }

    public void setXY(float x, float y) {
        this.x = x;
        this.y = y;
    }

    // toString method
    @Override
    public String toString() {
        return String.format("Point: (x=%.1f, y=%.1f)", x, y);
    }
}
