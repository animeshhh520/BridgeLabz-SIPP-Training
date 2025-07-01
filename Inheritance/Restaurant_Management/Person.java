package Inheritance.Restaurant_Management;

interface Worker {
    void performDuties();
}

class Person {
    String name;
    int id;

    public Person(String name, int id) {
        this.name = name;
        this.id = id;
    }

    public void displayInfo() {
        System.out.println("Name: " + name);
        System.out.println("ID: " + id);
    }
}
