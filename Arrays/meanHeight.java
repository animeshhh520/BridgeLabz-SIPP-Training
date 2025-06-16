import java.util.*;
public class meanHeight{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of players in football team : ");
        int n = sc.nextInt();

        double[] heights = new double[n];
        for (int i = 0; i < n; i++) {
            heights[i]=sc.nextInt();
        }
        double sum= 0;
        for (int i =0;i<n;i++){
            sum+= heights[i];
        }
        double mean =sum/n;
        System.out.println("Mean height of the players in the football team is : " + mean);
        sc.close();

}
}