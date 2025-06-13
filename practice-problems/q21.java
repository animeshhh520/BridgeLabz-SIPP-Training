import java.util.Scanner;

public class q21 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter your name: ");
        String name = input.nextLine();

        System.out.print("Enter the starting city: ");
        String fromCity = input.nextLine();

        System.out.print("Enter the via city: ");
        String viaCity = input.nextLine();

        System.out.print("Enter the final destination city: ");
        String toCity = input.nextLine();

        System.out.print("Enter the distance from " + fromCity + " to " + viaCity + " in miles: ");
        double fromToVia = input.nextDouble();

        System.out.print("Enter the distance from " + viaCity + " to " + toCity + " in miles: ");
        double viaToFinalCity = input.nextDouble();

        System.out.print("Enter time taken from " + fromCity + " to " + viaCity + " in minutes: ");
        int timeFromToVia = input.nextInt();

        System.out.print("Enter time taken from " + viaCity + " to " + toCity + " in minutes: ");
        int timeViaToFinalCity = input.nextInt();

        double totalDistanceMiles = fromToVia + viaToFinalCity;
        double totalDistanceKm = totalDistanceMiles * 1.60934;  
        int totalTime = timeFromToVia + timeViaToFinalCity;

        System.out.println("\nThe Total Distance travelled by " + name + " from " + fromCity + " to " + toCity +
                " via " + viaCity + " is " + totalDistanceKm + " km and the Total Time taken is " + totalTime + " minutes.");

    }
}
