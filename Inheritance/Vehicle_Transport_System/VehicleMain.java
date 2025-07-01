package Inheritance.Vehicle_Transport_System;

public class VehicleMain {
    public static void main(String[] args) {
        Vehicle a1=new Car(135,"Diesel", 5);
        Vehicle a2=new Truck(90, "Petrol",45000);
        Vehicle a3= new Motorcycle(110, "Petrol",45);

        a1.DisplayInfo();
        a2.DisplayInfo();
        a3.DisplayInfo();
    }
    
}
