package es.uah.matcomp.mp.e1.ejerciciosclases.apartadod.Interfaces.GeometricObject;

public class TestGeometricObject {
    public static void main(String[] args){
        //Upcast Circle to interface
        GeometricObject c1 = new Circle(5.5);
        System.out.println(c1);
        System.out.println(c1.getArea());
        System.out.println(c1.getPerimeter());

        //Downcast Circle to Circle
        Circle c2 = (Circle)c1;
        System.out.println(c2);
        System.out.println(c2.getArea());
        System.out.println(c2.getPerimeter());

        //Upcast Rectangle to interface
        GeometricObject r1 = new Rectangle(5.5, 6.5);
        System.out.println(r1);
        System.out.println(r1.getArea());
        System.out.println(r1.getPerimeter());

        //Downcast Rectangle to Rectangle
        Rectangle r2 = (Rectangle)r1;
        System.out.println(r2);
        System.out.println(r2.getArea());
        System.out.println(r2.getPerimeter());

    }
}
