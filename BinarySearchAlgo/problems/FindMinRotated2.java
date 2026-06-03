package problems;

public class FindMinRotated2 {
    public static int FindMinRotated2(int nums[]) {

        int low = 0;
        int high = nums.length - 1;

        while (low < high) {

            int mid = low + (high - low) / 2;

            if (nums[mid] > nums[high]) {
                low = mid + 1;

            } else if (nums[mid] < nums[high]) {
                high = mid;

            } else {
                high--;
            }
        }

        return nums[low];
    }

    public static void main(String[] args) {
        int nums[] = { 3, 4, 5, 1, 2 };
        System.out.println(FindMinRotated2(nums));
    }
}
