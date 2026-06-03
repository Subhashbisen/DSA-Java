package problems;

import java.util.*;

public class searchIn2DMatrix { 
    public static boolean searchMatrix(int matrix[][], int target) {
        int rows = matrix.length;
        int cols = matrix[0].length;

        int low = 0;
        int high = rows - 1;

        // Binary Search on rows
        while (low <= high) {
            int mid = low + (high - low) / 2;

            // Check if target lies in this row range
            if (matrix[mid][0] <= target && matrix[mid][cols - 1] >= target) {
                // Binary Search inside the row
                int left = mid;
                int right = cols - 1;

                while (left <= right) {
                    int m = left + (right - left) / 2;

                    if (matrix[mid][m] == target) {
                        return true;
                    } else if (matrix[mid][m] < target) {
                        left = m + 1;
                    } else {
                        right = m - 1;
                    }
                }
                return false;
            }
            // Target is smaller -> go upward
            else if (target < matrix[mid][0]) {
                high = mid - 1;
            } else { // Target is larger -> go downward
                low = mid + 1;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int matrix[][] = { { 1, 3, 5, 7 }, { 10, 11, 16, 20 }, { 23, 30, 34, 60 } };
        int target = 3;
        System.out.println(searchMatrix(matrix, target));
    }
}