package DivideAndconquer;

public class quick {
    public static void printArray(int nums[]) {
        for (int i = 0; i < nums.length; i++) {
            System.out.print(nums[i] + " ");
        }

        System.out.println();
    };

    public static int partition(int nums[], int left, int right) {
        int pivote = nums[right];

        int i = left - 1;

        for (int j = left; j < right; j++) {
            if (nums[j] <= pivote) {
                i++;

                int temp = nums[j];
                nums[j] = nums[i];
                nums[i] = temp;
            }
        }

        i++;
        int temp = pivote;
        nums[right] = nums[i];
        nums[i] = temp;

        return i;
    }

    public static void quickSort(int nums[], int left, int right) {
        // Base case
        if (left >= right) {
            return;
        }

        int pivote = partition(nums, left, right);

        quickSort(nums, left, pivote - 1);
        quickSort(nums, pivote + 1, right);
    }

    public static void main(String[] args) {
        int nums[] = { 6, 3, 9, 5, 2, 8 };
        quickSort(nums, 0, nums.length - 1);
        printArray(nums);
    }
}
