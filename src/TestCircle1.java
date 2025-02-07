import es.uah.matcomp.mp.e1.ejerciciosclases.Circle;

public class TestCircle1 {
    public static void main(String[] args){

        Circle c1 = new Circle (6.7, "red");
        System.out.println(c1.toString());

        Circle c2 = new Circle(2.3, "blue");
        System.out.println(c2.toString());

        Circle c3 = new Circle(4.0, "green");
        System.out.println(c3.toString());

        Circle c4 = new Circle(5.5, "black");
        System.out.println("The radius is: " + c4.getRadius());
        System.out.println("The color is: " + c4.getColor());
    }
}