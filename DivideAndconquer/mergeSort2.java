package DivideAndconquer;

public class mergeSort2 {
    public static void merge(int nums[], int left, int mid, int right) {
        int temp[] = new int[right - left + 1];

        int i = left;
        int j = mid + 1;
        int k = 0;

        while (i <= mid && j <= right) {
            if (nums[i] > nums[j]) {
                temp[k] = nums[j];
                j++;
            } else {
                temp[k] = nums[i];
                i++;
            }
            k++;
        }

        while (i <= mid) {
            temp[k] = nums[i];
            i++;
            k++;
        }

        while (j <= right) {
            temp[k] = nums[i];
            j++;
            k++;
        }

        int k2 = 0;
        int l = left;

        while (k2 < temp.length) {
            nums[l] = temp[k2];
            k2++;
            l++;
        }
    }

    public static void mergeSort(int nums[], int left, int right) {
        // Base Case
        if (left >= right) {
            return;
        }

        // work
        int mid = left + (right - left) / 2;

        mergeSort(nums, left, mid);
        mergeSort(nums, mid + 1, right);

        merge(nums, left, mid, right);
    }

    public static void printArray(int nums[]) {
        for (int i = 0; i < nums.length; i++) {
            System.out.print(nums[i] + " ");
        }

        System.out.println();
    };

    public static void main(String[] args) {
        int nums[] = { 6, 3, 9, 5, 2, 8 };
        mergeSort(nums, 0, nums.length - 1);
        printArray(nums);
    }
}
