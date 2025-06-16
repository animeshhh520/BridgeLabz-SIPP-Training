import java.util.*;
public class fizzBuzz {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        String[] fizzBuzz=new String[n];
        if(n>0){
        for(int i = 0; i < n; i++) {
            if(i%3==0) {
                fizzBuzz[i]="Fizz";
            }
            else if(i%5==0) {
                fizzBuzz[i]="Buzz";
            }
            else{
                fizzBuzz[i]=String.valueOf(i);
            }
        }for(int i =0;i<n;i++){
            System.out.println(fizzBuzz[i]);
        }}
        else{
            System.out.println("Please enter a positive integer.");
        }

}}
