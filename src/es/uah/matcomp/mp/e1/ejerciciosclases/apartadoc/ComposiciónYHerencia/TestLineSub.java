package es.uah.matcomp.mp.e1.ejerciciosclases.apartadoc.ComposiciónYHerencia;

public class TestLineSub {
    public static void main(String[] args){

        Point p1 = new Point(1,1);
        //Probrar constructores y getBegin, getEnd
        LineSub l1 = new LineSub(2,2,4,4);
        System.out.println(l1);
        LineSub l2 = new LineSub(l1.getBegin(), l1.getEnd());
        System.out.println(l2);
        LineSub l3 = new LineSub(2,3,4,5);
        System.out.println(l3);

        //Probando los métodos
        l2.setBegin(l3.getBegin());
        l2.setEnd(l3.getEnd());
        System.out.println(l2);

        System.out.println("BeginX de l2 = " + l2.getBeginX());
        System.out.println("EndX de l2 = " + l2.getEndX());
        System.out.println("BeginY de l2 = " + l2.getBeginY());
        System.out.println("EndY de l2 = " + l2.getEndY());

        l2.setBeginX(4);
        l2.setBeginY(4);
        l2.setEndX(5);
        l2.setEndY(5);
        System.out.println(l2);

        l2.setBeginXY(6,6);
        l2.setEndXY(7,7);
        System.out.println(l2);

        System.out.printf("La longitud de l2 es %.2f%n", l2.getLength());
        System.out.printf("El gradiente de l2 es %.2f%n", l1.getGradient());

    }
}

//Personalmente, creo que para el problema, la mejor opción es esta, ya que el punto de inicio siempre permanece igual y se extiende hacia otros.
