package com.andreisecuqa.zooclubservice;

public class ZooExecutionService {
    public static void main(String[] args) {
        Animal charlieDog = new Dog("Charlie");

        System.out.println("Numele obiectului charlieDog este :" + charlieDog.getName());
        charlieDog.setName("Charlie Vaccined");
        System.out.println("Numele actualizat a lui charlieDog este :" + charlieDog.getName());

        charlieDog.eat();
        charlieDog.makeSound();

        AnimalInterface rexDog = new Dog("Rex");
        rexDog.makeSound();

        Dog zikDog = new Dog("Zik");
        zikDog.eat();
        zikDog.makeSound();

        Cat mitzaPisiPisi = new Cat("Mitza");
        mitzaPisiPisi.eat();
        mitzaPisiPisi.makeSound();
    }
}
