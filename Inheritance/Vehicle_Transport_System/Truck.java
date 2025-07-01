package Inheritance.Vehicle_Transport_System;

public class Truck extends Vehicle {
    int totalWeight;
    public Truck(int maxSpeed,String fuelType,int totalWeight ){
        super(maxSpeed,fuelType);
        this.totalWeight=totalWeight;
    }
    public void DisplayInfo(){
        super.DisplayInfo();
        System.out.println("Weight Capacity: "+totalWeight);
    }
    
}
