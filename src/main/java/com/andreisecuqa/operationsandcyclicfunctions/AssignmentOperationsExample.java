package com.andreisecuqa.operationsandcyclicfunctions;

public class AssignmentOperationsExample {
    public static void main(String[] args) {
        int a = 8;
        int b = 4;

        // Atribuire simplă
        int result = a;
        System.out.println("Atribuire simplă: " + result);

        // Atribuire cu adunare
        // result = result + b;
        result += b;
        System.out.println("Atribuire cu adunare: " + result);

        // Atribuire cu scădere
//        result = result - b;
        result -= b;
        System.out.println("Atribuire cu scădere: " + result);

        // Atribuire cu înmulțire
//        result = result * b;
        result *= b;
        System.out.println("Atribuire cu înmulțire: " + result);

        // Atribuire cu împărțire
//        restul = result / b;
        result /= b;
        System.out.println("Atribuire cu împărțire: " + result);

        // Atribuire cu restul împărțirii
//        result = result % b;
        result %= b;
        System.out.println("Atribuire cu restul împărțirii: " + result);
    }
}
