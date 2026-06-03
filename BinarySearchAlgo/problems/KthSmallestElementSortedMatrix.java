package problems;

public class KthSmallestElementSortedMatrix {
    public static boolean helper(int matrix[][], int target, int k) {
        int n = matrix.length;
        int row = n - 1;
        int col = 0;
        int count = 0;

        while (row >= 0 && col < n) {
            if (matrix[row][col] <= target) {
                count += row + 1;
                col++;
            } else {
                row--;
            }
        }

        if (count < k) {
            return false;
        }

        return true;

    }

    public static int kthSmallest(int[][] matrix, int k) {
        int n = matrix.length;

        int low = matrix[0][0];
        int high = matrix[n - 1][n - 1];

        int ans = 0;

        while (low <= high) {
            int mid = low + (high - low) / 2;

            if (helper(matrix, mid, k)) {
                ans = mid;
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }

        return ans;
    }

    public static void main(String[] args) {
        int matrix[][] = { { 1, 5, 9 }, { 10, 11, 13 }, { 12, 13, 15 } };
        int k = 8;
        System.out.println(kthSmallest(matrix, k));
    }
}
