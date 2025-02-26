package apartadoc_introduccion;

public class Cylinder extends Circle{
    private double height = 1.0;

    //Constructor with default color, radius and height
    public Cylinder(){
        super();
    }

    public Cylinder(double height){
        super();
        this.height = height;
    }

    public Cylinder(double radius, double height){
        super(radius);
        this.height = height;
    }

    public double getHeight(){
        return height;
    }

    public void setHeight(double height){
        this.height = height;
    }

    public double getVolume(){
        return getArea() * height;
    }
    @Override
    public String toString() { // in Cylinder class
        return "Cylinder: subclass of " + super.toString() // use Circle's toString()
                + " height=" + height;
    }

    public double getArea(){
        return Math.PI * 2 * getRadius() * height + 2 * super.getArea();
    }
}

//En este caso, desde mi punto de vista, es mejor este diseño, pues te deja formar la base que quieras y establecer la altura que quieras.
// Ya que en la definición te dice 'un' círculo, lo que da a entender que este puede ser cualquiera y, que en consecuencia, el cilindro depende de ambos, altura y círculo.

