package problems;

public class KSmallMul {
    public static boolean helper(int m, int n, int mid, int k) {
        int count = 0;
        int row = m - 1;
        int col = 0;

        while (row >= 0 && col < n) {
            int value = (row + 1) * (col + 1);
            if (value <= mid) {
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

    public static int KSmallMul(int m, int n, int k) {
        int low = 1;
        int high = m * n;

        int ans = 0;

        while (low <= high) {
            int mid = low + (high - low) / 2;

            if (helper(m, n, mid, k)) {
                ans = mid;
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }

        return ans;
    }

    public static void main(String[] args) {
        int m = 2, n = 3, k = 6;
        System.out.println(KSmallMul(m, n, k));
    }
}
