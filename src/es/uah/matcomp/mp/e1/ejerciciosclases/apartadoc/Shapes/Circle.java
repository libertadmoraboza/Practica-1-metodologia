package es.uah.matcomp.mp.e1.ejerciciosclases.apartadoc.Shapes;

public class Circle extends Shape{
    private double radius = 1.0;

    public Circle(){}
    public Circle(double radius){
        this.radius = radius;
    }
    public Circle(double radius, String color, boolean filled){
        super(color, filled);
        this.radius = radius;
    }

    public double getRadius(){
        return radius;
    }

    public void setRadius(double radius){
        this.radius = radius;
    }

    public double getArea(){
        return Math.PI * Math.pow(radius, 2);
    }

    public double getPerimeter(){
        return 2 * Math.PI * radius;
    }

    @Override
    public String toString(){
        return "Circle[" + super.toString() + ", radius=" + radius + "]";
    }
}
