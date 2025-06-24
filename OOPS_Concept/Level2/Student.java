package OOPS_Concept.Level2;
public class Student{
    private String name;
    private long rollNumber;
    private double marks;
    //Constructor
    public Student(String name,long rollNumber, double marks ){
        this.name=name;
        this.rollNumber=rollNumber;
        this.marks=marks;
    }
    //method to calculate Grade
    public String CalculateGrade(){
        if(marks>=90) return "A+";
        else if(marks>=85) return "A";
        else if (marks>=75) return "B+";
        else if( marks>=65) return "B";
        else if(marks >= 55) return "C";
        else if(marks>= 33) return "D";
        else return "Fail";
    }
    public void Display(){
        System.out.println("Student Details:");
        System.out.println("Name :" +name);
        System.out.println("RollNumber : " +rollNumber);
        System.out.println("Marks :" +marks);
        System.out.println("Grade : " +CalculateGrade());        
    }
}