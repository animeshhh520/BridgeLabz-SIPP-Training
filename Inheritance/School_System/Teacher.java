package Inheritance.School_System;

class Teacher extends Person {
    String subject;

    public Teacher(String name, int age, String subject) {
        super(name, age);
        this.subject = subject;
    }

    public void displayRole() {
        System.out.println("Role: Teacher");
        displayCommonDetails();
        System.out.println("Subject: " + subject);
    }
}

