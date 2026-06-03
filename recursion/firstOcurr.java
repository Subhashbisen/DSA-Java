package recursion;

public class firstOcurr {

    public static int firstOcurr(int nums[], int target, int i) {
        if (i == nums.length) {
            return -1;
        }

        if (nums[i] == target) {
            return i;
        }

        return firstOcurr(nums, target, i + 1);
    }

    public static void main(String[] args) {
        int nums[] = { 8, 3, 6, 9, 5, 10, 2, 5, 3 };
        int target = 5;
        System.out.println(firstOcurr(nums, target, 0));
    }
}
