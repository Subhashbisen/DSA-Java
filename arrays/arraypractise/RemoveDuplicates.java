package arraypractise;

public class RemoveDuplicates {

    public static void removeDublicate(int nums[]) {
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != nums[i + 1]) {
             
            }
        }
    }

    public static void print(int nums[]) {
        for (int i = 0; i < nums.length; i++) {
            System.out.println(nums[i]);
        }
    }

    public static void main(String[] args) {
        int nums[] = { 0, 0, 1, 1, 1, 2, 2, 3, 3, 4 };
        removeDublicate(nums);
        print(nums);
    }
}
