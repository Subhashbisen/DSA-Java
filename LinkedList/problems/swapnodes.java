package LinkedList.problems;

public class swapnodes {

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

    public static void swapNodes(ListNode head, int k) {
        if (head == null) {
            return;
        }

        // calculate Size
        int size = 0;
        ListNode temp = head;
        while (temp != null) {
            temp = temp.next;
            size++;
        }

        if (k > size)
            return; // safety

        // Step 2: find kth from start
        ListNode first = head;
        for (int i = 1; i < k; i++) {
            first = first.next;
        }

        // Step 3: find kth from end
        ListNode second = head;
        for (int i = 1; i < size - k + 1; i++) {
            second = second.next;
        }

        // Step 4: swap values
        int tempVal = first.val;
        first.val = second.val;
        second.val = tempVal;

    }

    public static void printLinkedList() {
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
        head = new ListNode(7);
        head.next = new ListNode(9);
        head.next.next = new ListNode(6);
        head.next.next.next = new ListNode(6);
        head.next.next.next.next = new ListNode(7);
        head.next.next.next.next.next = new ListNode(8);
        head.next.next.next.next.next.next = new ListNode(3);
        head.next.next.next.next.next.next.next = new ListNode(0);
        head.next.next.next.next.next.next.next.next = new ListNode(9);
        head.next.next.next.next.next.next.next.next.next = new ListNode(5);
        int k = 5;
        swapNodes(head, k);
        printLinkedList();
    }
}