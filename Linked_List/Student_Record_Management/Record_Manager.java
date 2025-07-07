package Linked_List.Student_Record_Management;

public class Record_Manager {
    Node head;
    public class Node{
    int RollNumber;
    String Name;
    int age;
    int Grade;
    Node next;
        Node(int RollNumber,String Name,int age, int Grade){
            this.RollNumber=RollNumber;
            this.Name=Name;
            this.age=age;
            this.Grade=Grade;
        }
    }
    public void addAtBeginning(int RollNumber,String Name,int age,int Grade){
        Node n=new Node(RollNumber, Name, age, Grade);
        n.next=head;
        head=n;
        }
    
    public void addAtEnd(int RollNumber,String Name,int age,int Grade){
        Node n= new Node(RollNumber, Name, age, Grade);
        if(head==null){
            head=n;
        }
        else{
            Node temp=head;
            while (temp.next != null) {
                temp = temp.next;
            }
            temp.next = n;
        }
        System.out.println("Student added at end.");
    
    }
    public void SearchByRollNo(int RollNo){
        Node temp =head;
        while(temp!=null){
            if(temp.RollNumber==RollNo){
                System.out.println("Roll Number: "+temp.RollNumber+" Name: "+temp.Name+" Age: "+temp.age+" Grade: "+temp.Grade);
        }
        temp=temp.next;
        }
    }
    public void addAtPos(int RollNumber, String Name, int age, int Grade, int pos) {
    Node n = new Node(RollNumber, Name, age, Grade);
    if (pos == 0) {
        addAtBeginning(RollNumber, Name, age, Grade);
    }

    Node temp = head;
    int count = 0;
    while (temp != null && count < pos - 1) {
        temp = temp.next;
        count++;
    }

    if (temp == null) {
        System.out.println("Invalid position");
        return;
    }

    n.next = temp.next;
    temp.next = n;
}

    public void UpdateByRollNo(int RollNumber,String Name,int age,int Grade,int RollNo){
        Node temp =head;
        while(temp!=null){
            if(temp.RollNumber==RollNo){
                temp.RollNumber=RollNumber;
                temp.Name=Name;
                temp.age=age;
                temp.Grade=Grade;    
            }
        temp=temp.next;
        }
    }
    public void Display(){
        Node temp=head;
        while(temp!=null){
            System.out.println("Roll Number: "+temp.RollNumber+" Name of Student: "+temp.Name+" Age : "+temp.age +" Grade: "+temp.Grade);
            System.out.println();
            temp=temp.next;
        }
    }
    
    public void DeleteByRollNo(int RollNumber){
        if(head==null){
            System.out.println("List is Empty");
            return;
        }
        if(head.RollNumber==RollNumber){
            head=head.next;
            System.out.println("Student with Roll No: "+RollNumber+" Deleted");
            return;
        }
        Node temp=head;
        while(temp.next!=null && temp.next.RollNumber!=RollNumber){
                temp=temp.next;
        }
        if(temp.next==null){
            System.out.println("Student not Found");
        }
        else{
            temp.next=temp.next.next;
            System.out.println("Student with Roll No "+RollNumber+ " Deleted");
    }
}
    public static void main(String [] args){
        Record_Manager l1=new Record_Manager();
        l1.addAtEnd(1, "Madhav", 20, 9);
        l1.addAtEnd(2, "Devanshu", 21, 3);
        l1.addAtEnd(3, "Animesh", 22, 0);
        // l1.Display();
        // l1.DeleteByRollNo(2);
        // l1.Display();
        // l1.SearchByRollNo(2);
        l1.addAtPos(5, "Shubh Pandit", 20, 10, 2);
        l1.Display();
        System.out.println();
        System.out.println("After Update Operation");
        l1.UpdateByRollNo(6, "himanshu", 21, 10,5 );
        l1.Display();

    }
}
