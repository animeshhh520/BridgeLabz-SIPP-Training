package Inheritance.Vehicle_Transport_System;

public class Car extends Vehicle {
    int seatCapacity;
    public Car(int maxSpeed,String fuelType, int seatCapacity){
        super(maxSpeed, fuelType);
        this.seatCapacity=seatCapacity;
    }
    public void DisplayInfo(){
        super.DisplayInfo();
        System.out.println("Seating Capacity: "+seatCapacity);
    }
    
}
