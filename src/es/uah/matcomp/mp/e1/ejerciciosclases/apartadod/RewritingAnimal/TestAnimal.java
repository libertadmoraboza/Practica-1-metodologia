package es.uah.matcomp.mp.e1.ejerciciosclases.apartadod.RewritingAnimal;

public class TestAnimal {
    public static void main(String[] args){
        Animal a1 = new Cat ("Ralph");
        //Downcast cat
        Cat c1 = (Cat)a1;
        c1.greets();
        Cat c2 = new Cat ("Chiquinino");

        Animal a2 = new Dog("Noa");
        //Downcast dog
        Dog d1 = (Dog)a2;
        d1.greets();
        Dog d2 = new Dog("Sebastian");
        d2.greets(d1);

        Animal a3 = new BigDog("Max");
        Dog d3 = (Dog)a3;
        d3.greets();
        d3.greets(d2);
        BigDog bg1 = (BigDog)d3;
        bg1.greets();
        bg1.greets(d2);
        BigDog bg2 = new BigDog("Spike");
        bg2.greets(bg1);
    }
}
