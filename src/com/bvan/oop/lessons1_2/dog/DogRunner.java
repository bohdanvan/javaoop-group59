package com.bvan.oop.lessons1_2.dog;

/**
 * @author bvanchuhov
 */
public class DogRunner {

    public static void main(String[] args) {
        Dog dog = new Dog("Rex");
        dog.bark(3);
        System.out.println(dog);
        System.out.println();

        Owner owner = new Owner("Jack", dog);
        owner.giveCommand();
        System.out.println();

        DogTrainer dogTrainer = new DogTrainer();
        dogTrainer.addDog(dog);
        dogTrainer.addDog(new Dog("Barsik"));
        dogTrainer.giveCommand();
    }
}
