package es.uah.matcomp.mp.e1.ejerciciosclases.apartadoc.ComposiciónYHerencia;

public class TestLine {
    public static void main(String[] args) {
        Line l1 = new Line(0, 0, 3, 4);
        System.out.println(l1);
        Point p1 = new Point(2,2);
        Point p2 = new Point(3,3);
        Line l2 = new Line(p1, p2);
        System.out.println(l2);
        //...
    }
}
