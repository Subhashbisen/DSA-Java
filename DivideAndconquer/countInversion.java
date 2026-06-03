package DivideAndconquer;

public class countInversion {

    public static void printArray(int nums[]) {
        for (int i = 0; i < nums.length; i++) {
            System.out.print(nums[i] + " ");
        }

        System.out.println();
    };

    public static int mergeSort(int nums[], int start, int end) {
        int count = 0;
        // Base case
        if (start >= end) {
            return count;
        }

        // work
        int mid = start + (end - start) / 2;

        count += mergeSort(nums, start, mid);
        count += mergeSort(nums, mid + 1, end);

        count += merge(nums, start, mid, end);
        return count;
    }

    public static int merge(int nums[], int start, int mid, int end) {
        // System.out.println(start + "---" + mid + "---" + end);
        int temp[] = new int[end - start + 1];

        int count = 0;
        int i = start;
        int j = mid + 1;
        int k = 0;

        while (i <= mid && j <= end) {
            if (nums[i] < nums[j]) {
                temp[k] = nums[i];
                i++;
            } else {
                temp[k] = nums[j];
                count += (mid - i + 1);
                j++;
            }
            k++;
        }

        // * left part
        while (i <= mid) {
            temp[k] = nums[i];
            i++;
            k++;
        }

        // * right part
        while (j <= end) {
            temp[k] = nums[j];
            j++;
            k++;
        }

        int k2 = 0;
        int l = start;

        // * copy temp to original num array
        while (k2 < temp.length) {
            nums[l] = temp[k2];
            k2++;
            l++;
        }
        return count;
    }

    public static int inversionCount(int nums[]) {
        int count = 0;

        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] > nums[j]) {
                    count++;
                }
            }
        }

        return count;
    }

    public static void main(String[] args) {
        int nums[] = { 2, 4, 1, 3, 5 };
        printArray(nums);
        System.out.println(mergeSort(nums, 0, nums.length - 1));
        printArray(nums);
    }
}
