package com.andreisecuqa.accessmodifiers.peopleevidence;

public class Person {
    // This property is class related - Class Variable, it is private - it can be accessed only within the Person class
    public static int totalNumberOfPersonObjects;

    // This is a instance variable and it is declared as private - it can be accessed only from Person class
    private int age;

    // The gender and name are instance variables because they describe the objects of the class. Public means that they can be accessed from anywhere in the project.
    public String gender;
    public String name;
    //IDNP

    // The final key word describe a non access modifiers which means that this property will not be chaged during the execution and it has to be intialized once the object is created.
    private final long CNP;
    public String address;

    // The protected property can be accessed only from classes which belongs to the peopleevidence package and subclasses
    protected String phone;

    // The default property can be accessed only from classes which belongs to the peopleevidence
    double height;
    String eyeColor;
    double weight;
    String education;
    String nationality;
    boolean isMarried;

    String readingBook;
    String emailAddress;
    String occupation;

    // There is a constructor with only one parameter that is a mandatory field
    public Person(long CNPObligatoriuLaCreare) {
        CNP = CNPObligatoriuLaCreare;
        totalNumberOfPersonObjects++;
    }

    // There is a constructor with multiple parameters that contains the mandatory CNP field too
    public Person(long CNP, String name, boolean isMarried, int age) {
        this.CNP = CNP;
        this.name = name;
        this.isMarried = isMarried;
        this.age = age;
        totalNumberOfPersonObjects = totalNumberOfPersonObjects + 1;
    }

    public static void printNumberOfPeople() {
        System.out.println("Numarul total de persoane este = " + totalNumberOfPersonObjects);
    }

    @Override
    public String toString() {
        return "Person{" +
                "age=" + age +
                ", gender='" + gender + '\'' +
                ", name='" + name + '\'' +
                ", CNP=" + CNP +
                ", address='" + address + '\'' +
                ", phone='" + phone + '\'' +
                ", height=" + height +
                ", eyeColor='" + eyeColor + '\'' +
                ", weight=" + weight +
                ", education='" + education + '\'' +
                ", nationality='" + nationality + '\'' +
                ", isMarried=" + isMarried +
                ", emailAddress='" + emailAddress + '\'' +
                ", occupation='" + occupation + '\'' +
                '}';
    }
}
