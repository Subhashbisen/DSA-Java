package queues.problems;

import java.util.*;

public class JobSequencingProblem {
    public static ArrayList maxProfit(int deadline[], int profit[], int n) {
        ArrayList<Integer> result = new ArrayList<>();

        // * step 1 combine into jobs(deadline, profit)
        int jobs[][] = new int[n][2];
        for (int i = 0; i < n; i++) {
            jobs[i][0] = deadline[i];
            jobs[i][1] = profit[i];

        }

        // * Step 2: sort by deadline
        Arrays.sort(jobs, (a, b) -> a[0] - b[0]);

        // * Step 3: min-heap (store profits)
        PriorityQueue<Integer> pq = new PriorityQueue<>();

        // * Step 4: process jobs
        for (int i = 0; i < n; i++) {
            pq.add(jobs[i][1]); // * add profit

            // *if jobs exceed allowed slots
            if (pq.size() > jobs[i][0]) {
                pq.poll(); // * remove smallest profit
            }
        }

        // * Step 5: sum remaining profits
        int total = 0;
        int count = 0;

        while (!pq.isEmpty()) {
            total += pq.poll();
            count++;
        }

        result.add(count);
        result.add(total);
        return result;
    }

    public static void main(String[] args) {
        int deadline[] = { 3, 1, 2, 2 };
        int profit[] = { 50, 10, 20, 30 };
        int n = deadline.length;
        System.out.println(maxProfit(deadline, profit, n));
    }
}
