package oop;

public class InheritanceMain {
    public static void main(String[] args) {
        InheritanceAnimal animal = new InheritanceAnimal("Generic Animal", "Huge", 400);
        // doAnimalStuff(animal, "slow");

        InheritanceDog dog = new InheritanceDog();
        // doAnimalStuff(dog, "fast");

        InheritanceDog yorkie = new InheritanceDog("Yorkie", 15);
        // doAnimalStuff(yorkie, "fast");

        InheritanceDog retriever = new InheritanceDog("Labrador Retriever", 65, "Floppy", "Swimmer");
        // doAnimalStuff(retriever, "slow");

        InheritanceDog wolf = new InheritanceDog("Wolf", 40);
        // doAnimalStuff(wolf, "slow");

        InheritanceFish goldie = new InheritanceFish("Gold Fish", 0.25, 2, 3);
        doAnimalStuff(goldie, "fast");
    }

    public static void doAnimalStuff(InheritanceAnimal animal, String speed) {
        animal.makeNoise();
        animal.move(speed);
        System.out.println(animal);
        System.out.println("_ _ _ _");
    }
}