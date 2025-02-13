package e1apartadoa;

import es.uah.matcomp.mp.e1.ejerciciosclases.Circle;

public class TestCircle0 {
    public static void main(String[] args){
        Circle c1 = new Circle(1.1, "red");
        System.out.println(c1);
        Circle c2 = new Circle(2.5, "blue");
        System.out.println(c2);

        c1.setRadius(2.2);
        System.out.println(c1);
        System.out.println("radius is: " + c1.getRadius());

        System.out.printf("Area is: %.2f%n", c1.getArea());
        System.out.printf("circumference is: %.2f%n", c1.getCircumference());

    }
}
