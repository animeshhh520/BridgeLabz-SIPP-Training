package Inheritance.Vehicle_management_System;

class PetrolVehicle extends Vehicle implements Refuelable {
    public PetrolVehicle(String model, int maxSpeed) {
        super(model, maxSpeed);
    }

    public void refuel() {
        System.out.println("Refueling the petrol vehicle...");
    }
}