package org.example;

public class Paddle extends BaseObject{

    private double speed;
    private double direction;
    public Paddle(double x, double y) {
        super(x, y, 3);
        speed = 1;
        direction = 0;
    }

    @Override
    public void move() {
        x += speed * direction;
    }

    public void moveLeft() {
        direction = -1;
    }
    public void moveRight() {
        direction = 1;
    }

    public double getSpeed() {
        return speed;
    }

    public double getDirection() {
        return direction;
    }

    @Override
    public void draw(Canvas canvas) {

    }
}
