package problems;

import java.util.*;

public class searchIn2DMatrix2 { 
    public static boolean searchMatrix(int matrix[][], int target) {
       int n = matrix.length;
        int m = matrix[0].length;

        // Starting at the bottom-left corner
        int row = n - 1;
        int col = 0;

        while (row >= 0 && col < m) {
            if (matrix[row][col] == target) {
                return true;
            } 
            // Current element is too big -> move UP to get smaller elements
            else if (matrix[row][col] > target) {
                row--;
            } 
            // Current element is too small -> move RIGHT to get bigger elements
            else {
                col++;
            }
        }

        return false;
    }

    public static void main(String[] args) {
        int matrix[][] = { { 1, 3, 5, 7 }, { 10, 11, 16, 20 }, { 23, 30, 34, 60 } };
        int target = 5;
        System.out.println(searchMatrix(matrix, target));
    }
}