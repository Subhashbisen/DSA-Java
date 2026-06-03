package twoPointer;

public class UnsortedSubarray {
    public static int findUnsortedSubarray(int nums[]) {
        int start = 0;
        int end = 0;

        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;

        // left to right
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > max) {
                max = nums[i];
                start = i;
            } else {
                break;
            }
        }

        // right to left
        for (int i = nums.length - 1; i >= 0; i--) {
            if (nums[i] < min) {
                min = nums[i];
                end = i;
            } else {
                break;
            }
        }
        System.out.println(end + " " + start);
        return end - start + 1;
    }

    public static void main(String[] args) {
        int nums[] = { 2, 6, 4, 8, 10, 9, 15 };
        System.out.println(findUnsortedSubarray(nums));
    }
}
