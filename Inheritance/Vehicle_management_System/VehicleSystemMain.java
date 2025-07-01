package Inheritance.Vehicle_management_System;

public class VehicleSystemMain {
    public static void main(String[] args) {
        System.out.println("=== Vehicle Management System ===");

        ElectricVehicle ev = new ElectricVehicle("Tesla Model Y", 220);
        ev.displaySpecs();
        ev.charge();
        System.out.println();

        PetrolVehicle pv = new PetrolVehicle("Toyota Corolla", 180);
        pv.displaySpecs();
        pv.refuel();
    }
}

