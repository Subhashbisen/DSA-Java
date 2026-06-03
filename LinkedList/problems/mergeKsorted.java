package LinkedList.problems;

import java.util.*;

public class mergeKsorted {
    public static class ListNode {
        int val;
        ListNode next;

        ListNode(int val) {
            this.val = val;
            this.next = null;
        }
    }

    // 🔹 Build Linked List from Array
    public static ListNode buildLinkedList(int arr[]) {

        if (arr.length == 0)
            return null;

        ListNode head = new ListNode(arr[0]);
        ListNode temp = head;

        for (int i = 1; i < arr.length; i++) {
            temp.next = new ListNode(arr[i]);
            temp = temp.next;
        }

        return head;
    }

    public static ListNode divide(ListNode[] lists, int left, int right) {
        // Base Case
        if (left == right) {
            return lists[left];
        }

        // find mid
        int mid = left + (right - left) / 2;

        ListNode l1 = divide(lists, left, mid);
        ListNode l2 = divide(lists, mid + 1, right);

        return mergeTwoLists(l1, l2);
    }

    // 🔹 Merge K Sorted Lists
    public static ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        ListNode dummy = new ListNode(0);
        ListNode temp = dummy;

        while (l1 != null && l2 != null) {
            if (l1.val <= l2.val) {
                temp.next = l1;
                l1 = l1.next;
                temp = temp.next;
            } else {
                temp.next = l2;
                l2 = l2.next;
                temp = temp.next;
            }
        }

        while (l1 != null) {
            temp.next = l1;
            temp = temp.next;
            l1 = l1.next;
        }

        while (l2 != null) {
            temp.next = l2;
            temp = temp.next;
            l2 = l2.next;
        }

        return dummy.next;
    }

    public static ListNode mergeKLists(ListNode[] lists) {
        if (lists == null || lists.length == 0) {
            return null;
        }
        ;

        return divide(lists, 0, lists.length - 1);
    }

    // 🔹 Print Linked List
    public static void printList(ListNode head) {
        ListNode temp = head;
        while (temp != null) {
            System.out.print(temp.val + " -> ");
            temp = temp.next;
        }
        System.out.println("null");
    }

    public static void main(String[] args) {

        int[][] arr = {
                { 1, 4, 5 },
                { 1, 3, 4 },
                { 2, 6 }
        };

        // Convert to linked lists
        ListNode[] lists = new ListNode[arr.length];

        for (int i = 0; i < arr.length; i++) {
            lists[i] = buildLinkedList(arr[i]);
        }

        ListNode result = mergeKLists(lists);
        // Print result
        printList(result);
    }
}