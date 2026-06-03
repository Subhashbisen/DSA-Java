package queues;

import java.util.*;

public class dequeue {
    public static void main(String[] args) {
        Deque<Integer> dq = new LinkedList<>();

        dq.addFirst(10); // [10]
        dq.addLast(20); // [10, 20]
        dq.addFirst(5); // [5, 10, 20]

        System.out.println(dq);

        dq.removeFirst(); // removes 5
        dq.removeLast(); // removes 20

        System.out.println(dq);
    }
}
