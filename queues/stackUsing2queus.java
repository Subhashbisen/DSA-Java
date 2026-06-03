package queues;

import java.util.*;

public class stackUsing2queus {
    static class stack {
        static Queue<Integer> q1 = new LinkedList<>();
        static Queue<Integer> q2 = new LinkedList<>();

        public static boolean isEmpty() {
            return q1.isEmpty();
        }

        // * Add
        public static void add(int data) {
            q2.add(data);

            while (!q1.isEmpty()) {
                q2.add(q1.remove());
            }

            Queue<Integer> temp = q1;
            q1 = q2;
            q2 = temp;
        }

        // * remove
        public static int pop() {
            if (q1.isEmpty()) {
                System.out.println("Stack is empty");
                return -1;
            }

            return q1.remove();
        }

        // * peek
        public static int peek() {
            if (q1.isEmpty())
                return -1;
            return q1.peek();
        }
    }

    public static void main(String[] args) {
        stack s = new stack();
        s.add(1);
        s.add(2);
        s.add(3);

        while (!s.isEmpty()) {
            System.out.println(s.peek());
            s.pop();
        }
    }
}
