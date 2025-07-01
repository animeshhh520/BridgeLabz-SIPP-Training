package Inheritance.School_System;

class Student extends Person {
    int grade;

    public Student(String name, int age, int grade) {
        super(name, age);
        this.grade = grade;
    }

    public void displayRole() {
        System.out.println("Role: Student");
        displayCommonDetails();
        System.out.println("Grade: " + grade);
    }
}
