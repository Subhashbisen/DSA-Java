package greedyAlgorithm.problems;

import java.util.*;

public class maxBagsFullCapacity {
    public static int maxBagsFullCapacity(int capacity[], int rocks[], int additionalRocks) {
        int n = capacity.length;

        int need[] = new int[n];

        for (int i = 0; i < need.length; i++) {
            need[i] = capacity[i] - rocks[i];
        }

        Arrays.sort(need);

        int ans = 0;

        for (int i = 0; i < need.length; i++) {

            if (additionalRocks >= need[i]) {
                ans++;
                additionalRocks -= need[i];
            } else {
                break;
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        int capacity[] = { 2, 3, 4, 5 };
        int rocks[] = { 1, 2, 4, 4 };
        int additionalRocks = 2;
        System.out.println(maxBagsFullCapacity(capacity, rocks, additionalRocks));
    }
}
