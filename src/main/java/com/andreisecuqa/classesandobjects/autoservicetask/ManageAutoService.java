package com.andreisecuqa.classesandobjects.autoservicetask;


public class ManageAutoService {
    public static void main(String[] args) {

        Garage garajulLuiAndrei = new Garage("Lunca Nistrului");
        garajulLuiAndrei.carCapacity = 342;
        garajulLuiAndrei.hasComputerDiagnostics = true;
        garajulLuiAndrei.numberId = "5454";
        garajulLuiAndrei.scheduler = "uneori";

        System.out.println("Garajul lui Andrei are urmatoarele proprietati: Adresa" + garajulLuiAndrei.address +
                " CarCapacity:" + garajulLuiAndrei.carCapacity + " numberId: " + garajulLuiAndrei.numberId + ", Orarul " +
                "de lucru:" + garajulLuiAndrei.scheduler + ", hasComputerDiagnostics: " +
                "" + garajulLuiAndrei.hasComputerDiagnostics);

        Garage garajulLuiGheorghe = new Garage("Lunca Prutului");
        garajulLuiGheorghe.carCapacity = 545;
        garajulLuiGheorghe.hasComputerDiagnostics = false;
        garajulLuiGheorghe.numberId = "534254";
        garajulLuiGheorghe.scheduler = "mai des";

        System.out.println("Garajul lui Gheorghe are urmatoarele proprietati: Adresa" + garajulLuiGheorghe.address +
                " CarCapacity:" + garajulLuiGheorghe.carCapacity + " numberId: " + garajulLuiGheorghe.numberId + ", Orarul " +
                "de lucru:" + garajulLuiGheorghe.scheduler + ", hasComputerDiagnostics: " +
                "" + garajulLuiGheorghe.hasComputerDiagnostics);


        Garage garajulElenei = new Garage(345);
        garajulElenei.address = "Burbista 45";
        garajulElenei.hasComputerDiagnostics = false;
        garajulElenei.numberId = "534254";
        garajulElenei.scheduler = "mai des";

        System.out.println("Garajul lui Elenei are urmatoarele proprietati: Adresa" + garajulElenei.address +
                " CarCapacity:" + garajulElenei.carCapacity + " numberId: " + garajulElenei.numberId + ", Orarul " +
                "de lucru:" + garajulElenei.scheduler + ", hasComputerDiagnostics: " +
                "" + garajulElenei.hasComputerDiagnostics);


        Car masinaLuiIulian = new Car("Merceds", "GLE Class", 2022, "Disel");

        masinaLuiIulian.carPrice = 45546;
        masinaLuiIulian.km = 6500;
        masinaLuiIulian.gearType = "Automatical";

        System.out.println("Masina lui Iulian are probleme dar si proprietati: Make:" + masinaLuiIulian.make + ", Model:" +
                masinaLuiIulian.model + ", Production Year:" + masinaLuiIulian.productionYear + ", FuelType:" + masinaLuiIulian.fuelType +
                ", car Price:" + masinaLuiIulian.carPrice + ", km:" + masinaLuiIulian.km + ", gear type:" + masinaLuiIulian.gearType);

        Tool elevatorTool = new Tool(23165465);
        elevatorTool.isElevator = true;
        elevatorTool.isUsed = true;
        elevatorTool.needsElectricity = true;

        System.out.println("Obiectul elevatorTool are proprietatile" +
                " Cod Unic:" + elevatorTool.uniqueCode +
                " este Elevator:" + elevatorTool.isElevator +
                " foloseste electricitate:" + elevatorTool.needsElectricity +
                " este utilizat:" + elevatorTool.isUsed);


        Worker lucratorulGavril = new Worker();

        lucratorulGavril.name = "Gavril";
        lucratorulGavril.age = 40;
        lucratorulGavril.isExperienced = true;
        lucratorulGavril.sexType = "Masculin";
        lucratorulGavril.specialization = "Electric Auto";

        System.out.println("Obiectul lucratorulGavril are proprietatile" +
                " Nume:" + lucratorulGavril.name +
                " Varsta:" + lucratorulGavril.age +
                " Are Experienta:" + lucratorulGavril.isExperienced +
                " SexType:" + lucratorulGavril.sexType +
                " specializare:" + lucratorulGavril.specialization);
    }
}
