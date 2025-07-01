package Inheritance.Vehicle_Transport_System;

public class Vehicle {
    int maxSpeed;
    String fuelType;
    public Vehicle(int maxSpeed,String fuelType){
        this.maxSpeed=maxSpeed;
        this.fuelType=fuelType;
    }
    public void DisplayInfo(){
        System.out.println("Max Speed of Vehicle: "+ maxSpeed);
        System.out.println("Fuel Type: "+fuelType);
    }
}
