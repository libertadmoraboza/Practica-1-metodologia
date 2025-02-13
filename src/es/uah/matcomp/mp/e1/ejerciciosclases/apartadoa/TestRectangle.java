package es.uah.matcomp.mp.e1.ejerciciosclases.apartadoa;

public class TestRectangle {
    public static void main(String[] args){
        Rectangle r1 = new Rectangle(1.2, 3.4);
        System.out.println(r1);
        Rectangle r2 = new Rectangle();
        System.out.println(r2);

        r1.setLength(5.6);
        r1.setWidth(7.8);

        System.out.println(r1);
        System.out.println("length is: " + r1.getLength());
        System.out.println("width is: " + r1.getWidth());

        System.out.printf("area is: %.2f%n" , r1.getArea());
        System.out.printf("perimeter is: %.2f%n" , r1.getPerimeter());

    }
}
