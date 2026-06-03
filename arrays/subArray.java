public class subArray {
    public static void subArrays(int number[]) {
        int start = 0;
        int end = number.length - 1;
        int currSum = 0;
        int maxSum = Integer.MIN_VALUE;

        for (int i = start; i <= end; i++) {
            for (int j = i; j <= end; j++) {
                currSum = 0;
                for (int k = i; k <= j; k++) {
                    System.out.print(number[k] + " ");
                    currSum += number[k];

                }
                if (currSum > maxSum) {
                    maxSum = currSum;
                }
                System.out.println("Sum is: " + currSum);
            }
        }
        System.out.println("Max Sum is: " + maxSum);
    };

    public static void main(String[] args) {
        int number[] = { 2, 4, 6, 8, 10 };
        subArrays(number);
    }
}
