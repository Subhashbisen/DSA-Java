package LinkedList;

public class LinkedList {

    // Node class jo Linked List ka ek element represent karta hai
    public static class Node {
        int data; // data store karega
        Node next; // next node ka reference store karega

        // Constructor node create karne ke liye
        Node(int data) {
            this.data = data; // node me data assign kar rahe hain
            this.next = null; // default me next null hoga
        }
    }

    public static void main(String[] args) {

        // 3 nodes create kar rahe hain
        Node first = new Node(10);
        Node second = new Node(20);
        Node third = new Node(30);

        // nodes ko connect kar rahe hain
        first.next = second; // first node ka next second node
        second.next = third; // second node ka next third node

        // traversal ke liye temporary pointer
        Node temp = first;

        // jab tak node null nahi hota tab tak loop chalega
        while (temp != null) {

            // current node ka data print karo
            System.out.print(temp.data + "-->");

            // next node par move karo
            temp = temp.next;
        }

    }
}