import java.util.Stack;

public class QueueFromStack {
    public static void main(String[] args){
        Stack<Integer> st1=new Stack<>();+
        Stack<Integer> st2=new Stack<>();
        int[] arr ={1,2,3,4,5};
        for(int i =0;i<arr.length;i++){
            st1.push(arr[i]);
        }
        for(int i=0;i<arr.length;i++){
            st2.push(st1.peek());
            st1.pop();
        }

        for(int i=0;i<arr.length;i++){
            System.out.println(st2.peek());
            st2.pop();
        }
    }
    
}
