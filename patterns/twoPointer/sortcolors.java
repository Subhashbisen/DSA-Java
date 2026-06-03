package patterns.twoPointer;

public class sortcolors {

    public static void sortcolors(int nums[]) {
        int i = 0;
        int j = nums.length - 1;
        int k = 0;

        while (k <= j) {
            if (nums[k] == 1) {
                k++;
            } else if (nums[k] == 2) {
                int temp = nums[k];
                nums[k] = nums[j];
                nums[j] = temp;
                j--;
            } else {
                int temp = nums[k];
                nums[k] = nums[i];
                nums[i] = temp;
                i++;
            }
        }
    }

    public static void main(String[] args) {
        int nums[] = { 1, 2, 0, 0, 1, 2, 2, 0, 1 };
        System.out.println("BEFORE");
        for (int i = 0; i < nums.length; i++) {
            System.out.println(nums[i]);
        }
        sortcolors(nums);
        System.out.println("after");
        for (int i = 0; i < nums.length; i++) {
            System.out.println(nums[i]);
        }

    }
}
