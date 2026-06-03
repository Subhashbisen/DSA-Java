package DivideAndconquer;

public class SearchRotated {

    public static int search(int nums[], int target, int start, int end) {
        // Base Case
        if (start > end) {
            return -1;
        }

        // work
        int mid = start + (end - start) / 2;

        // Check if target == mid
        if (nums[mid] == target) {
            return mid;
        }

        if (nums[start] <= nums[mid]) {
            if (nums[start] <= target && target < nums[mid]) {
                return search(nums, target, start, mid - 1);
            } else {
                return search(nums, target, mid + 1, end);
            }
        } else {
            if (nums[mid] < target && target <= nums[end]) {
                return search(nums, target, mid + 1, end);
            } else {
                return search(nums, target, start, mid - 1);
            }
        }
    }

    

    public static void main(String[] args) {
        int nums[] = { 4, 5, 6, 7, 0, 1, 2 };
        int target = 0;
        int tarIdx = search(nums, target, 0, nums.length - 1);
        System.out.println(tarIdx);
    }
}
