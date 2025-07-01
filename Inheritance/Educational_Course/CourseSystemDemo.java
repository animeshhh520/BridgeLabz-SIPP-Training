package Inheritance.Educational_Course;

public class CourseSystemDemo {
    public static void main(String[] args) {
        PaidOnlineCourse poc = new PaidOnlineCourse("Java Programming", 6, "Coursera", true, 4999.0, 20.0);
        poc.displayDetails();
    }
}