// * leetcode q no 977
public class SortedSquares {

    public static int[] sortedSquares(int[] nums) {

        int[] result = new int[nums.length];

        int left = 0;
        int right = nums.length - 1;
        int pos = nums.length - 1;

        while (left <= right) {

            int leftSquare = nums[left] * nums[left];
            int rightSquare = nums[right] * nums[right];

            if (rightSquare > leftSquare) {
                result[pos] = rightSquare;
                right--;
            } else {
                result[pos] = leftSquare;
                left++;
            }

            pos--;
        }

        return result; // ✅ return karna zaroori hai
    }

    public static void main(String[] args) {
        int nums[] = { -4, -1, 0, 3, 10 };
        // int square = nums[0] * nums[0];
        // System.out.println(square);
        sortedSquares(nums);
    }
}
