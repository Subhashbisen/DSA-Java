package LinkedList.problems;

public class reverseLinkedList2 {
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

    public static Node reverseLL2(Node head, int l, int r) {

        if (head == null || head.next == null) {
            return head;
        }

        Node dummy = new Node(0);
        dummy.next = head;

        Node temp = dummy;

        // left se ek position pehle tak jao
        for (int i = 1; i < l; i++) {
            temp = temp.next;
        }

        Node conn1 = temp; // left se pehle wali node
        Node prev = null;
        Node curr = temp.next; // left wali node
        Node conn2 = curr; // reverse ke baad tail banegi

        // reverse right-left+1 nodes
        for (int i = 0; i <= r - l; i++) {
            Node next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }

        // reconnect
        conn1.next = prev;
        conn2.next = curr;

        return dummy.next;
    }

    public static void printLinkedList(Node head) {
        if (head == null) {
            System.out.println("Linked List is Empty");
            return;
        }

        Node temp = head;

        while (temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }

        System.out.println("null");
    }

    public static void main(String[] args) {
        head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(3);
        head.next.next.next = new Node(4);
        head.next.next.next.next = new Node(5);
        // head.next.next.next.next.next = new Node(6);
        int l = 1, r = 3;
       Node newHead = reverseLL2(head, l, r);
        printLinkedList(newHead);
    }
}
