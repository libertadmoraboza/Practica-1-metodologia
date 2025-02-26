package es.uah.matcomp.mp.e1.ejerciciosclases.apartadoc.CircleCylinder;

public class TestCircleCylinder {
    public static void main (String[] args) {
// Declare and allocate a new instance of cylinder
// with default color, radius, and height
        Cylinder c1 = new Cylinder();
        System.out.println("Cylinder:"
                + " height=" + c1.getHeight()
                + " base area=" + c1.getArea()
                + " volumen=" + c1.getVolume());
// Declare and allocate a new instance of cylinder
// specifying height, with default color and radius
        Cylinder c2 = new Cylinder(10.0);
        System.out.println("Cylinder:"
                + " height=" + c2.getHeight()
                + " base area=" + c2.getArea()
                + " volume=" + c2.getVolume());
// Declare and allocate a new instance of cylinder
// specifying radius and height, with default color
        Circle base = new Circle(2.0, "blue");
        Cylinder c3 = new Cylinder(base, 10.0);
        System.out.println("Cylinder:"
                + " height=" + c3.getHeight()
                + " base area=" + c3.getArea()
                + " volume=" + c3.getVolume());
    }
}
