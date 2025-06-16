import java.util.Scanner;
public class arrayOf5 {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter 5 integers: ");
        int[] numbers = new int[5];
        for (int i = 0; i < 5; i++) {
            numbers[i] = sc.nextInt();
        }   
        for(int i=0;i<5;i++){
            if(numbers[i]>0){
                System.out.println("positive");
            }
            else if(numbers[i]<0){
                System.out.println("negative");
            }
            else if(numbers[i]==0){
                System.out.println("zero");
            }}
            for(int i=0;i<5;i++){
            if(numbers[0]>numbers[4]){
                System.out.println("first number is greater than last number");
                break;
            }
            else if(numbers[0]<numbers[4]){
                System.out.println("first number is less than last number");
                break;
            }
            else if(numbers[0]==numbers[4]){
                System.out.println("first number is equal to last number");
                break;
            }  
            else{
                System.out.println("Invalid input");
            }}
        }
}
