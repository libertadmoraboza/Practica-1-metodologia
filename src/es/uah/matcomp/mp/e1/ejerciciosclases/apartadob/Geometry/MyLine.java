package es.uah.matcomp.mp.e1.ejerciciosclases.apartadob.Geometry;

public class MyLine extends MyPoint{
    private MyPoint begin;
    private MyPoint end;

    public MyLine(int x1, int y1, int x2, int y2){
        this.begin = new MyPoint(x1, y1);
        this.end = new MyPoint(x2, y2);
    }

    public MyLine(MyPoint begin, MyPoint end){
        this.begin = begin;
        this.end = end;
    }

    public MyPoint getBegin(){
        return begin;
    }

    public void setBegin(MyPoint begin){
        this.begin = begin;
    }

    public MyPoint getEnd(){
        return end;
    }

    public void setEnd(MyPoint end){
        this.end = end;
    }

    public int getBeginX(){
        return begin.getX();
    }

    public void setBeginX(int x){
        begin = new MyPoint(x, getBeginY());
    }

    public int getBeginY(){
        return begin.getY();
    }

    public void setBeginY(int y){
        begin = new MyPoint(getBeginX(), y);
    }

    public int getEndX(){
        return end.getX();
    }

    public void setEndX(int x){
        end = new MyPoint(x, getY());
    }

    public int getEndY(){
        return end.getY();
    }

    public void setEndY(int y){
        end = new MyPoint(end.getX(), y);
    }

    public int[] getBeginXY(){
        return new int[]{getBeginX(), getBeginY()};
    }

    public int[] getEndXY(){
        return new int[]{getEndX(), getEndY()};
    }

    public void setBeginXY(int x, int y){
        begin = new MyPoint(x, y);
    }

    public void setEndXY(int x, int y){
        end = new MyPoint(x, y);
    }

    public double getLenght(){
        return end.distance(begin);
    }

    public double getGradient(){
        return Math.round(Math.atan2(getEndY() - getBeginY(), getEndX() - getBeginX()) * 100.0 / 100.0) ;
    }

    public String toString(){
        return "My Line[begin=" + begin + ", end=" + end + "]";
    }
}

