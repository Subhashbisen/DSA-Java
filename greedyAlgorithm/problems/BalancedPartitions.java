package greedyAlgorithm.problems;

public class BalancedPartitions {
    public static int BalancedPartition(String str) {
        if (str.length() == 0) {
            return 0;
        }

        int ans = 0;

        int L = 0, R = 0;

        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == 'L') {
                L++;
            } else if (str.charAt(i) == 'R') {
                R++;
            }

            if (L == R) {
                ans++;
            }
        }

        return ans;
    }

    public static void main(String[] args) {
        String str = "RLRRLLRLRL";
        System.out.println(BalancedPartition(str));
    }
}
