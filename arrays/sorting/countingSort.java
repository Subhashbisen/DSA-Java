
public class countingSort {

    public static void countingSort(int nums[]) {
        int largest = Integer.MIN_VALUE;

        for (int i = 0; i < nums.length; i++) {
            largest = Math.max(largest, nums[i]);
        }
        ;

        int count[] = new int[largest + 1];

        for (int i = 0; i < nums.length; i++) {
            count[nums[i]]++;
        }

        for (int i = 0; i < count.length; i++) {
            while (count[i] > 0) {
                
            }
        }
    }

    // public static void printarray(int nums[]) {
    // for (int i = 0; i < nums.length; i++) {
    // System.out.println(nums[i] + " ");
    // }
    // System.out.println();
    // }

    public static void main(String[] args) {
        int nums[] = { 4, 2, 2, 8, 3, 3, 1 };
        countingSort(nums);
        // printarray(nums);
    }
}