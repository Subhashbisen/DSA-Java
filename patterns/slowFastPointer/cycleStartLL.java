package patterns.slowFastPointer;

public class cycleStartLL {
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

    public static ListNode cycleStart(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;

        if (head == null) {
            return head;
        }

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;

            if (slow == fast) {
                slow = head;

                while (slow != fast) {
                    slow = slow.next;
                    fast = fast.next;
                }

                return slow;
            }
        }

        return null;
    }

    public static void main(String[] args) {
        head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(4);

        // cycle bana rahe hain (4 -> 2)
        head.next.next.next.next = head.next;
        ListNode node = cycleStart(head);
        System.out.println(node.data);
    }
}
