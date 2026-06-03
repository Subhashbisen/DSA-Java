package problems;

public class KthRotation {
    public static int KthRotation(int nums[]) {
        int left = 0;
        int right = nums.length - 1;

        if (nums[left] <= nums[right]) {
            return left;
        }

        while (left < right) {
            int mid = left + (right - left) / 2;

            if (nums[mid] > nums[right]) {
                left = mid + 1;
            } else {
                right = mid;
            }
        }

        return left;
    }

    public static void main(String[] args) {
        int nums[] = { 32, 18, 26, 30 };
        System.out.println(KthRotation(nums));
    }
}
