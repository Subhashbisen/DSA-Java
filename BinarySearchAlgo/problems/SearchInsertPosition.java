package problems;

public class SearchInsertPosition {
    public static int SearchInsertPosition(int nums[], int target) {
        int low = 0;
        int high = nums.length - 1;

        while (low <= high) {
            int mid = low + (high - low) / 2;

            if (nums[mid] == target) {
                return mid;
            } else if (nums[mid] > target) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }

        return low;

    }

    public static void main(String[] args) {
        int nums[] = { 1, 3, 5, 6 };
        int target = 0;

        System.out.println(SearchInsertPosition(nums, target));
    }
}
