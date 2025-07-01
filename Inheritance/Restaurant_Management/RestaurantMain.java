package Inheritance.Restaurant_Management;

public class RestaurantMain  {
    public static void main(String[] args) {
        System.out.println("=== Restaurant Worker Duties ===");

        Chef chef = new Chef("Raj", 201);
        chef.displayInfo();
        chef.performDuties();
        System.out.println();

        Waiter waiter = new Waiter("Riya", 202);
        waiter.displayInfo();
        waiter.performDuties();
    }
}

    

