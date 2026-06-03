package problems;

import java.util.*;

public class TwosortedArraysMedian {
    public static double findMedianSortedArrays(int[] nums1, int[] nums2) {

        // Always apply binary search on smaller array
        // to keep time complexity O(log(min(m,n)))
        if (nums1.length > nums2.length) {
            return findMedianSortedArrays(nums2, nums1);
        }

        int x = nums1.length;
        int y = nums2.length;

        // Binary search range on nums1 partitions
        int low = 0;
        int high = x;

        while (low <= high) {

            // Partition position in nums1
            int partitionX = (low + high) / 2;

            // Partition position in nums2
            // Total left half should contain
            // (x + y + 1) / 2 elements
            int partitionY = (x + y + 1) / 2 - partitionX;

            // Biggest element on left side of nums1
            // If no element exists, take -infinity
            int maxLeftX = (partitionX == 0)
                    ? Integer.MIN_VALUE
                    : nums1[partitionX - 1];

            // Smallest element on right side of nums1
            // If no element exists, take +infinity
            int minRightX = (partitionX == x)
                    ? Integer.MAX_VALUE
                    : nums1[partitionX];

            // Biggest element on left side of nums2
            int maxLeftY = (partitionY == 0)
                    ? Integer.MIN_VALUE
                    : nums2[partitionY - 1];

            // Smallest element on right side of nums2
            int minRightY = (partitionY == y)
                    ? Integer.MAX_VALUE
                    : nums2[partitionY];

            // Correct partition condition:
            // Left side elements must be <= right side elements
            if (maxLeftX <= minRightY &&
                    maxLeftY <= minRightX) {

                // If total number of elements is even
                if ((x + y) % 2 == 0) {

                    // Median = average of
                    // max left + min right
                    return (Math.max(maxLeftX, maxLeftY)
                            + Math.min(minRightX, minRightY)) / 2.0;
                }

                // If total number of elements is odd
                // Median = maximum element on left side
                return Math.max(maxLeftX, maxLeftY);
            }

            // We are too far on right side in nums1
            // Move partition left
            else if (maxLeftX > minRightY) {
                high = partitionX - 1;
            }

            // We are too far on left side in nums1
            // Move partition right
            else {
                low = partitionX + 1;
            }
        }
        
        return 0.0;
    }

    public static void main(String[] args) {
        int num1[] = { 1, 2 };
        int nums2[] = { 3, 4 };

        System.out.println(findMedianSortedArrays(num1, nums2));
    }
}