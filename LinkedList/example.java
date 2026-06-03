package LinkedList;

import java.util.LinkedList;

public class example {
    public static class ListNode {
        int data;
        ListNode next;

        ListNode(int data) {
            this.data = data;
            this.next = null;
        }
    };

    public static ListNode head;
    public static ListNode tail;
    public static int size = 0;

    public static void addFirst(int data) {
        ListNode newNode = new ListNode(data);
        size++;

        if (head == null) {
            head = tail = newNode;
            return;
        }

        newNode.next = head;
        head = newNode;
    }

    public static void addLast(int data) {
        ListNode newNode = new ListNode(data);
        size++;

        if (head == null) {
            head = tail = newNode;
            return;
        }

        tail.next = newNode;
        tail = newNode;
    }

    public static void AddMiddle(int pos, int val) {
        ListNode newNode = new ListNode(val);
        size++;

        if (pos == 0) {
            newNode.next = head;
            head = newNode;
            return;
        }

        if (head == null) {
            head = tail = newNode;
            return;
        }

        ListNode temp = head;
        int i = 0;
        while (i < pos - 1) {
            temp = temp.next;
            i++;
        }

        newNode.next = temp.next;
        temp.next = newNode;
    }

    // Remove oparations
    public static void removeFirst() {
        if (head == null) {
            System.out.println("Linked List Is Empty");
            size--;
            return;
        }

        if (head.next == null) {
            head = tail = null;
            size--;
            return;
        }

        head = head.next;
        size--;
    }

    public static void removeLast() {
        if (head == null) {
            System.out.println("Linked List Is Empty");
            size--;
            return;
        }

        if (head.next == null) {
            head = tail = null;
            size--;
            return;
        }

        ListNode temp = head;

        while (temp.next.next != null) {
            temp = temp.next;
        }
        // remove last node
        temp.next = null;

    }

    public static void PrintLinkedList() {
        if (head == null) {
            System.out.println("LinkedList Is Empty");
            // return;
        }

        ListNode temp = head;

        while (temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }

        System.out.println("null");
    }

    public static void main(String[] args) {
        addFirst(60);
        addFirst(50);
        addFirst(30);
        addFirst(20);
        addFirst(10);
        removeLast();
        // removeFirst();
        // int pos = 3;
        // int val = 40;
        // AddMiddle(pos, val);
        PrintLinkedList();
        System.out.println(size + " size");
        // 10->20->30->40->nulll
    }
}
