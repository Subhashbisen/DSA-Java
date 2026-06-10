// 61. Rotate List leetcode

package LinkedList.problems;

public class rotateList {
    public static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public static Node head;

    public static Node rotateRight(Node head, int k) {
        if (head == null || head.next == null) {
            return head;
        }

        int size = 0;
        Node temp = head;
        Node tail = null;

        while (temp != null) {
            size++;
            tail = temp;
            temp = temp.next;
        }

        k = k % size;

        if (k == 0) {
            return head;
        }

        Node prev = null;
        Node curr = head;

        for (int i = 1; i < size - k + 1; i++) {
            prev = curr;
            curr = curr.next;
        }

        tail.next = head;
        prev.next = null;

        return curr;
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
        int k = 10;
        Node newhead = rotateRight(head, k);
        printLinkedList(newhead);
    }
}
