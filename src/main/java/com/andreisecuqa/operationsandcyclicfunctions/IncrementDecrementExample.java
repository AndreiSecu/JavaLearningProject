package com.andreisecuqa.operationsandcyclicfunctions;

public class IncrementDecrementExample {
    public static void main(String[] args) {
        int a = 5;

        // Incrementare
        a++;
        System.out.println("Valoarea după incrementare: " + a);

        // Incrementare pre-fixată
        ++a;
        //a = 7
        int b = ++a;
        // b = 8, a = 8;
        int a1 = a;
        int c = a++;
        // c = 8; a = 9
        System.out.println("Valoarea după incrementare pre-fixată: " + a);
        System.out.println("Afiseaza b = " + b + " a1= " + a1 + " c = " + c + " a2= " + a);

        // Decrementare
        a--;
        System.out.println("Valoarea după decrementare: " + a);

        // Decrementare pre-fixată
        --a;
        System.out.println("Valoarea după decrementare pre-fixată: " + a);
    }
}
