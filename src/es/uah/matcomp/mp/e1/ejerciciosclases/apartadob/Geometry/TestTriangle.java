package es.uah.matcomp.mp.e1.ejerciciosclases.apartadob.Geometry;

public class TestTriangle {
    public static void main(String[] args){
        MyTriangle t1 = new MyTriangle(1,1,4,1,2,3);
        MyTriangle t2 = new MyTriangle(1,1,1,3,3,1);
        MyTriangle t3 = new MyTriangle(2,3,0,0,4,0);

        System.out.println(t1);
        System.out.println(t2);
        System.out.println(t3);

        System.out.println("El perímetro del triángulo 1 = " + t1.getPerimeter());
        System.out.println("El perímetro del triángulo 2 = " + t2.getPerimeter());
        System.out.println("El perímetro del triángulo 3 = " + t3.getPerimeter());

        System.out.println("El triágnulo t1 es " + t1.getType());
        System.out.println("El triángulo t2 es " + t2.getType());
        System.out.println("El triángulo t3 es " + t3.getType());
    }
}
