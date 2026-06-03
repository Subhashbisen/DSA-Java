package LinkedList.problems;

public class findKey {
    public static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public static Node head;
    public static Node tail;
    public static int size;

    public static void AddFirst(int data) {
        // * step 1) Create New Node
        Node newNode = new Node(data);
        size++;

        if (head == null) {
            head = tail = newNode;
            return;
        }

        // * step 2) newNode next = head
        newNode.next = head; // * link

        // * head = newNode
        head = newNode;
    }

    public static int findKey(int key) {
        if (head == null) {
            return -1;
        }

        Node temp = head;
        int index = 0;

        while (temp != null) {
            if (temp.data == key) {
                return index;
            }

            temp = temp.next;
            index++;
        }

        return -1;
    }

    public static int recursiveFind(int key, Node node, int i) {
        // base case
        if (node == null) {
            return -1;
        }

        if (node.data == key) {
            return i;
        }

        return recursiveFind(key, node.next, i + 1);
    };

    public static void PrintLinkedList() {
        if (head == null) {
            System.out.println("LinkedList Is Empty");
        }

        Node temp = head;

        while (temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }

        System.out.println("null");
    }

    public static void main(String[] args) {
        AddFirst(10);
        AddFirst(20);
        AddFirst(30);
        AddFirst(40);

        int key = 10;
        System.out.println(findKey(key));
        // System.out.println(recursiveFind(key, head, 0));
        PrintLinkedList();
        System.out.println("Lenth is " + size);
    }

}

public boolean searchKey(Node head, int key) {
        // Base case
        if(head == null) {
            return false;
        }
        
        // work comparing the valuet with key
        if(head.data == key){
            return true;
        }
        
        // recursive call
        return searchKey(head.next , key);
    }