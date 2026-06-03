package LinkedList.problems;

public class oddEvenLL {
    public static class ListNode {
        int val;
        ListNode next;

        ListNode(int val) {
            this.val = val;
            this.next = null;
        }
    }

    public static ListNode head;
    public static ListNode tail;
    public static int size;

    public static ListNode OddEvenll(ListNode head) {
        ListNode dummy = new ListNode(0);
        ListNode prev = dummy;

        // make Odd Linked List
        int i = 1;
        ListNode current = head;
        while (current != null) {
            if (i % 2 != 0) {
                prev.next = current;
                current = current.next;
                prev = prev.next;
            } else {
                current = current.next;
            }
            i++;
        }

        // for even linked List
        // current = head;
        // i = 1;
        // while (current != null) {
        // if (i % 2 == 0) {
        // prev.next = current;
        // current = current.next;
        // prev = prev.next;
        // } else {
        // current = current.next;
        // }
        // i++;
        // }

        return dummy.next;

    }

    public static void PrintLinkedList() {
        if (head == null) {
            System.out.println("LinkedList Is Empty");
        }

        ListNode temp = head;

        while (temp != null) {
            System.out.print(temp.val + " -> ");
            temp = temp.next;
        }

        System.out.println("null");
    }

    public static void main(String[] args) {
        head = new ListNode(2);
        head.next = new ListNode(1);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(5);
        head.next.next.next.next = new ListNode(6);
        head.next.next.next.next.next = new ListNode(4);
        head.next.next.next.next.next.next = new ListNode(7);
         OddEvenll(head);
        PrintLinkedList();
    }
}
