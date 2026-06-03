// * leetcode q 2824 Count Pairs Whose Sum is Less than Target

import java.util.*;

public class PairsLessTarget {

    public static int PairsLessTarget(int nums[], int target) {
        int i = 0;
        int j = nums.length - 1;
        int count = 0;

        Arrays.sort(nums);

        while (i < j) {
            if (nums[i] + nums[j] < target) {
                count += (j - i);
                i++;
            } else {
                j--;
            }
        }

        return count;
    };

    public static void main(String[] args) {
        int nums[] = { -6, 2, 5, -2, -7, -1, 3 };
        int target = -2;
        System.out.println(PairsLessTarget(nums, target));
    };
}
