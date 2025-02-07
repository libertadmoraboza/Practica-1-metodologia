package es.uah.matcomp.mp.e1.ejerciciosclases;

public class Rectangle {
    private double length;
    private double width;

    public Rectangle(){
        length = 1.0;
        width = 1.0;
    }

    public Rectangle(double l, double w){
        length = l;
        width = w;
    }

    public double getLength(){
        return length;
    }

    public double getWidth(){
        return width;
    }

    public void setLength(double l){
        this.length = l;
    }

    public void setWidth(double w){
        this.width = w;
    }

    public double getArea(){
        return length * width;
    }

    public double getPerimeter(){
        return 2 * length * width;
    }

    public String toString(){
        return ("%.2f Rectangle[length=" + length + ", width=" + width + "]");
    }


}
