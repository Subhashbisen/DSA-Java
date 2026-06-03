package arraypractise;

public class RemoveDupSorted {

    public static void RemoveDupSorted(int nums[]) {
        // if (nums.length == 0)
        // return 0;

        int i = 0; // slow pointer

        for (int j = 1; j < nums.length; j++) { // fast pointer
            if (nums[j] != nums[i]) {
                i++;
                nums[i] = nums[j];
            }
        }

        // return i + 1; // unique count
    }

    public static void main(String[] args) {
        int nums[] = { 1, 1, 2 };
        // System.out.println(RemoveDupSorted(nums));
        RemoveDupSorted(nums);
    }
}
