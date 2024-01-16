package org.example;

import java.util.List;

public class Arkanoid {
    private int width;
    private int height;
    private Ball ball;
    private Paddle paddle;
    private List<Brick> bricks;
    public static Arkanoid game;

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public Arkanoid(int width, int height) {
        this.width = width;
        this.height = height;
    }

    public Ball getBall() {
        return ball;
    }

    public void setBall(Ball ball) {
        this.ball = ball;
    }

    public Paddle getPaddle() {
        return paddle;
    }

    public void setPaddle(Paddle paddle) {
        this.paddle = paddle;
    }

    public List<Brick> getBricks() {
        return bricks;
    }

    public void setBricks(List<Brick> bricks) {
        this.bricks = bricks;
    }

    public void run(){
        while(true) {
            move();
            try
            {
                Thread.sleep(10);
            } catch(InterruptedException e)
            {
                e.printStackTrace();
            }
        }
    }
    public void move(){

    }


    public static void main(String[] args) {
        game = new Arkanoid(800, 600);
        game.run();
        System.out.println("Dziala!");
    }
}
