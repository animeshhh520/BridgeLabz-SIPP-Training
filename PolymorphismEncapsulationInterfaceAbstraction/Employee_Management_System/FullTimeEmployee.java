package PolymorphismEncapsulationInterfaceAbstraction.Employee_Management_System;

public class FullTimeEmployee extends Employee {
    public FullTimeEmployee(String employeeID,String name,double baseSalary){
        super(employeeID,name,baseSalary);
       
    }
    @Override
    public double calculateSalary(){
        return getBaseSalary()*1.2;
    }
     @Override
        public String getDepartmentDetail() {
            return "FullTimeEmployee Department Details";
        }
    
}
