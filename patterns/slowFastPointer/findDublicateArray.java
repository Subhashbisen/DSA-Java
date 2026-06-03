package patterns.slowFastPointer;

public class findDublicateArray {

    public static int findDuplicate(int nums[]) {
        int slow = nums[0];
        int fast = nums[0];

        while (true) {
            slow = nums[slow];
            fast = nums[fast];
            fast = nums[fast];

            if (slow == fast) {
                slow = nums[0];

                while (slow != fast) {
                    slow = nums[slow];
                    fast = nums[fast];
                }

                return slow;
            }
        }
    }

    public static void main(String[] args) {
        int nums[] = { 1, 3, 4, 2, 2 };
        System.out.println(findDuplicate(nums));
    }
}
