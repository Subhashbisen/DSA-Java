package greedyAlgorithm.problems;

public class SplitArrayLargestSum {
    public static int splitArray(int[] nums, int k) {
        int n = nums.length;
        int maxRange = 0;
        int minRange = 0;

        for (int i = 0; i < n; i++) {
            minRange = Math.max(minRange, nums[i]);
            maxRange += nums[i];
        }

        int low = minRange;
        int high = maxRange;
        int ans = -1;

        while (low <= high) {
            int mid = low + (high - low) / 2;

            if (helper(nums, mid, k)) {
                ans = mid;
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }

        return ans;

    }

    public static boolean helper(int nums[], int target, int k) {
        int val = 0;
        int count = 1;

        for (int i = 0; i < nums.length; i++) {
            val += nums[i];

            if (val > target) {
                count++;
                val = nums[i];
            }
        }

        return count <= k;
    }

    public static void main(String[] args) {
        int nums[] = { 7,2,5,10,8 };
        int k = 2;
        System.out.println(splitArray(nums, k));
    }
}
