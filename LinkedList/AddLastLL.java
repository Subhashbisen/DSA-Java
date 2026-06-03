package LinkedList;

public class AddLastLL {
    public static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;

        }
    }

    public static Node head;
    public static Node tail;
    public static int size;

    public static void AddLast(int data) {
        // * New node create karo (newNode)
        Node newNode = new Node(data);
        size++;

        // * agar list empty hai
        if (head == null) {
            head = tail = newNode;
            return;
        }

        // * previous tail.next = newNode ( tail.next = newNode)
        tail.next = newNode;

        // * tail ko new node bana do ( tail = newNode)
        tail = newNode;
    }

    public static void PrintLinkedList() {
        if (head == null) {
            System.out.println("LinkedList Is Empty");
        }

        Node temp = head;

        while (temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }

        System.out.println("null");
    }

    public static void main(String[] args) {
        AddLast(20);
        AddLast(30);
        AddLast(40);
        AddLast(50);
        PrintLinkedList();
    }
}
