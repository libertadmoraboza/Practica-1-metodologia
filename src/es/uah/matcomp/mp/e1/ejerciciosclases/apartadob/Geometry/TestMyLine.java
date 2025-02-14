package es.uah.matcomp.mp.e1.ejerciciosclases.apartadob.Geometry;

import java.util.Arrays;

public class TestMyLine {
    public static void main(String[] args){
        MyLine l1 = new MyLine(1,1,2,2);
        System.out.println(l1.toString()); //Probador de toString

        MyLine l2 = new MyLine(2, 2, 3, 3); //Para probar los setters y getters de begin y end
        System.out.println(l2.toString());
        System.out.println("l2 begin=" + l2.getBegin());
        System.out.println("l2 end=" + l2.getEnd());
        l2.setBegin(l1.getBegin());
        l2.setEnd(l1.getEnd());
        System.out.println(l2.toString()); //Debería salir ahora el begin y end de l1 para l2.
        System.out.println("l2 begin=" + l2.getBegin());
        System.out.println("l2 end=" + l2.getEnd());

        MyLine l3 = new MyLine(l2.getBegin(), l2.getEnd());
        System.out.println(l3.toString());

        //para begin XY
        System.out.println("beginX=" + l1.getBeginX()); //debería ser 1
        System.out.println("beginY=" + l1.getBeginY()); //debería ser 1
        l1.setBeginX(2);
        System.out.println("beingX=" + l1.getBeginX()); //debería ser 2
        l1.setBeginY(2);
        System.out.println("beginY=" + l1.getBeginY()); //debería ser 2
        System.out.println("beginXY=" + Arrays.toString(l1.getBeginXY()));

        //para end XY
        System.out.println("endX=" + l1.getEndX());
        System.out.println("endY=" + l1.getEndY());
        l1.setEndX(4);
        System.out.println("endX=" + l1.getEndX());
        l1.setEndY(4);
        System.out.println("endY=" + l1.getEndY());
        System.out.println("endXY=" + Arrays.toString(l1.getEndXY()));


        l1.setBeginXY(2,3);
        l1.setEndXY(4,5);
        System.out.println("beginXY=" + Arrays.toString(l1.getBeginXY()));
        System.out.println("endXY=" + Arrays.toString(l1.getEndXY()));
        System.out.println("The length of the line is: " + l1.getLenght());
        System.out.println("The gradient of the line is: "+ l1.getGradient());



    }

}
