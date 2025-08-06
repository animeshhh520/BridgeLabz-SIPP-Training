public class LinkedList<T> {
    Node<T> head;
    Node<T> tail;

    public class Node<T> {
        T data;
        Node<T> next;

        Node(T data) {
            this.data = data;
        }
    }

    public void add(T data) {
        Node<T> n = new Node<>(data);
        if (head == null) {
            head = tail = n;
        } else {
            tail.next = n;
            tail = n;
        }
    }

    public void display() {
        Node<T> temp = head;
        while (temp != null) {
            System.out.print(temp.data + "->");
            temp = temp.next;
        }
    }

    public void addFirst(T data) {
        Node<T> n = new Node<>(data);
        if (head == null) {
            head = tail = n;
        } else {
            n.next = head;
            head = n;
        }
    }

    public static void main(String[] args) {
        LinkedList<Integer> l1 = new LinkedList<>();
        l1.add(1);
        l1.add(2);
        l1.add(3);
        l1.display();
    }
}
