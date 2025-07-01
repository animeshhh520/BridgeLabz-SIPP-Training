package Inheritance.Employee_Management;

public class Manager extends Employee {
    int teamSize;

    public Manager(String name,String id,int Salary,int teamSize){
        super(name, id, Salary);
        this.teamSize=teamSize;
    }
    public void DisplayDetails(){
        super.DisplayDetails();
        System.out.println("Team Size "+teamSize);
    }
    
}
