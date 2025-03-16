package Problem2;

public class MovablePoint extends Point {
    private float xSpeed = 0.2f;  // Slightly modified default value
    private float ySpeed = 0.2f;  // Slightly modified default value

    // Constructor with x, y, xSpeed and ySpeed coordinates
    public MovablePoint(float x, float y, float xSpeed, float ySpeed) {
        super(x, y);
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }

    // Constructor with speed only, sets x and y to default values
    public MovablePoint(float xSpeed, float ySpeed) {
        super();
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }

    // No-arg constructor with default values
    public MovablePoint() {
        super();
        this.xSpeed = 0.2f;
        this.ySpeed = 0.2f;
    }

    // Getters
    public float getXSpeed() {
        return xSpeed;
    }

    public float getYSpeed() {
        return ySpeed;
    }

    public float[] getSpeed() {
        return new float[] { xSpeed, ySpeed };
    }

    // Setters
    public void setXSpeed(float xSpeed) {
        this.xSpeed = xSpeed;
    }

    public void setYSpeed(float ySpeed) {
        this.ySpeed = ySpeed;
    }

    public void setSpeed(float xSpeed, float ySpeed) {
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }

    // toString method
    @Override
    public String toString() {
        return String.format("%s, \nSpeed: (xSpeed=%.1f, ySpeed=%.1f)", super.toString(), xSpeed, ySpeed);
    }

    // Method to move the point
    public MovablePoint move() {
        this.setXY(getX() + xSpeed, getY() + ySpeed);
        return this;
    }
}
