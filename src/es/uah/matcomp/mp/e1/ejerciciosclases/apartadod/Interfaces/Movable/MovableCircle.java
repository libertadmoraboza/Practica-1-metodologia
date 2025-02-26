package es.uah.matcomp.mp.e1.ejerciciosclases.apartadod.Interfaces.Movable;

import java.util.Arrays;

public class MovableCircle implements Movable{
    private int radius;
    private MovablePoint center;

    public MovableCircle(int x, int y, int xSpeed, int ySpeed, int radius){
        this.radius = radius;
        this.center = new MovablePoint(x, y, xSpeed, ySpeed);
    }

    @Override
    public String toString(){
        return center.toString() + ", radius=" + radius;
    }

    public void moveUp(){
        this.center.moveUp();
    }

    public void moveDown(){
        this.center.moveDown();
    }

    public void moveLeft(){
        this.center.moveLeft();
    }

    public void moveRight(){
        this.center.moveRight();
    }
}
