package queues;

import java.util.*;

class QueueUsingDeque {
    static class Queue {
        Deque<Integer> dq = new LinkedList<>();

        // Enqueue
        public void add(int data) {
            dq.addLast(data);
        }

        // Dequeue
        public int remove() {
            return dq.removeFirst();
        }

        // Front element
        public int peek() {
            return dq.peekFirst();
        }

        // Check empty
        public boolean isEmpty() {
            return dq.isEmpty();
        }
    }

    public static void main(String[] args) {
        Queue q = new Queue();

        q.add(1);
        q.add(2);
        q.add(3);

        System.out.println("Peek = " + q.peek()); // 10
        System.out.println(q.remove()); // 1
        System.out.println(q.remove()); // 2
        System.out.println(q.remove()); // 3

    }
}