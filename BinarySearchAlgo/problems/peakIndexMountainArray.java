package problems;

public class peakIndexMountainArray {
    public static int peakIndexInMountainArray(int nums[]) {
        int left = 0;
        int right = nums.length - 1;

        while (left < right) {
            int mid = left + (right - left) / 2;

            if (nums[mid] < nums[mid + 1]) {
                // We are in the increasing part
                left = mid + 1;
            } else {
                // We are in the decreasing part (or at peak)
                right = mid;
            }
        }
        return left;
    }

    public static void main(String[] args) {
        int nums[] = { 1, 10, 8, 6, 4 };
        System.out.println(peakIndexInMountainArray(nums));
    }
}
