package recursion;

public class keyIndex {
    public static void keyIndex(int nums[], int key, int n) {
        if (n > nums.length - 1) {
            return;
        }

        if (nums[n] == key) {
            System.out.print(n + " ");
        }

        keyIndex(nums, key, n + 1);
    }

    public static void main(String[] args) {
        int nums[] = { 3, 2, 4, 5, 6, 2, 7, 2, 2 };
        int key = 2;
        keyIndex(nums, key, 0);
    }
}
