package PolymorphismEncapsulationInterfaceAbstraction.Employee_Management_System;

public abstract class Employee implements Department{
    private String employeeID;
    private String name;
    private double baseSalary;
    private String department;
    public Employee(String employeeID, String name, double baseSalary) {
        this.employeeID = employeeID;
        this.name = name;
        this.baseSalary=baseSalary;
}

public String getEmployeeID(){
    return employeeID;
}
public String getName(){
    return name;
}
public double getBaseSalary(){
    return baseSalary;
}
public void setBaseSalary(double baseSalary){
    this.baseSalary=baseSalary;
}
public abstract double calculateSalary();

public void displayDetails(){
    System.out.println("Employee ID: "+employeeID);
    System.out.println("Name: "+name);
    System.out.println("Base Salary: "+baseSalary);
    System.out.println("Department: "+department);
    System.out.println("Calculated Salary"+calculateSalary());
}



@Override
public void assignDepartment(String deptName){
    this.department=deptName;
}
public String getDepartmentDetails(){
    return department;
}}