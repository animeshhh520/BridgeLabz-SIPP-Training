import java.util.Scanner;
import java.util.Arrays;

public class factors {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number to find its factors: ");
        int number = scanner.nextInt();

        if (number <= 0) {
            System.out.println("Please enter a positive number.");
            scanner.close();
            return;
        }

        int maxFactor = 10;
        int[] factors = new int[maxFactor];
        int index = 0;

        System.out.println("\nFinding factors for " + number + "...");

        for (int i = 1; i <= number; i++) {
            if (number % i == 0) {
                if (index == factors.length) {
                    int newCapacity = factors.length * 2;
                    System.out.println("Array full, resizing from " + factors.length + " to " + newCapacity);
                    int[] temp = new int[newCapacity];

                    for (int j = 0; j < factors.length; j++) {
                        temp[j] = factors[j];
                    }
                    factors = temp;
                }
                factors[index] = i;
                index++;
            }
        }

        System.out.println("\nFactors of " + number + " are:");
        if (index == 0) {
            System.out.println("No factors found (this should not happen for positive integers, as 1 is always a factor).");
        } else {
            for (int i = 0; i < index; i++) {
                System.out.print(factors[i]);
                if (i < index - 1) {
                    System.out.print(", ");
                }
            }
            System.out.println();
        }

        scanner.close();
    }
}
