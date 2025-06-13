import java.util.Scanner;

public class q14 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter base of the triangle in cm: ");
        double base = input.nextDouble();

        System.out.print("Enter height of the triangle in cm: ");
        double height = input.nextDouble();

        double areaCm2 = 0.5 * base * height;

        double areaIn2 = areaCm2 / (2.54 * 2.54);

        System.out.println("The Area of the triangle in sq cm is " + areaCm2 + " and in sq in is " + areaIn2);


    }
}
