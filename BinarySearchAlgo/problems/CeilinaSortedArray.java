package problems;

public class CeilinaSortedArray {
    static int findCeil(int[] arr, int x) {
        int low = 0;
        int high = arr.length - 1;

        int ans = -1;

        while (low <= high) {

            int mid = low + (high - low) / 2;

            // Possible ceil found
            if (arr[mid] >= x) {
                ans = arr[mid];
                high = mid - 1; // left side me aur chhota valid answer ho sakta hai
            } else {
                low = mid + 1;
            }
        }

        return ans;
    }

    public static void main(String[] args) {
        int arr[] = { 1, 2, 8, 10, 11, 12, 19 };
        int target = 5;
        System.out.println(findCeil(arr, target));
    }
}
