import java.util.Scanner;

public class q12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the perimeter of the square: ");
        double perimeter = sc.nextDouble();

        double sideLength = perimeter / 4;

        System.out.println("The length of the side is " + sideLength + " whose perimeter is " + perimeter);

    }
}
