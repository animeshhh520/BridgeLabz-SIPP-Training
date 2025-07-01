package Inheritance.Employee_Management;

public class Developer extends Employee {
    String programmingLanguage;
    public Developer(String name,String id,int Salary,String programmingLanguage){
        super(name, id, Salary);
        this.programmingLanguage=programmingLanguage;
    }

    public void DisplayDetails(){
        super.DisplayDetails();
        System.out.println("Programming Language: "+programmingLanguage);
    }
    
}
