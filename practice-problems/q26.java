import java.util.Scanner;

public class q26 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the number of chocolates: ");
        int numberOfchocolates = input.nextInt();

        System.out.print("Enter the number of children: ");
        int numberOfChildren = input.nextInt();

        int chocolatesPerChild = numberOfchocolates / numberOfChildren;

        int remainingChocolates = numberOfchocolates % numberOfChildren;

        System.out.println("The number of chocolates each child gets is " + chocolatesPerChild +
                " and the number of remaining chocolates is " + remainingChocolates);


    }
}
