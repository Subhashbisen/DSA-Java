
package patterns.slowFastPointer;

public class removeCycleLL {
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

    public static void removeCycle(ListNode head) {

        // Step 1: Edge case
        if (head == null) {
            return;
        }

        ListNode slow = head;
        ListNode fast = head;
        boolean cycle = false;

        // Step 2: Detect cycle
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;

            if (slow == fast) {
                cycle = true;
                break;
            }
        }

        // Step 3: No cycle
        if (cycle == false) {
            return;
        }

        // Step 4: Find start of cycle
        slow = head;
        ListNode prev = null; // last node before cycle start

        while (slow != fast) {
            prev = fast; // track last node
            slow = slow.next;
            fast = fast.next;
        }

        // Step 5: Break the cycle
        prev.next = null;
    }

    public static void main(String[] args) {
        head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(4);

        // cycle bana rahe hain (4 -> 2)
        head.next.next.next.next = head.next;

        removeCycle(head);
        PrintLinkedList();

    }
}