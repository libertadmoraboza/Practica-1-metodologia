package es.uah.matcomp.mp.e1.ejerciciosclases.apartadoc.ComposiciónYHerencia;

public class LineSub extends Point{
    // A line needs two points: begin and end.
// The begin point is inherited from its superclass Point.
// Private variables
    private Point end; // Ending point
    // Constructors
    public LineSub (int beginX, int beginY, int endX, int endY) {
        super(beginX, beginY); // construct the begin Point
        this.end = new Point(endX, endY); // construct the end Point
    }
    public LineSub (Point begin, Point end) { // caller to construct the Points
        super(begin.getX(), begin.getY()); // need to reconstruct the begin Point
        this.end = end;
    }
    // Public methods
// Inherits methods getX() and getY() from superclass Point
    @Override
    public String toString() {
        return "Line[" + getBegin() + "," + end + "]";
    }

    public Point getBegin() {
        return new Point(getX(), getY());
    }

    public Point getEnd() {
        return end;
    }

    public void setBegin(Point begin) {
        begin = new Point(getBeginX(), getBeginY());
    }

    public void setEnd(Point end) {
        this.end = end;
    }

    public int getBeginX() {
        return getBegin().getX();
    }

    public int getBeginY() {
        return getBegin().getY();
    }

    public int getEndX() {
        return end.getX();
    }

    public int getEndY() {
        return end.getY();
    }

    public void setBeginX(int beginX) {
        setBegin(new Point(beginX, getBeginY()));
    }

    public void setBeginY(int beginY) {
        setBegin(new Point(getBeginX(), getBeginY()));
    }

    public void setBeginXY(int beginX, int beginY) {
        setBegin(new Point(beginX, beginY));
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
    } // Gradient in radian
}
