package Inheritance.Restaurant_Management;

class Waiter extends Person implements Worker {
    public Waiter(String name, int id) {
        super(name, id);
    }

    public void performDuties() {
        System.out.println("Waiter Duties: Taking orders, serving food.");
    }
}
