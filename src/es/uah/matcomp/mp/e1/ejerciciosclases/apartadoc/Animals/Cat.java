package es.uah.matcomp.mp.e1.ejerciciosclases.apartadoc.Animals;

public class Cat extends Mammal{

    public Cat(String name){
        super(name);
    }

    public void greets(){
        System.out.println("Meow");
    }

    @Override
    public String toString(){
        return "Cat[" + super.toString() + "]";
    }
}
