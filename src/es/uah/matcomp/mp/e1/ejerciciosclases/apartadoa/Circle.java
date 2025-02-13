package es.uah.matcomp.mp.e1.ejerciciosclases.apartadoa;

public class Circle {

    private double radius;
    private String color;

    public Circle(double radius, String color){
        this.radius = radius;
        this.color = color;
    }

    public double getRadius(){
        return radius;

    }

    public double getArea(){
        return radius*radius*Math.PI;
    }

    public double getCircumference(){
        return 2*Math.PI*radius;
    }

    public String getColor(){
        return color;
    }

    public void setRadius(double radius){
        this.radius = radius;
    }

    public void setColor(String newColor){
        color = newColor;
    }

    public String toString(){
        return "Circle[radius=" + radius + ", color=" + color + "]";
    }

}
