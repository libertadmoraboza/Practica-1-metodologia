package es.uah.matcomp.mp.e1.ejerciciosclases.apartadoc.CircleCylinder;

public class Cylinder{
    private double height = 1.0;
    private Circle base;

    public Cylinder(){
        base = new Circle();
    }
    public Cylinder(double height){
        base = new Circle();
        this.height = height;
    }

    public Cylinder(Circle base, double height){
        this.base = base;
        this.height = height;
    }

    public Circle getBase(){
        return base;
    }

    public void setBase(Circle base){
        this.base = base;
    }

    public double getHeight(){
        return height;
    }

    public void setHeight(double height){
        this.height = height;
    }

    public double getVolume(){
        return base.getArea() * height;
    }
    @Override
    public String toString() { // in Cylinder class
        return "Cylinder: subclass of " + base // use Circle's toString()
                + " height=" + height;
    }

    public double getArea(){
        return Math.PI * 2 * base.getRadius() * height + 2 * base.getArea();
    }
}
