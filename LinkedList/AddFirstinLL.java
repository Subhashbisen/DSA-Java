package LinkedList;

public class AddFirstinLL {
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

    public static void AddFirst(int data) {
        // * step 1) Create New Node
        Node newNode = new Node(data);
        size++;

        if (head == null) {
            head = tail = newNode;
            return;
        }

        // * step 2) newNode next = head
        newNode.next = head; // * link

        // * head = newNode
        head = newNode;
    }

    public static void AddMiddle(int idx, int data) {

        if (idx == 0) {
            AddFirst(data);
            return;
        }

        Node newNode = new Node(data);
        size++;

        Node temp = head;
        int i = 0;

        while (i < idx - 1) {
            temp = temp.next;
            i++;
        }

        newNode.next = temp.next;
        temp.next = newNode;
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

    public static void removeFirst() {
        // Check if list is empty
        if (head == null) {
            return; // nothing to delete
        }

        // Check if only one node is present
        if (head.next == null) {
            // make list empty by resetting both head and tail
            head = tail = null;
        } else {
            // move head to next node (removes first node)
            head = head.next;
        }

        // decrease size of linked list
        size--;
    }

    public static void removeLast() {
        // Remove last node
        if (head == null) {
            return; // empty list
        }

        if (head.next == null) {
            // only one node
            head = tail = null;
        } else {
            // find second last node
            Node temp = head;
            while (temp.next != tail) {
                temp = temp.next;
            }

            // remove last node
            temp.next = null;
            tail = temp;
        }

        // decrease size
        size--;
    }

    public static void main(String[] args) {
        AddFirst(40);
        AddFirst(50);
        AddFirst(60);
        System.out.println("before last node remove");
        PrintLinkedList();
        // AddMiddle(1, 90);
        // removeFirst();
        System.out.println("after last node remove");
        removeLast();
        PrintLinkedList();
        System.out.println(size);
    }
}
