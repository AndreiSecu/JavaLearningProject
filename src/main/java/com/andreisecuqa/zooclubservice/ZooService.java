package com.andreisecuqa.zooclubservice;

public class ZooService {
    public static void main(String[] args) {
        //Mai jos se aplica polimorfismul pentru a declara un obiect de tip Animal insa a il crea cu constructorul clasei copil Dog
        Animal dog = new Dog("Laika");
        Cat cat = new Cat("Sonic");
        Dog secondDog = new Dog("Virus");

        //Metoda makeSound() ce apartine obiectului Dog nu poate fi apelata deoarece dog este de tip Animal iar makeSound()
        //este declarata in Interfata, pentru a fixa acest lucru ar trebui ca interfata sa fie immplementata de catre clasa abstracta Animal
        //dog.makeSound();

        dog.eat();

        cat.makeSound();
        cat.eat();
    }
}