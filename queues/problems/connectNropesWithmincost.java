package queues.problems;

import java.util.*;

public class connectNropesWithmincost {
    public static int minCost(int ropes[]) {
        if (ropes == null || ropes.length <= 1) {
            return 0;
        } 
        
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        int cost = 0;

        // * Step 1: add all ropes
        for (int i = 0; i < ropes.length; i++) {
            pq.add(ropes[i]);
        }

        // * Step 2: process till one rope remains
        while (pq.size() > 1) {
            int first = pq.poll();
            int second = pq.poll();

            int sum = first + second;

            cost += sum;

            pq.add(sum);
        }

        return cost;
    }

    public static void main(String[] args) {
        int ropes[] = { 4, 3, 2, 6 };
        System.out.println(minCost(ropes));
    }
}
