package es.uah.matcomp.mp.e1.ejerciciosclases.apartadoc.ParteTeórica;

public class Cylinder extends Circle{
    private double height = 1.0;

    public Cylinder(){}
    public Cylinder(double radius){
        super(radius);
    }
    public Cylinder(double radius, double height){
        super(radius);
        this.height = height;
    }
    public Cylinder(double radius, double height, String color){
        super(radius, color);
        this.height = height;
    }

    public double getHeight(){
        return height;
    }

    public void setHeight(double height){
        this.height = height;
    }

    public double getVolume(){
        super.getArea();
        return getArea() * height;
    }
    @Override
    public String toString() { // in Cylinder class
        return "Cylinder: subclass of " + super.toString() // use Circle's toString()
                + " height=" + height;
    }

    public double getArea(){
        return Math.PI * 2 * getRadius() * height + 2 * super.getArea();
    }
}
