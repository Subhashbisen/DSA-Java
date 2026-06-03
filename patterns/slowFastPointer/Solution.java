package patterns.slowFastPointer;

public class detectCycleLL {
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

    public static boolean hasCycle(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;

        if (head == null) {
            return false;
        }

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;

            if (slow == fast) {
                return true;
            }
        }

        return false;
    }

    public static void main(String[] args) {
        head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(4);

        // cycle bana rahe hain (4 -> 2)
        head.next.next.next.next = head.next;

        System.out.println("Cycle present? " + hasCycle(head));

    }
}

public class Solution {
    public ListNode detectCycle(ListNode head) {

        if (head == null)
            return null;

        ListNode slow = head;
        ListNode fast = head;

        // Step 1: Detect cycle
        while (fast != null && fast.next != null) {
            slow = slow.next; // 1 step
            fast = fast.next.next; // 2 step

            // Cycle detected
            if (slow == fast) {

                // Step 2: Move slow to head
                slow = head;

                // Step 3: Move both 1 step
                while (slow != fast) {
                    slow = slow.next;
                    fast = fast.next;
                }

                // Meeting point is cycle start
                return slow;
            }
        }

        // No cycle
        return null;
    }
}