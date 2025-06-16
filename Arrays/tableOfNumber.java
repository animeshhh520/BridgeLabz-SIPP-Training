import java.util.Scanner;
public class tableOfNumber {
    public static void main (String []args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int [] arr= new int [11];
        for(int i =1;i<=10;i++){
            arr[i]=n*i;
        }
        for(int i =1;i<=10;i++){
            System.out.println(n+" * "+i+" = "+arr[i]);
        }
    }
}
