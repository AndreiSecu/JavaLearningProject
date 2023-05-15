package com.andreisecuqa.accessmodifiers;

import com.andreisecuqa.accessmodifiers.peopleevidence.Person;

public class ChisinauEvidenceCatalog {
    public static void main(String[] args) {
        Person andreiBuzu = new Person(54646546546L);
        andreiBuzu.address = "Alexandru cel Bun 105";
        andreiBuzu.gender = "Masculin";
        System.out.println(andreiBuzu.toString());
        Person.printNumberOfPeople();

        Person mihaiEminescu = new Person(464564646466L, "Mihai Eminescu", false, 37);
        mihaiEminescu.address = "Veronica Micle 24";
        mihaiEminescu.gender = "Masculin";
        System.out.println(mihaiEminescu.toString());
        Person.printNumberOfPeople();

        Person vasileBuhnici = new Person(464554646466L, "Vasile Buhnici", false, 37);
        vasileBuhnici.gender = "Masculin";
        vasileBuhnici.address = "Strada Avram Iancu 27";
        System.out.println(vasileBuhnici.toString());
        Person.printNumberOfPeople();

        Person elenaProfir = new Person(464554646856L, "Elena Profir", false, 37);
        elenaProfir.gender = "Femenin";
        elenaProfir.address = "Mitropolitul Bodoni";
        System.out.println(elenaProfir.toString());
        Person.printNumberOfPeople();
    }
}