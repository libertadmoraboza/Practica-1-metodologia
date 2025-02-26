package es.uah.matcomp.mp.e1.ejerciciosclases.apartadoc.Animals;

public class TestMain {
    public static void main(String[] args){
        // Vamos a crear un animal
        Animal a1 = new Animal ("Goldfish");
        System.out.println(a1);

        //Vamos a crear un mamífero
        Mammal m1 = new Mammal ("Dolphin");
        System.out.println(m1);

        //Vamos a crear un gato
        Cat c1 = new Cat("Firulais");
        System.out.println(c1);

        //Vamos a crear un perro
        Dog d1 = new Dog("Sebastián");
        System.out.println(d1);

        //Vamos a crear otro perro para el greet
        Dog d2 = new Dog("Rudolph");
        System.out.println(d2);

        //Vamos a llamar a los greets
        c1.greets();
        d1.greets();
        d1.greets(d2);
    }
}
//Las llamadas de los greets se pueden hacer porque, aunque se llamen igual, ambas clases son completamente independientes y no se van a reescribir ni sobreponerse con la otra en ningún momento.