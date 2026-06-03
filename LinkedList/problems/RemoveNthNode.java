package LinkedList.problems;

public class RemoveNthNode {
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

    public static void RemoveNthNode(Node head ,int n) {
        int size = 0;
        Node temp = head;

        while (temp != null) {
            size++;
            temp = temp.next;
        }

        if (n == size) {
            head = head.next;
            return;
        }

        int i = 1;
        int itofind = size - n;
        Node prev = head;

        while (i < itofind) {
            prev = prev.next;
            i++;
        }

        prev.next = prev.next.next;
        return;
    }

    // public static Node RemoveNthNode(Node head, int n) {
    // Node dummy = new Node(0);
    // dummy.next = head;

    // Node slow = dummy;
    // Node fast = dummy;

    // for (int i = 0; i < n; i++) {
    // fast = fast.next;
    // }

    // while (fast.next != null) {
    // slow = slow.next;
    // fast = fast.next;
    // }

    // slow.next = slow.next.next;

    // return dummy.next;
    // }

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
        AddFirst(5);
        AddFirst(4);
        AddFirst(3);
        AddFirst(2);
        AddFirst(1);
        PrintLinkedList();
        int n = 2;
        RemoveNthNode(head, n);
        PrintLinkedList();
    }
}
