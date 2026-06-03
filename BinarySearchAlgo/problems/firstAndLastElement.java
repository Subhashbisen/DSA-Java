package problems;

import java.util.*;

public class firstAndLastElement {
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

    public static void main(String[] args) {
        int nums[] = { 5, 7, 7, 8, 8, 10 };
        int target = 8;
        ArrayList<Integer> list = new ArrayList<>();
        int first = findFirst(nums, target);
        int last = findLast(nums, target);
        list.add(first);
        list.add(last);
        System.out.println(list);
    }

};