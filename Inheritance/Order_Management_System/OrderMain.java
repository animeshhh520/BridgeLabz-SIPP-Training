package Inheritance.Order_Management_System;

public class OrderMain {
    public static void main(String[] args) {
        Order a1=new Order("12345","18 June 2025");
        Order a2= new ShippedOrder("12345", "18 June 2025", 968);
        Order a3= new DeliveredOrder("12345", "18 June 2025", 968, "25 June 2025");


        a1.orderStatus();
        a2.orderStatus();
        a3.orderStatus();
    }
    
}
