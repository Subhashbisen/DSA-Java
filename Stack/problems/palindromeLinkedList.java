package problems;

import java.util.*;

public class palindromeLinkedList {
    public static class ListNode {
        int val;
        ListNode next;

        ListNode(int data) {
            this.val = data;
            this.next = null;
        }
    }

    public static ListNode head;
    public static ListNode tail;

    public static boolean isPalindrome(ListNode head) {
        Stack<Integer> s = new Stack<>();

        if (head == null || head.next == null) {
            return true;
        }

        ListNode temp = head;

        // Step 1: push all elements
        while (temp != null) {
            s.push(temp.val);
            temp = temp.next;
        }

        // Step 2: reset temp
        temp = head;

        // Step 3: compare
        while (temp != null) {
            if (temp.val == s.peek()) {
                s.pop();
            } else {
                return false;
            }

            temp = temp.next;
        }

        return true;
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
        head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(1);
        System.out.println(isPalindrome(head));
        // PrintLinkedList();
    }
}
