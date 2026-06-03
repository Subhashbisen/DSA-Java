package problems;

public class Numberofoccurrence {
    public static int findFirst(int nums[], int target) {
        int left = 0;
        int right = nums.length - 1;
        int ans = -1;

        while (left <= right) {
            int mid = left + (right - left) / 2;

            if (nums[mid] == target) {
                ans = mid;
                right = mid - 1;
            } else if (nums[mid] < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }

        }

        return ans;
    }

    public static int findLast(int nums[], int target) {
        int left = 0;
        int right = nums.length - 1;
        int ans = -1;

        while (left <= right) {
            int mid = left + (right - left) / 2;

            if (nums[mid] == target) {
                ans = mid;
                left = mid + 1;
            } else if (nums[mid] < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }

        }

        return ans;
    }

    // Count occurrences
    public static int countOccurrences(int[] arr, int x) {
        int first = findFirst(arr, x);
        int last = findLast(arr, x);

        return last - first + 1;
    }

    public static void main(String[] args) {
        int nums[] = { 1, 1, 2, 2, 2, 2, 3 };
        int target = 2;
        System.out.println(countOccurrences(nums, target));
    }
}
