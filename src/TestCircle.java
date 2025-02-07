public class TestCircle {
    public static void main(String[] args){

        Circle c1 = new Circle (6.7);
        System.out.println(c1.toString());

        Circle c2 = new Circle(2.3);
        System.out.println(c2.toString());

        Circle c3 = new Circle(4.0);
        System.out.println(c3.toString());

        Circle c4 = new Circle();
        c4.setRadius(5.5);
        System.out.println("The radius is: " + c4.getRadius());
        c4.setColor("green");
        System.out.println("The color is: " + c4.getColor());
    }
}