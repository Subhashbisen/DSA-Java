package arraypractise;

public class ProductExceptSelf {

    // public static int[] productExceptSelf(int nums[]) {
    // int product[] = new int[nums.length];

    // int p = 1;

    // for (int i = 0; i < nums.length; i++) {

    // for (int j = i - 1; j >= 0; j--) {
    // p *= nums[j];
    // }

    // for (int k = i + 1; k < nums.length; k++) {
    // p *= nums[k];
    // }

    // product[i] = p;
    // p = 1;
    // }

    // return product;
    // }

    public static int[] productExceptSelf2(int nums[]) {
        int leftproduct[] = new int[nums.length];

        leftproduct[0] = 1;

        for (int i = 1; i < nums.length; i++) {
            leftproduct[i] = leftproduct[i - 1] * nums[i - 1];
        }
        ;

        int rightproduct[] = new int[nums.length];

        rightproduct[nums.length - 1] = 1;

        for (int i = nums.length - 2; i >= 0; i--) {
            rightproduct[i] = rightproduct[i + 1] * nums[i + 1];
        }

        int product[] = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            product[i] = leftproduct[i] * rightproduct[i];
        }
        return product;

    }



    public static void main(String[] args) {
        int nums[] = { 1, 2, 3, 4 };
        int result[] = productExceptSelf2(nums);
        for (int i = 0; i < result.length; i++) {
            System.out.print(result[i] + " ");
        }
    }
}
