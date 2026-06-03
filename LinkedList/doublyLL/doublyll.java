package LinkedList.doublyLL;

public class doublyll {
    public static class Node {
        int data;
        Node prev;
        Node next;

        Node(int data) {
            this.data = data;
            this.prev = null;
            this.next = null;
        }
    }

    public static Node head;
    public static Node tail;

    // Add first
    public static void AddFirst(int data) {
        Node newNode = new Node(data);

        if (head == null) {
            head = tail = newNode;
            return;
        }

        head.prev = newNode;
        newNode.next = head;
        head = newNode;
    }

    // Add last
    public static void Addlast(int data) {
        Node newNode = new Node(data);

        if (head == null) {
            head = tail = newNode;
            return;
        }

        Node temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }

        temp.next = newNode;
        newNode.prev = temp;
    }

    // delete from first
    public static void deleteFirst() {
        if (head == null)
            return;

        head = head.next;

        if (head != null) {
            head.prev = null;
        }
    }

    // delete last
    public static void deleteAtEnd() {
        if (head == null)
            return;

        // single node case
        if (head.next == null) {
            head = null;
            return;
        }

        Node temp = head;

        // last node tak jao
        while (temp.next != null) {
            temp = temp.next;
        }

        // last ke previous node ka next null karo
        temp.prev.next = null;
    }

    public static void PrintLinkedList() {
        if (head == null) {
            System.out.println("LinkedList Is Empty");
        }

        Node temp = head;

        while (temp != null) {
            System.out.print(temp.data + " <-> ");
            temp = temp.next;
        }

        System.out.println("null");
    }

    public static void main(String[] args) {
        AddFirst(7);
        AddFirst(8);
        AddFirst(9);
        deleteAtEnd();
        PrintLinkedList();
    }
}
