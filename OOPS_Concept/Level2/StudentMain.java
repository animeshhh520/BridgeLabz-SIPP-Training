package OOPS_Concept.Level2;
import java.util.*;
public class StudentMain {
    public static void main(String [] args){
        Scanner sc=new Scanner (System.in);
        System.out.print("Enter Student's Name :");
        String name = sc.nextLine();

        System.out.print("Enter Roll No. :");
        long rollNumber = sc.nextLong();

        System.out.print("Enter Marks :");
        double marks = sc.nextDouble();

        Student student = new Student(name,rollNumber,marks);
        
        System.out.println();
        student.Display();
    }
    
}
