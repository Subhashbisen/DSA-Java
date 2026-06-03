
public class selectionsort {

    public static void selectionsort(int nums[]) {
        for (int i = 0; i < nums.length - 1; i++) {
            int minIndex = i;

            for (int j = i + 1; j < nums.length; j++) {
                if (nums[j] < nums[minIndex]) {
                    minIndex = j;
                }
            }
            ;

            int temp = nums[minIndex];
            nums[minIndex] = nums[i];
            nums[i] = temp;

        }
    }

    public static void printarray(int nums[]) {
        for (int i = 0; i < nums.length; i++) {
            System.out.println(nums[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int nums[] = { 64, 25, 12, 22, 11 };
        selectionsort(nums);
        printarray(nums);
    }
}