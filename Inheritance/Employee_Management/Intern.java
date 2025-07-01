package Inheritance.Employee_Management;

public class Intern extends Employee {
    String field;
    public Intern(String name,String id,int Salary,String field){
        super(name, id, Salary);
        this.field=field;
    }

    public void DisplayDetails(){
        super.DisplayDetails();
        System.out.println("Field of Training: " +field);
    }
    
}
