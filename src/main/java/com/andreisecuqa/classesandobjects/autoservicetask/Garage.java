package com.andreisecuqa.classesandobjects.autoservicetask;

import java.util.Date;

public class Garage {

    String address;

    boolean hasComputerDiagnostics;

    int carCapacity;

    String numberId;

    String scheduler;

    Garage(String adressaDataLaCreare) {
        this.address = adressaDataLaCreare;
        System.out.println("A fost creat un garaj");
    }

    Garage(int carCapacity) {
        this.carCapacity = carCapacity;
    }


}
