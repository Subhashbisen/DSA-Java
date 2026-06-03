package greedyAlgorithm.problems;

import java.util.*;

public class minimunSumAbsolutediff {
    public static int mindiff(int a[], int b[]) {
        // * sort both arrays
        Arrays.sort(a);
        Arrays.sort(b);

        int mindiff = 0;

        for (int i = 0; i < a.length; i++) {
            mindiff += Math.abs(a[i] - b[i]);
        }

        return mindiff;
    }

    public static void main(String[] args) {
        int a[] = { 4, 1, 8, 7 };
        int b[] = { 2, 3, 6, 5 };

        System.out.println(mindiff(a, b));
    }
}
