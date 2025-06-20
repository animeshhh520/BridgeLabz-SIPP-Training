import java.util.*;
class SpringSeason {

    public static boolean isSpring(int month, int day) {
        if (month == 3 && day >= 20) return true;
        if (month == 4 || month == 5) return true;
        if (month == 6 && day <= 20) return true;
        return false;
    }
    
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the month: ");
        int month= sc.nextInt();
        System.out.println("Enter the day");
        int day= sc.nextInt();
        if(month>0 && month <13 && day >0 && day <32){
        if (isSpring(month, day)) {
            System.out.println("It's a Spring Season");
        } else {
            System.out.println("Not a Spring Season");
        }}
        else{
            System.out.println("Please enter a valid month and day");
        }

    }
}