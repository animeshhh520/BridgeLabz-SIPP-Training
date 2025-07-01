package Inheritance.Order_Management_System;

public class ShippedOrder extends Order{
    int trackingNumber;
    public ShippedOrder(String orderID,String orderDate,int trackingNumber){
        super(orderID,orderDate);
        this.trackingNumber=trackingNumber;
    }
    public void orderStatus(){
        super.orderStatus();
        System.out.printf("Tracking number of order %s :%d ",orderID,trackingNumber);
        System.out.println("Order is Shipped");
        }
    
}
