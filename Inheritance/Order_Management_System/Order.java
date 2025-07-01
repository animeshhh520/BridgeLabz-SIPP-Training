package Inheritance.Order_Management_System;

public class Order {
    String orderID;
    String orderDate;
    public Order(String orderID,String orderDate){
        this.orderID=orderID;
        this.orderDate=orderDate;
    }
    public void orderStatus(){
        System.out.printf("Order %s placed on %s is confirmed",orderID,orderDate);
        System.out.println();
    }
    
}
