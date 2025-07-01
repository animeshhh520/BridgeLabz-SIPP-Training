package Inheritance.School_System;

public class PersonMain {
    public static void main(String[] args) {
        System.out.println("=== School System Roles ===");

        Teacher teacher = new Teacher("Alice", 35, "Mathematics");
        teacher.displayRole();
        System.out.println();

        Student student = new Student("Bob", 16, 10);
        student.displayRole();
        System.out.println();

        Staff staff = new Staff("Charlie", 42, "Library");
        staff.displayRole();
    }
}

