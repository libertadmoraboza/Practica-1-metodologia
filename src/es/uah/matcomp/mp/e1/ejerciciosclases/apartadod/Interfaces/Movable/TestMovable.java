package es.uah.matcomp.mp.e1.ejerciciosclases.apartadod.Interfaces.Movable;

public class TestMovable {
    public static void main(String[] args){
        Movable mp1 = new MovablePoint(1,2,3,4);
        System.out.println(mp1);
        mp1.moveUp();
        System.out.println("moveUp: " + mp1);
        mp1.moveDown();
        System.out.println("moveDown: " + mp1);
        mp1.moveLeft();
        System.out.println("MoveLeft: " + mp1);
        mp1.moveRight();
        System.out.println("MoveRight: " + mp1);

        //Upcast mp1 to MovablePoint
        MovablePoint mp2 = (MovablePoint)mp1;
        mp2.moveUp();
        System.out.println("MoveUp: " + mp2);
        mp2.moveDown();
        System.out.println("MoveDown: " + mp2);
        mp2.moveLeft();
        System.out.println("MoveLeft: " + mp2);
        mp2.moveRight();
        System.out.println("MoveRight: " + mp2);

        MovableCircle c1 = new MovableCircle(1,2,3,4,5);
        System.out.println(c1);
        c1.moveUp();
        System.out.println("moveUp: " + c1);
        c1.moveDown();
        System.out.println("moveDown: " + c1);
        c1.moveLeft();
        System.out.println("moveLeft: " + c1);
        c1.moveRight();
        System.out.println("moveRight: " + c1);
    }
}
