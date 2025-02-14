package es.uah.matcomp.mp.e1.ejerciciosclases.apartadob.Geometry;

import java.util.Arrays;

public class TestMyCircle {
    public static void main(String[] args){
        //Probar objetos
        MyCircle c1 = new MyCircle();
        MyCircle c2 = new MyCircle(2,2,3);
        MyCircle c3 = new MyCircle(c2.getCenter(), 8);

        //Probar getters y setters
        System.out.println("Radio c1 = " + c1.getRadius());
        System.out.println("Radio c2 = " + c2.getRadius());
        System.out.println("Radio c3 = " + c3.getRadius());

        c3.setRadius(5);
        System.out.println("Nuevo radio de c3 = " + c3.getRadius());

        c3.setCenter(c1.getCenter());
        System.out.println("Centro c3 = " + c3.getCenter());

        System.out.println("CentroX c3 = " + c3.getCenterX());
        c3.setCenterX(4);
        System.out.println("Nuevo centroX c3 = " + c3.getCenterX());

        System.out.println("CentroY c3 = " + c3.getCenterY());
        c3.setCenterY(4);
        System.out.println("Nuevo centroY c3 = " + c3.getCenterY());

        System.out.println("CentroXY c3 = " + Arrays.toString(c3.getCenterXY()));
        c3.setCenterXY(5,5);
        System.out.println("Nuevo centroXY c3 = " + Arrays.toString(c3.getCenterXY()));

        System.out.println("El área de c3 = " + c3.getArea());
        System.out.println("La circunferencia de c3 = " + c3.getCircumference());
        System.out.println("La distancia entre los centros de c3 y c2 = " + c3.distance(c1));



    }
}
