package greedyAlgorithm.problems;

import java.util.*;

public class MaximumLengthofPairChain {
    public static int MaximumLengthofPairChain(int pairs[][]) {
        // Pairs ko sort karo by second element (b)
        Arrays.sort(pairs, Comparator.comparingDouble(o -> o[1]));

        int chainLength = 1;
        int chainEnd = pairs[0][1]; // lastEnd = first pair ka end

        for (int i = 1; i < pairs.length; i++) {
            if (pairs[i][0] > chainEnd) { // Agar current.start > lastEnd
                chainLength++; // include karo
                chainEnd = pairs[i][1]; // update lastEnd
            }
        }

        return chainLength;

    }

    public static void main(String[] args) {
        int pairs[][] = { { 5, 24 }, { 39, 60 }, { 5, 28 }, { 27, 40 }, { 50, 90 } };
        System.out.println(MaximumLengthofPairChain(pairs));
    }
}
