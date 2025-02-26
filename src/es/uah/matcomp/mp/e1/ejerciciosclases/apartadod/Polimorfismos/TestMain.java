package es.uah.matcomp.mp.e1.ejerciciosclases.apartadod.Polimorfismos;

public class TestMain {
    public static void main(String[] args){
        Shape s1 = new Circle(5.5, "red", false);
        System.out.println(s1); //Shape's toString

        System.out.println(s1.getArea()); //Shape's
        System.out.println(s1.getPerimeter()); //Shape's
        System.out.println(s1.getColor());
        System.out.println(s1.isFilled());
        //System.out.println(s1.getRadius()); //No se puede hacer pues, estamos en Shape y no en Circle

        Circle c1 = (Circle)s1;
        System.out.println(c1);
        System.out.println(c1.getArea());
        System.out.println(c1.getPerimeter());
        System.out.println(c1.getColor());
        System.out.println(c1.isFilled());
        System.out.println(c1.getRadius());

        //Shape s2 = new Shape(); //Da error porque al ser una clase abstracta no se puede instanciar

        Shape s3 = new Rectangle(1.0, 2.0, "red", false);
        System.out.println(s3);
        System.out.println(s3.getArea());
        System.out.println(s3.getPerimeter());
        System.out.println(s3.getColor());
        //System.out.println(s3.getLength()); //No se puede por el mismo motivo que getRadius en s1

        Shape s4 = new Square(6.6);
        System.out.println(s4);
        System.out.println(s4.getArea());
        System.out.println(s4.getColor());
        //System.out.println(s4.getSide()); //Mismo motivo que s3 y s1

        Rectangle r2 = (Rectangle)s4; //We downcast s4
        System.out.println(r2);
        System.out.println(r2.getArea());
        System.out.println(r2.getColor());
        //System.out.println(r2.getSide()); //Porque estamos en rectángulo
        System.out.println(r2.getLength());

        //Now we downcast Rectangle r2 to Square
        Square sq1 = (Square)r2;
        System.out.println(sq1);
        System.out.println(sq1.getArea());
        System.out.println(sq1.getColor());
        System.out.println(sq1.getSide());
        System.out.println(sq1.getLength());
    }
}

//En las clases, los que tienen Override son polimorfismos
//Las clases abstractas y métodos abstractos son útiles para establecer una estructura obligatoria y común entre la clase abstracta
//padre y las clases hijas. Además, sirven para establcer el contexto sin necesidad de tener que instanciar la clase padre.
