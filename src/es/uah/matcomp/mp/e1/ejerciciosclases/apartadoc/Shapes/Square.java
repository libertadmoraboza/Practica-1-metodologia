package es.uah.matcomp.mp.e1.ejerciciosclases.apartadoc.Shapes;

public class Square extends Rectangle{

    public Square(){
        super();
    };
    public Square(double side){
        super(side, side);
    }
    public Square(double side, String color, boolean filled){
        super(side, side, color, filled);
    }

    public double getSide(){
        return super.getLength(); //También valdría width porque se supone que un cuadrado tiene los lados iguales
    }

    public void setSide(double side){
        super.setLength(side);
        super.setWidth(side);
    }

    @Override
    public void setWidth(double side){
        setSide(side);
    }

    @Override
    public void setLength(double side){
        setSide(side);
    }

    @Override
    public String toString(){
        return "Square[" + super.toString() + "]";
    }


}
