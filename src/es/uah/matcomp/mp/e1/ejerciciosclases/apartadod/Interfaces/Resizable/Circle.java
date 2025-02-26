package es.uah.matcomp.mp.e1.ejerciciosclases.apartadod.Interfaces.Resizable;

import es.uah.matcomp.mp.e1.ejerciciosclases.apartadod.Interfaces.GeometricObject.GeometricObject;

public class Circle implements GeometricObject {
    protected double radius;

    public Circle(double radius){
        this.radius = radius;
    }

    @Override
    public double getPerimeter(){
        return 2 * Math.PI * radius;
    }

    @Override
    public double getArea(){
        return Math.PI * Math.pow(radius, 2);
    }

    @Override
    public String toString(){
        return "Circle[radius=" + radius + "]";
    }
}
