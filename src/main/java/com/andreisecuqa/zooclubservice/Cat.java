package com.andreisecuqa.zooclubservice;

public class Cat extends Animal implements AnimalInterface {
    //Definim un constructor pentru a crea obiecte de tipul Cat cu paramentrul formal de tip String Name
    public Cat(String name) {
        //Cuvantul cheie super este folosit pentru apelul constructorului clasei parinte, care are nevoie de această proprietate
        super(name);
    }

    //makesound() este o metodă declarată în AnimalInterface respectiv trebuie implementată, ea fiind abstractă acolo
    @Override
    public void makeSound() {
        System.out.println("Cat " + getName() + " says: Meow!");
    }

    //eat() este o metodă declarată în clasa abstracta Animal respectiv trebuie implementată, ea fiind abstractă acolo
    @Override
    public void eat() {
        //metoda getName este concreta si implementata in clasa Parinte Animal. Aceasta poate fi declarata si Protected acolo.
        System.out.println(getName() + " is eating fish.");
    }
}