import java.util.Scanner;

public class multiplicationTable {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number to find its multiplication table: ");
        int number = scanner.nextInt();

        int[] multiplicationResult = new int[4]; 

        System.out.println("\nMultiplication table of " + number + " (from 6 to 9):");

        for (int i = 6; i <= 9; i++) {
            int result = number * i;
            multiplicationResult[i - 6] = result;
        }

        for (int i = 6; i <= 9; i++) {
            System.out.println(number + " * " + i + " = " + multiplicationResult[i - 6]);
        }

        scanner.close();
    }
}