package greedyAlgorithm.problems;

import java.util.*;

public class JobSequencingProblem {
    public static ArrayList jobSequencing(int jobsInfo[][]) {
        // * sort array by bases of profit decending
        Arrays.sort(jobsInfo, (a, b) -> b[1] - a[1]);

        ArrayList<Integer> list = new ArrayList<>();

        int time = 0;
        int count = 0;
        int profit = 0;

        for (int i = 0; i < jobsInfo.length; i++) {
            // jobsInfo[i][0] = deadline
            // jobsInfo[i][1] = profit

            if (jobsInfo[i][0] > time) {
                time++;
                count++;
                profit += jobsInfo[i][1];
            }
        }

        // Add count and profit
        list.add(count);
        list.add(profit);
        return list;
    }

    public static void main(String[] args) {
        int jobsInfo[][] = { { 3, 50 }, { 1, 10 }, { 2, 20 }, { 2, 30 } };
        ArrayList<Integer> ans = jobSequencing(jobsInfo);

        System.out.println("Jobs Done = " + ans.get(0));
        System.out.println("Total Profit = " + ans.get(1));

    }
}
