public class maxsubArray {
    public static void kadaneAlgorithm(int number[]) {
        int currentSum = 0;
        int maxSum = Integer.MIN_VALUE;

        for (int i = 0; i <= number.length - 1; i++) {
            currentSum = currentSum + number[i];

            maxSum = Math.max(maxSum, currentSum);

            if (currentSum < 0) {
                currentSum = 0;
            }
            ;
        }

        System.out.println("The maximum sum of the subarray is: " + maxSum);
    };

    public static void main(String[] args) {
        int number[] = { -2, -3, 4, -1, -2, 1, 5, -3 };
        kadaneAlgorithm(number);
    }
}