package es.uah.matcomp.mp.e1.ejerciciosclases.apartadoc.CircleYCilinder;

public class Cylinder {
    private Circle base;
    private double height;

    //Constructor with default color, radius and height
    public Cylinder(){
        base = new Circle(); //Call the construcyot to construct the Circle
        height = 1.0;
    }

    public double getHeight(){
        return height;
    }

    public void setHeight(double height){
        this.height = height;
    }

    public double getVolume(){
        return base.getArea() * height;
    }
    @Override
    public String toString() { // in Cylinder class
        return "Cylinder: subclass of " + base.toString() // use Circle's toString()
                + " height=" + height;
    }

    public double getArea(){
        return Math.PI * 2 * base.getRadius() * height + 2 * base.getArea();
    }
}

//En este caso, desde mi punto de vista, es mejor este diseño, pues te deja formar la base que quieras y establecer la altura que quieras.
// Ya que en la definición te dice 'un' círculo, lo que da a entender que este puede ser cualquiera y, que en consecuencia, el cilindro depende de ambos, altura y círculo.

