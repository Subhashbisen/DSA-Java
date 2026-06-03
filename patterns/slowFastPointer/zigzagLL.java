package patterns.slowFastPointer;

public class zigzagLL {
    public static class ListNode {
        int data;
        ListNode next;

        ListNode(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public static ListNode head;
    public static ListNode tail;

    public static ListNode getmid(ListNode head) {
        ListNode slow = head;
        ListNode fast = head.next;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }

        return slow;
    }

    public static void zigzagLL(ListNode head) {
        if (head == null || head.next == null) {
            return;
        }

        ListNode mid = getmid(head);

        ListNode left = head;
        ListNode right = mid.next;
        mid.next = null;

        ListNode prev = null;
        ListNode curr = right;
        ListNode next;

        while (curr != null) {
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }

        ListNode lefthead = head;
        ListNode righthead = prev;
        ListNode nextL;
        ListNode nextR;

        while (lefthead != null && righthead != null) {
            nextL = lefthead.next;
            lefthead.next = righthead;
            nextR = righthead.next;
            righthead.next = nextL;

            lefthead = nextL;
            righthead = nextR;
        }

    }

    public static void PrintLinkedList() {
        if (head == null) {
            System.out.println("LinkedList Is Empty");
        }

        ListNode temp = head;

        while (temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }

        System.out.println("null");
    }

    public static void main(String[] args) {
        head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(4);
        head.next.next.next.next = new ListNode(5);
        head.next.next.next.next.next = new ListNode(6);
        PrintLinkedList();
        zigzagLL(head);
        PrintLinkedList();
    }
}
