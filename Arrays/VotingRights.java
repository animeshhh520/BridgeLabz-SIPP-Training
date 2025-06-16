import java.util.Scanner;
public class VotingRights {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of students: ");
        int[] ages = new int[10];
        for(int i = 0; i < 10; i++) {  
            System.out.print("Enter age of student " + (i + 1) + ": ");
            ages[i] = scanner.nextInt();
        }
        for(int i = 0; i < 10; i++) {
            if(ages[i] >= 18) {
                System.out.println("Student " + (i + 1) + " is eligible to vote.");
            }}
}}
