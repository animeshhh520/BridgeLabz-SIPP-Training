package Linked_List;

import java.util.Collection;

public class LinkedListGenerics<T extends Number> {
    private class Node {
        T data;
        Node next;

        Node(T data) {
            this.data = data;
        }
    }


    private Node head;
    private Node tail;

    public void add(T data) {
        Node n = new Node(data);
        if (head == null) {
            head = tail = n;
        } else {
            tail.next = n;
            tail = n;
        }
    }

    public void display() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
        System.out.println("null");
    }

    public void addFirst(T data) {
        Node n = new Node(data);
        if (head == null) {
            head = tail = n;
        } else {
            n.next = head;
            head = n;
        }
    }
    public T get(int index){
        if(index < 0){
            return null;
        }
        Node temp = head;
        int currIndex=0;
        int ans=0;
        while(temp!=null){
            if(currIndex==index){
                ans=temp.data;

            }
            temp = temp.next;
            currIndex++;
        }
        return ans;
    }

    public static void main(String[] args) {
      
        LinkedListGenerics<Integer> l1 = new LinkedListGenerics<>();
        l1.add(1);
        l1.add(2);
        l1.add(3);
        System.out.print("Initial list: ");
        l1.display();
        l1.addFirst(0);
        System.out.print("After addFirst(0): ");
        l1.display();
        
        LinkedListGenerics<Integer> l2= new LinkedListGenerics<>();
        l2.add(1);
        l2.add(2);
        l2.display();

        LinkedListGenerics<? extends Number> l3= l1;
        
        l3.display();

        LinkedListGenerics<? super Number> l4=new LinkedListGenerics<>();

        l4.add(2);
        l4.add(9);
        l4.display();  

        l1.get(5);
    }
}