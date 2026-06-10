// 25. Reverse Nodes in k-Group
package LinkedList.problems;

public class reverseNodeskgroup {
    public static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public static Node head;

    public static Node reverse(Node groupStart, Node groupEnd) {
        Node nextGroupHead = groupEnd.next;
        Node prev = nextGroupHead;
        Node curr = groupStart;

        while (curr != nextGroupHead) {
            Node next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }

        return groupEnd;
    }

    public static Node reverseKgroup(Node head, int k) {
        if (head == null || head.next == null) {
            return head;
        }

        Node newHead = null;
        Node curr = head;
        Node previous = null;

        while (curr != null) {
            Node groupStart = curr;
            Node groupEnd = curr;

            int count = 1;
            while (count < k && groupEnd != null) {
                groupEnd = groupEnd.next;
                count++;
            }

            if (groupEnd == null) {
                break;
            }

            Node nextGroupStart = groupEnd.next;

            if (count == k) {
                reverse(groupStart, groupEnd);

                if (previous == null) {
                    newHead = groupEnd;
                } else {
                    previous.next = groupEnd;
                }

                previous = groupStart;
            } else {
                previous.next = groupStart;
            }

            curr = nextGroupStart;
        }

        return (newHead == null) ? head : newHead;
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
        int k = 2;
        Node newHead = reverseKgroup(head, k);
        printLinkedList(newHead);
    }
}