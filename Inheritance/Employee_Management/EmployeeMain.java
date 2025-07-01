package Inheritance.Employee_Management;

public class EmployeeMain {
    public static void main(String[] args) {
        Employee manager= new Manager("Ashish", "22215", 150000, 8);
        Employee developer= new Developer("Madhav", "696969", 50000,"Python");
        Employee intern= new Intern ("Divyanshu","420420",20000,"Artificial Intelligence");


        manager.DisplayDetails();
        developer.DisplayDetails();
        intern.DisplayDetails();
    }
    
}
