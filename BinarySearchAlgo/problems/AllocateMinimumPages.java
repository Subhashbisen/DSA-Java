package problems;

import java.util.*;

public class AllocateMinimumPages {
    public static boolean helper(int arr[], int mid, int k) {
        int students = 1;
        int remain = mid;

        for (int i = 0; i < arr.length; i++) {

            // agar ek book hi mid se badi hai, impossible
            if (arr[i] > mid)
                return false;

            if (remain >= arr[i]) {
                remain -= arr[i];
            } else {
                students++;
                remain = mid - arr[i];
            }
        }

        return students <= k;
    }

    public static int AllocateMinimumPages(int arr[], int k) {

        if (k > arr.length) {
            return -1;
        }

        int left = 0;
        int right = 0;

        for (int i = 0; i < arr.length; i++) {
            left = Math.max(left, arr[i]); // FIX 1: max element
            right += arr[i];
        }

        int ans = -1;

        while (left <= right) {
            int mid = left + (right - left) / 2;

            if (helper(arr, mid, k)) {
                ans = mid;
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }

        return ans;
    }

    public static void main(String[] args) {
        int arr[] = { 10, 20, 30, 40, 50 };
        int k = 3;
        System.out.println(AllocateMinimumPages(arr, k));
    }
}