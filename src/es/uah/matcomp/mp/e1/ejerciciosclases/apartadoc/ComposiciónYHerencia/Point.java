package es.uah.matcomp.mp.e1.ejerciciosclases.apartadoc.ComposiciónYHerencia;

public class Point {
        // Private variables
        private int x = 0; // x co-ordinate
        private int y = 0; // y co-ordinate
        // Constructor
        public Point(){}
        public Point (int x, int y) {
            this.x = x;
            this.y = y;
        }
        // Public methods
        public String toString() {
            return "Point: (" + x + "," + y + ")";
        }
        public int getX() {
            return x;
        }
        public int getY() {
            return y;
        }
        public void setX(int x) {
            this.x = x;
        }
        public void setY(int y) {
            this.y = y;
        }
        public void setXY(int x, int y) {
            this.x = x;
            this.y = y;
        }
        public int[] getXY(){
            int[] result = new int[2];
            result[0] = x;
            result[1] = y;
            return result;
        }
}
