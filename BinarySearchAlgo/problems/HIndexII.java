package problems;

import java.util.*;

public class HIndexII {
    public static boolean helper(int citations[], int h) {
        int hIndex = 0;

        for (int i = 0; i < citations.length; i++) {
            if (citations[i] >= h) {
                hIndex++;
            }
        }

        return hIndex >= h;
    }

    public static int hIndex(int citations[]) {
        int left = 0;
        int right = citations.length;
        int answer = 0;

        while (left <= right) {
            int mid = left + (right - left) / 2;

            if (helper(citations, mid)) {
                answer = mid;
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        int citations[] = { 1, 2, 100 };
        System.out.println(hIndex(citations));
    }
}
