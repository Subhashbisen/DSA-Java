package LinkedList.problems;

public class DeleteLLNodes {

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

    public static ListNode DeleteLLNodes(int nums[], ListNode head) {
        if (head == null || head.next == null) {
            return head;
        }

        ListNode dummy = new ListNode(-1);
        dummy.next = head;

        ListNode prev = dummy;
        ListNode curr = head;

        boolean isvalPresent = false;
        while (curr != null) {
            for (int i = 0; i < nums.length; i++) {
                if (curr.val == nums[i]) {
                    // prev.next = curr.next;
                    // curr = curr.next;
                    isvalPresent = true;
                    break;
                }
            }

            if (isvalPresent == true) {
                prev.next = curr.next;
                curr = curr.next;
                isvalPresent = false;
            } else {
                prev = curr;
                curr = curr.next;
            }
        }

        return dummy.next;
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
        head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(4);
        head.next.next.next.next = new ListNode(5);
        System.out.println(head.val + " data " + head.next + " next ");
        int nums[] = { 1, 2, 3 };
        head = DeleteLLNodes(nums, head);
        printLinkedList();
    }
}
