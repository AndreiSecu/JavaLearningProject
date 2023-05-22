package com.andreisecuqa.methodstask;

public class Customer {
    private String name;
    private int age;
    private String email;

    // Constructor
    public Customer(String name, int age, String email) {
        this.name = name;
        this.age = age;
        this.email = email;
    }

    // Getter pentru nume
    public String getName() {
        return name;
    }

    // Setter pentru nume
    public void setName(String name) {
        this.name = name;
    }

    // Getter pentru vârstă
    public int getAge() {
        return age;
    }

    // Setter pentru vârstă
    public void setAge(int age) {
        this.age = age;
    }

    // Getter pentru email
    public String getEmail() {
        return email;
    }

    // Setter pentru email
    public void setEmail(String email) {
        this.email = email;
    }

}
