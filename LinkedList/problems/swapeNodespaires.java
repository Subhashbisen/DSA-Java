package LinkedList.problems;

public class swapeNodespaires {
    public static class Node {
        int val;
        Node next;

        Node(int val) {
            this.val = val;
            this.next = null;
        }
    }

    public static Node head;

    public static Node swapPairs(Node head) {
        if (head == null || head.next == null) {
            return head;
        }

        // Naya head pehle hi save kar liya
        Node newHead = head.next;
        Node previous = null;
        Node current = head;

        while (current != null && current.next != null) {
            Node first = current;
            Node second = current.next;
            Node nextPair = second.next;

            // pair swap
            second.next = first;
            first.next = null;

            // Previous pair ko connect karo
            if (previous != null) {
                previous.next = second;
            }

            // Current swapped pair ka end node
            previous = first;

            // Next pair par jao
            current = nextPair;
        }

        // Agar odd length hai to last node connect karo
        if (current != null) {
            previous.next = current;
        }

        return newHead;

    }

    public static void printLinkedList(Node head) {
        if (head == null) {
            System.out.println("Linked List is Empty");
            return;
        }

        Node temp = head;

        while (temp != null) {
            System.out.print(temp.val + " -> ");
            temp = temp.next;
        }
    }

    public static void main(String[] args) {
        head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(3);
        head.next.next.next = new Node(4);
        Node newHead = swapPairs(head);
        printLinkedList(newHead);
    }
}
