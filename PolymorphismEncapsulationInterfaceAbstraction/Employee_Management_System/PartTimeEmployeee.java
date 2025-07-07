package PolymorphismEncapsulationInterfaceAbstraction.Employee_Management_System;

public class PartTimeEmployeee extends Employee {
    private int hoursWorked;
    private double hourlyRate;
    public PartTimeEmployeee (String employeeID,String name, int hoursWorked, double hourlyRate) {
        super(employeeID, name,0);
        this.hoursWorked=hoursWorked;
        this.hourlyRate=hourlyRate;
}
@Override
public double calculateSalary() {
    return hoursWorked * hourlyRate;
}
@Override
public String getDepartmentDetail() {
    // TODO Auto-generated method stub
    throw new UnsupportedOperationException("Unimplemented method 'getDepartmentDetail'");
}
}