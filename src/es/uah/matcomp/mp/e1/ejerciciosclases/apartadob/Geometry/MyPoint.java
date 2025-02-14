package es.uah.matcomp.mp.e1.ejerciciosclases.apartadob.Geometry;

import java.util.Arrays;

public class MyPoint {
    private int x = 0;
    private int y = 0;

    private MyPoint[] pointsArray = new MyPoint[10];

    public MyPoint(){
        for (int i = 0; i < 10; i++){
            pointsArray[i] = new MyPoint(i, i);
        }
    }

    public MyPoint(int x, int y){
        this.x = x;
        this.y = y;
    }

    //Mostrar matriz de distancia entre puntos del Array
    public void mostrarMatrizDistancias() {
        double[][] matriz = new double[10][10];
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                matriz[i][j] = pointsArray[i].distance(pointsArray[j]);
            }
        }
        //Para imprimirla:
        for (int i = 0; i < 10; i++){
            for (int j = 0; j< 10; j++){
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }
    }

    public int getX(){
        return x;
    }

    public void setX(int x){
        this.x = x;
    }

    public int getY(){
        return y;
    }

    public void setY(int y){
        this.y = y;
    }

    public int[] getXY(){
        return new int[]{x, y};
    }

    public void setXY(int x, int y){
        this.x = x;
        this.y = y;
    }

    public String toString(){
        return "(" + x + "," + y + ")";
    }

    public double distance(int x, int y){
        return Math.round(Math.sqrt(Math.pow(x - this.x, 2) + Math.pow(y - this.y, 2)) * 100.0) / 100.0 ;
    }

    public double distance(MyPoint another){
        return Math.round(Math.sqrt(Math.pow(another.getX() - this.x, 2) + Math.pow(another.getY() - this.y, 2)) * 100.0) / 100.0;
    }

    public double distance(){
        return Math.round(Math.sqrt(Math.pow(this.x, 2) + Math.pow(this.y, 2)) * 100.0) / 100.0;
    }

}
