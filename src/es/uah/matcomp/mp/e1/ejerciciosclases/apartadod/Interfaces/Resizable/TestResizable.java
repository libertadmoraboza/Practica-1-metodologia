package es.uah.matcomp.mp.e1.ejerciciosclases.apartadod.Interfaces.Resizable;

public class TestResizable {
    public static void main(String[] args){
        ResizableCircle c1 = new ResizableCircle(6);
        System.out.println(c1);
        c1.resize(20);
        System.out.println(c1);
    }
}
