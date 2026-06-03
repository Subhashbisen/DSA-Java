package DivideAndconquer;

public class quickSort {
    public static void printArray(int nums[]) {
        for (int i = 0; i < nums.length; i++) {
            System.out.print(nums[i] + " ");
        }

        System.out.println();
    };

    public static void quickSort(int nums[], int start, int end) {
        if (start >= end) {
            return;
        }
        ;

        int pivotIndex = partition(nums, start, end);

        quickSort(nums, start, pivotIndex - 1);
        quickSort(nums, pivotIndex + 1, end);
    }

    public static int partition(int nums[], int start, int end) {
        int pivot = nums[end];

        int i = start - 1;

        for (int j = start; j < end; j++) {
            if (nums[j] <= pivot) {
                i++;
                int temp = nums[j];
                nums[j] = nums[i];
                nums[i] = temp;
            }
        }

        i++;
        int temp = pivot;
        nums[end] = nums[i];
        nums[i] = temp;

        return i;

    }

    public static void main(String[] args) {
        int nums[] = { 6, 3, 9, 8, 5, 2 };
        quickSort(nums, 0, nums.length - 1);
        printArray(nums);
    }
}
