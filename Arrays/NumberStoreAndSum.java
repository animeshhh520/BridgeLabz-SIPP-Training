import java.util.Scanner;

public class NumberStoreAndSum {

    public static void main(String[] args) {
        double[] numbers = new double[10];
        double total = 0.0;
        int index = 0;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter numbers (enter 0 or a negative number to stop, or up to 10 numbers):");

        while (true) {
            System.out.print("Enter a number: ");
            double userInput = scanner.nextDouble();

            if (userInput <= 0) {
                System.out.println("Zero or a negative number entered. Stopping input.");
                break;
            }

            if (index == numbers.length) {
                System.out.println("Array is full (maximum 10 numbers reached). Stopping input.");
                break;
            }

            numbers[index] = userInput;
            index++;
        }

        System.out.println("\nNumbers entered:");
        if (index == 0) {
            System.out.println("No numbers were entered.");
        } else {
            for (int i = 0; i < index; i++) {
                System.out.print(numbers[i]);
                if (i < index - 1) {
                    System.out.print(", ");
                }
                total += numbers[i];
            }
            System.out.println();
        }

        System.out.println("Sum of all numbers: " + total);

        scanner.close();
    }
}
