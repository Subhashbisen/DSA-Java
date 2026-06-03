package greedyAlgorithm.problems;

import java.util.*;
import java.util.ArrayList;

public class KthLargestOdd {
    public static int KthLargestOdd(int L, int R, int K) {
        ArrayList<Integer> list = new ArrayList<>();

        for (int i = R; i >= L; i--) {
            if (i % 2 != 0) {
                list.add(i);
            }
        }

        if (K > list.size()) {
            return -1;
        }
        return list.get(K - 1);

    }

    public static void main(String[] args) {
        int L = 6, R = 18, K = 4;
        // System.out.println(KthLargestOdd(L, R, K));
        System.out.println((int) 'a');
    }
}
