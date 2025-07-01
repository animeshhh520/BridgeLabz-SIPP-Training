package Inheritance.Restaurant_Management;

class Chef extends Person implements Worker {
    public Chef(String name, int id) {
        super(name, id);
    }

    public void performDuties() {
        System.out.println("Chef Duties: Preparing meals, managing kitchen inventory.");
    }
}