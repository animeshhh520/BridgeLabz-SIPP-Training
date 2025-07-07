package PolymorphismEncapsulationInterfaceAbstraction.Employee_Management_System;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        List<Employee> employeeList = new ArrayList<>();

        FullTimeEmployee a1 = new FullTimeEmployee("ABC123", "Alice", 50000);
        a1.assignDepartment("IT");

        PartTimeEmployeee a2 = new PartTimeEmployeee("DEF456", "Bob", 300, 20);
        a2.assignDepartment("Support");

        employeeList.add(a1);
        employeeList.add(a2);

        // Polymorphic behavior
        for (Employee emp : employeeList) {
            emp.displayDetails();
        }
    }
}
