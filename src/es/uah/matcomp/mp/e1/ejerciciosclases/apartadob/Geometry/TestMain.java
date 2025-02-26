package es.uah.matcomp.mp.e1.ejerciciosclases.apartadob.Geometry;

import java.util.Arrays;

public class TestMain {
    public static void main(String[] args){
        //CIRCLE
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

        System.out.printf("El área de c3 = %.2f%n", c3.getArea());
        System.out.printf("La circunferencia de c3 = %.2f%n", c3.getCircumference());
        System.out.printf("La distancia entre los centros de c3 y c2 = %.2f%n", c3.distance(c1));

        //LINE
        MyLine l1 = new MyLine(1,1,2,2);
        System.out.println(l1); //Probador de toString

        MyLine l2 = new MyLine(2, 2, 3, 3); //Para probar los setters y getters de begin y end
        System.out.println(l2);
        System.out.println("l2 begin=" + l2.getBegin());
        System.out.println("l2 end=" + l2.getEnd());
        l2.setBegin(l1.getBegin());
        l2.setEnd(l1.getEnd());
        System.out.println(l2); //Debería salir ahora el begin y end de l1 para l2.
        System.out.println("l2 begin=" + l2.getBegin());
        System.out.println("l2 end=" + l2.getEnd());

        MyLine l3 = new MyLine(l2.getBegin(), l2.getEnd());
        System.out.println(l3);

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
        System.out.printf("The length of the line is: %.2f%n", l1.getLenght());
        System.out.printf("The gradient of the line is: %.2f%n", l1.getGradient());

        //POINT
        // Test program to test all constructors and public methods
        MyPoint p1 = new MyPoint(); // Test constructor
        System.out.println(p1); // Test toString()
        p1.setX(8); // Test setters
        p1.setY(6);
        System.out.println("x is: " + p1.getX()); // Test getters
        System.out.println("y is: " + p1.getY());
        p1.setXY(3, 0); // Test setXY()
        System.out.println(p1.getXY()[0]); // Test getXY()
        System.out.println(p1.getXY()[1]);
        System.out.println(p1);
        MyPoint p2 = new MyPoint(0, 4); // Test another constructor
        System.out.println(p2);
        // Testing the overloaded methods distance()
        System.out.printf("Distance is %.2f%n", p1.distance(p2)); // Versión 1
        System.out.printf("Distance is %.2f%n", p2.distance(p1)); // Versión 1
        System.out.printf("Distance is %.2f%n", p1.distance(5, 6)); // Versión 2
        System.out.printf("Distance is %.2f%n", p1.distance()); // Versión 3

        MyPoint puntos = new MyPoint();
        puntos.mostrarMatrizDistancias();

        //TRIANGLE
        MyTriangle t1 = new MyTriangle(1,1,4,1,2,3);
        MyTriangle t2 = new MyTriangle(1,1,1,3,3,1);
        MyTriangle t3 = new MyTriangle(2,3,0,0,4,0);

        System.out.println(t1);
        System.out.println(t2);
        System.out.println(t3);

        System.out.printf("El perímetro del triángulo 1 = %.2f%n", t1.getPerimeter());
        System.out.printf("El perímetro del triángulo 2 = %.2f%n", t2.getPerimeter());
        System.out.printf("El perímetro del triángulo 3 = %.2f%n", t3.getPerimeter());

        System.out.println("El triágnulo t1 es " + t1.getType());
        System.out.println("El triángulo t2 es " + t2.getType());
        System.out.println("El triángulo t3 es " + t3.getType());
    }
}
