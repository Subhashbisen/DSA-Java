package greedyAlgorithm.problems;

import java.util.*;

public class MinimumnumberofCoins {
    public static void minCoins(Integer coins[], int n) {
        // sort by decending order
        Arrays.sort(coins, Comparator.reverseOrder());

        int countCoins = 0;
        int amount = n;
        ArrayList<Integer> ans = new ArrayList<>();

        for (int i = 0; i < coins.length; i++) {
            if (coins[i] <= amount) {
                while (coins[i] <= amount) {
                    countCoins++;
                    ans.add(coins[i]);
                    amount -= coins[i];
                }
            }
        }

        System.out.println("total (Min) coins used = " + countCoins);

        System.out.println(ans);
    }

    public static void main(String[] args) {
        Integer coins[] = { 1, 2, 5, 10 };
        int n = 121;
        minCoins(coins, n);
    }
}
