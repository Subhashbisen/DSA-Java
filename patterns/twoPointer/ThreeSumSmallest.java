package patterns.twoPointer;

import java.util.*;

public class ThreeSumSmallest {

    public static int ThreeSumSmallest(int nums[], int target) {
        Arrays.sort(nums);

        int ans = 0;

        for (int i = 0; i < nums.length - 2; i++) {
            int left = i + 1;
            int right = nums.length - 1;

            while (left < right) {
                int sum = nums[i] + nums[left] + nums[right];

                if (sum >= target) {
                    right--;
                } else {
                    ans = ans + (right - left);
                    left++;
                }
            }
        }

        return ans;
    };

    public static void main(String[] args) {
        int nums[] = { 5, 1, 3, 4, 7 };
        int target = 12;
        System.out.println(ThreeSumSmallest(nums, target));
    }
}