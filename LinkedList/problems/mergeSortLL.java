package LinkedList.problems;

public class mergeSortLL {
    public static class Listnode {
        int data;
        Listnode next;

        Listnode(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public static Listnode head;
    public static Listnode tail;

    public static Listnode getMid(Listnode head) {
        Listnode slow = head;
        Listnode fast = head.next;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }

        return slow;
    }

    public static Listnode merge(Listnode left, Listnode right) {
        Listnode dummy = new Listnode(-1);
        Listnode temp = dummy;

        while (left != null && right != null) {
            if (left.data <= right.data) {
                temp.next = left;
                left = left.next;
                temp = temp.next;
            } else {
                temp.next = right;
                right = right.next;
                temp = temp.next;
            }
        }

        while (left != null) {
            temp.next = left;
            temp = temp.next;
            left = left.next;
        }

        while (right != null) {
            temp.next = right;
            temp = temp.next;
            right = right.next;
        }

        return dummy.next;
    }

    public static Listnode mergeSortLL(Listnode head) {
        if (head == null || head.next == null) {
            return head;
        }

        // get middleNode of Linked List
        Listnode mid = getMid(head);

        Listnode right = mid.next;
        mid.next = null;
        Listnode left = head;

        Listnode newLeft = mergeSortLL(left);
        Listnode newRight = mergeSortLL(right);

        return merge(newLeft, newRight);

    }

    public static void printLinkedList() {
        if (head == null) {
            System.out.println("LinkedList Is Empty");
        }

        Listnode temp = head;

        while (temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }

        System.out.println("null");
    }

    public static void main(String[] args) {
        head = new Listnode(9);
        head.next = new Listnode(5);
        head.next.next = new Listnode(7);
        head.next.next.next = new Listnode(4);
        head.next.next.next.next = new Listnode(0);
        printLinkedList();
        head = mergeSortLL(head);
        printLinkedList();
    }

}

 
