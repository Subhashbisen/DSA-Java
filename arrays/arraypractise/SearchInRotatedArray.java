package arraypractise;

public class SearchInRotatedArray {

    public static int SearchInRotatedArray(int nums[], int target) {
        int start = 0;
        int end = nums.length - 1;

        while (start <= end) {
            int mid = start + (end - start) / 2; // 3

            if (nums[mid] == target) {
                return mid;
            }

            if (nums[start] <= nums[mid]) {
                if (nums[start] <= target && nums[mid] > target) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            } else {
                if (nums[start] > target && nums[mid] <= target) {
                    start = mid + 1;
                } else {
                    end = mid - 1;
                }
            }
        }

        return -1;
    };

    public static void main(String[] args) {
        int nums[] = { 1,3 };
        int target = 3;
        System.out.println(SearchInRotatedArray(nums, target));
    }
}
