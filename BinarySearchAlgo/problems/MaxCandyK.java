package problems;

public class MaxCandyK {

    public static boolean helper(int candies[], int candys, int k) {
        long childrens = 0;

        for (int i = 0; i < candies.length; i++) {
            childrens += candies[i] / candys;
        }

        return childrens >= k;
    }

    public static int maximumCandies(int candies[], int k) {
        int low = 1;
        int high = 0;

        for (int i = 0; i < candies.length; i++) {
            high = Math.max(high, candies[i]);
        }

        int ans = 0;

        while (low <= high) {
            int mid = low + (high - low) / 2;

            if (helper(candies, mid, k)) {
                ans = mid;
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }

        return ans;
    }

    public static void main(String[] args) {
        int candies[] = { 5, 8, 6 };
        int k = 3;
        System.out.println(maximumCandies(candies, k));
    }
}
