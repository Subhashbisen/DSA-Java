
public class bubblesort {

    public static void bubblesort(int nums[]) {
        for (int i = 0; i < nums.length - 1; i++) {
            int swaps = 0;
            for (int j = 0; j < nums.length - 1 - i; j++) {
                if (nums[j] > nums[j + 1]) {
                    int temp = nums[j];
                    nums[j] = nums[j + 1];
                    nums[j + 1] = temp;
                    swaps++;
                }
            }
            if (swaps == 0) {
                break; // array already sorted
            }

        }
    }

    public static void printarray(int nums[]) {
        for (int i = 0; i < nums.length; i++) {
            System.out.println(nums[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int nums[] = { 1, 2, 3, 4 };
        bubblesort(nums);
        printarray(nums);

    }
}