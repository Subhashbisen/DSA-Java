package queues;

public class queueUsingLinkedList {
    static class ListNode {
        int data;
        ListNode next;

        ListNode(int data) {
            this.data = data;
            this.next = null;
        }
    }

    static class Queue {
        public static ListNode head = null;
        public static ListNode tail = null;

        public static boolean isEmpty() {
            return head == null && tail == null;
        }

        // * Add
        public static void add(int data) {
            ListNode newNode = new ListNode(data);

            if (head == null) {
                head = tail = newNode;
                return;
            }

            tail.next = newNode;
            tail = newNode;
        }

        // * Remove
        public static int remove() {
            if (isEmpty()) {
                System.out.println("Empty Queue");
                return -1;
            }

            int front = head.data;
            // * Single Element
            if (tail == head) {
                head = tail = null;
            } else {
                head = head.next;
            }
            return front;
        }


        // * peek
        public static int peek() {
            if (isEmpty()) {
                System.out.println("Empty Queue");
                return -1;
            }

            return head.data;
        }
    }

    public static void main(String[] args) {
        Queue q = new Queue();
        q.add(1);
        q.add(2);
        q.add(3);

        while (!q.isEmpty()) {
            System.out.println(q.peek());
            q.remove();
        }
    }
}
