package com.andreisecuqa.methodstask;

public class ExecutionService {
    public static void main(String[] args) {
        // Crearea unui obiect Customer
        Customer customer = new Customer("John Doe", 30, "johndoe@example.com");

        // Accesarea valorilor folosind getteri
        System.out.println("Nume: " + customer.getName());
        System.out.println("Vârstă: " + customer.getAge());
        System.out.println("Email: " + customer.getEmail());

        // Actualizarea valorilor folosind setteri
        customer.setName("Jane Smith");
        customer.setAge(25);
        customer.setEmail("janesmith@example.com");

        // Accesarea valorilor actualizate folosind getteri
        System.out.println("Nume actualizat: " + customer.getName());
        System.out.println("Vârstă actualizată: " + customer.getAge());
        System.out.println("Email actualizat: " + customer.getEmail());

        // Crearea unui obiect Customer
        Customer randomDataCustomer = new Customer(DataGeneratorUtil.generateRandomString(10), DataGeneratorUtil.getRandomInt(1, 100), DataGeneratorUtil.generateRandomEmail());

        // Accesarea valorilor folosind getteri
        System.out.println("Nume: " + randomDataCustomer.getName());
        System.out.println("Vârstă: " + randomDataCustomer.getAge());
        System.out.println("Email: " + randomDataCustomer.getEmail());

        // Actualizarea valorilor folosind setteri
        randomDataCustomer.setName(DataGeneratorUtil.generateRandomString(5));
        randomDataCustomer.setAge(DataGeneratorUtil.getRandomInt(1, 100));
        randomDataCustomer.setEmail(DataGeneratorUtil.generateRandomEmail());

        // Accesarea valorilor actualizate folosind getteri
        System.out.println("Nume actualizat: " + randomDataCustomer.getName());
        System.out.println("Vârstă actualizată: " + randomDataCustomer.getAge());
        System.out.println("Email actualizat: " + randomDataCustomer.getEmail());

    }
}
