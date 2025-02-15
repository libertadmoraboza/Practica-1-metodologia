package es.uah.matcomp.mp.e1.ejerciciosclases.apartadoc.ComposiciónYHerencia;

public class Line {
    // A line composes of two points (as instance variables)
    private Point begin; // beginning point
    private Point end; // ending point
    // Constructors
    public Line (Point begin, Point end) { // caller to construct the Points
        this.begin = begin;
        this.end = end;
    }
    public Line (int beginX, int beginY, int endX, int endY) {
        begin = new Point(beginX, beginY); // construct the Points here
        end = new Point(endX, endY);
    }
    // Public methods
    public String toString() {
        return "Line[" + begin + "," + end + "]";
    }
    public Point getBegin() {
        return begin;
    }
    public Point getEnd() {
        return end;
    }
    public void setBegin(Point begin) {
        this.begin = begin;
    }
    public void setEnd(Point end) {
        this.end = end;
    }
    public int getBeginX() {
        return begin.getX();
    }
    public int getBeginY() {
        return begin.getY();
    }
    public int getEndX() {
        return end.getX();
    }
    public int getEndY() {
        return end.getY();
    }
    public void setBeginX(int beginX) {
        begin = new Point(beginX, getBeginY());
    }
    public void setBeginY(int beginY) {
        begin = new Point(getBeginX(), beginY);
    }
    public void setBeginXY(int beginX, int beginY) {
        begin = new Point(beginX, beginY);
    }
    public void setEndX(int endX) {
        end = new Point(endX, getEndY());
    }
    public void setEndY(int endY) {
        end = new Point(getEndX(), endY);
    }
    public void setEndXY(int endX, int endY) {
        end = new Point(endX, endY);
    }
    public double getLength() {
        return Math.sqrt(Math.pow(getEndX()-getBeginX(), 2) + Math.pow(getEndY()-getBeginY(), 2));
    } // Length of the line
    public double getGradient() {
        return Math.atan2(getEndY()-getBeginY(), getEndX()-getBeginX());
    } // Gradient in radians
}
