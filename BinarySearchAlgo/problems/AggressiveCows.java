package problems;

import java.util.*;

public class AggressiveCows {
    public static boolean helper(int stalls[], int minDist, int cows) {
        int cow = 1;
        int lastPos = stalls[0];

        for (int i = 1; i < stalls.length; i++) {
            int dist = stalls[i] - lastPos;

            if (dist >= minDist) {
                cow++;
                lastPos = stalls[i];
            }
        }

        if (cow >= cows) {
            return true;
        }

        return false;
    }

    public static int aggressiveCows(int stalls[], int k) {
        Arrays.sort(stalls);
        int left = 1;
        int right = stalls[stalls.length - 1] - stalls[0];
        int answer = 0;

        while (left <= right) {
            int mid = left + (right - left) / 2;

            if (helper(stalls, mid, k)) {
                answer = mid;
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        int stalls[] = { 10, 1, 2, 7, 5 };
        int k = 3;
        System.out.println(aggressiveCows(stalls, k));
    }
}
