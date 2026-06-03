package arraypractise;

public class TwoSumII {

    public static void TwoSumII(int nums[], int target) {
        int left = 0;
        int right = nums.length - 1;

        while (left < right) {
            int sum = nums[left] + nums[right];

            if (sum == target) {
                System.out.println("(" + left + " " + right + ")");
            } else if (sum < target) {
                left++;
            } else {
                right--;
            }
        }

    }

    public static void main(String[] args) {
        int nums[] = { 2,3,4 };
        int target = 6;
        TwoSumII(nums, target);
    }
}