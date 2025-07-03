public class LinkedList{
    Node head;
    Node tail;
    public class Node{
        Object data;
        Node next;
        Node (Object data){
            this.data=data;
        }
    }

    public void add (Object data){
        Node n= new Node(data);
        if(head==null){
            head=tail=n;
        }
        else{
            tail.next=n;
            tail = n;
        }
    }
    public void Display(){
        Node temp=head;
        while(temp!=null){
            System.out.print(temp.data+"->");
            temp= temp.next; 
        }

    }
    public void addFirst(Object data){
        Node n=new Node(data);
        if(head==null){
            head=tail=n;
        }
        else{
        n.next=head;
        head=n;
        }
    }
    public void Delete(){
        
        
    }
    public static void main(String[] args){
        LinkedList l1= new LinkedList();
        l1.add(1);
        l1.add(2);
        l1.add(3);
        l1.Display();
    }

}