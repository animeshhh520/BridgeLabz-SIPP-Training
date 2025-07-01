package Inheritance.Vehicle_Transport_System;

public class Motorcycle extends Vehicle {
    int Mileage;
    public Motorcycle(int maxSpeed,String fuelType,int Mileage){
        super(maxSpeed, fuelType);
        this.Mileage=Mileage;
    }
    public void DisplayInfo(){
        super.DisplayInfo();
        System.out.println("Mileage :"+Mileage);
    }
    
}
