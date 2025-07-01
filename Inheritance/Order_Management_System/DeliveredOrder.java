package Inheritance.Order_Management_System;

public class DeliveredOrder extends ShippedOrder{
    String deliveryDate;
    public DeliveredOrder(String orderID,String orderDate,int trackingNumber,String deliveryDate){
        super(orderID, orderDate, trackingNumber);
        this.deliveryDate=deliveryDate;
    }
    public void orderStatus(){
        super.orderStatus();
        System.out.println("Order is delivered on:"+deliveryDate);
    }
    
}
