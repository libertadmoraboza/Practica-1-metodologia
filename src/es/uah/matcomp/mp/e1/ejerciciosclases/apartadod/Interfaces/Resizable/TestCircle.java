package es.uah.matcomp.mp.e1.ejerciciosclases.apartadod.Interfaces.Resizable;

import es.uah.matcomp.mp.e1.ejerciciosclases.apartadod.Interfaces.GeometricObject.GeometricObject;

public class TestCircle {
    public static void main(String[] args){
        GeometricObject c1 = new Circle(5);
        System.out.println(c1);
        System.out.println("The area is " + c1.getArea());
        System.out.println("The perimeter is " + c1.getPerimeter());
    }
}
