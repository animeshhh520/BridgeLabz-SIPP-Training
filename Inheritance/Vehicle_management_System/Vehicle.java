package Inheritance.Vehicle_management_System;

interface Refuelable {
    void refuel();
}

class Vehicle {
    String model;
    int maxSpeed;

    public Vehicle(String model, int maxSpeed) {
        this.model = model;
        this.maxSpeed = maxSpeed;
    }

    public void displaySpecs() {
        System.out.println("Model: " + model);
        System.out.println("Max Speed: " + maxSpeed + " km/h");
    }
}
