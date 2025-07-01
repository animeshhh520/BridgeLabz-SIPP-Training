package Inheritance.Employee_Management;

public class Employee {
    String name;
    String id;
    int Salary;
    public Employee(String name,String id,int Salary){
        this.name=name;
        this.id=id;
        this.Salary=Salary;
    }
    public void DisplayDetails(){
        System.out.println("Employee Name: "+name);
        System.out.println("Employee ID: " +id);
        System.out.println("Employee's Salary: " +Salary);
    }
 
}
