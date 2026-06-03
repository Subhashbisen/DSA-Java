import java.util.*;

public class twoSum {

    public static int[] twoSum(int nums[], int target) {
        int i = 0;
        int j = nums.length - 1;

        Arrays.sort(nums);

        while (i < j) {
            if (nums[i] + nums[j] > target) {
                j--;
            } else if (nums[i] + nums[j] < target) {
                i++;
            } else {
                return new int[] { i, j };
            }
        }

        return new int[] { -1, -1 };
    };

    public static void main(String[] args) {
        int nums[] = { 2, 7, 11, 15 };
        int target = 9;
    }
}
