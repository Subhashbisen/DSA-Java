package problems;

public class MinDaysBouquets {
    public static boolean helper(int arr[], int day, int m, int k) {
        int flower = 0;
        int bouquets = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] <= day) {
                flower++;
            } else {
                flower = 0;
            }

            if (flower == k) {
                bouquets++;
                flower = 0;
            }
        }

        return bouquets >= m;
    }

    public static int minDays(int arr[], int m, int k) {
        if ((long) m * k > arr.length) {
            return -1;
        }

        int left = 1;
        int right = 0;
        int ans = -1;

        for (int i = 0; i < arr.length; i++) {
            right = Math.max(right, arr[i]);
        }

        while (left <= right) {
            int mid = left + (right - left) / 2;

            if (helper(arr, mid, m, k)) {
                ans = mid;
                right = mid - 1;
            } else {
                left = mid + 1;
            }

        }

        return ans;
    }

    public static void main(String[] args) {
        int arr[] = { 1, 10, 3, 10, 2 };
        int m = 3, k = 2;
        System.out.println(minDays(arr, m, k));
    }
}
