package es.uah.matcomp.mp.e1.ejerciciosclases.apartadob.Geometry;

public class MyCircle extends MyPoint{
    private MyPoint center = new MyPoint(0,0);
    private int radius = 1;

    public MyCircle(){}

    public MyCircle(int x, int y, int radius){
        this.center = new MyPoint(x, y);
        this.radius = radius;
    }

    public MyCircle(MyPoint center, int radius){
        this.center = center;
        this.radius = radius;
    }

    public int getRadius(){
        return radius;
    }

    public void setRadius(int radius){
        this.radius = radius;
    }

    public MyPoint getCenter(){
        return center;
    }

    public void setCenter(MyPoint center){
        this.center = center;
    }

    public int getCenterX(){
        return center.getX();
    }

    public void setCenterX(int x){
        center = new MyPoint(x, getCenterY());
    }

    public int getCenterY(){
        return center.getY();
    }

    public void setCenterY(int y){
        center = new MyPoint(getCenterX(), y);
    }

    public int[] getCenterXY(){
        return new int[]{getCenterX(), getCenterY()};
    }

    public void setCenterXY(int x, int y){
        center = new MyPoint(x, y);
    }

    public String toString(){
        return "MyCricle[radius=" + radius + ",centre=" + center + "]";
    }

    public double getArea(){
        return Math.round(Math.PI * radius * radius * 100.0) / 100.0;
    }

    public double getCircumference(){
        return Math.round(2 * Math.PI * radius * 100.0) / 100.0;
    }

    public double distance(MyCircle another){
        return center.distance(another.getCenter());
    }

}
