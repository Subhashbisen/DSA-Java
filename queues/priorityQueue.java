package queues;

import java.util.*;

public class priorityQueue {
    public static void main(String[] args) {
        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
        pq.add(10);
        pq.add(5);
        pq.add(20);

        System.out.println(pq.peek()); // 5 (smallest)
    }
}
