package es.uah.matcomp.mp.e1.ejerciciosclases.apartadod.RewritingAnimal;

public abstract class Animal {
    private String name;

    public Animal(String name){
        this.name = name;
    }

    abstract void greets();
}
