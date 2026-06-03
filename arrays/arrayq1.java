
public class arrayq1 {
    public static void arraynum(int nums[]) {
        int count = 0;
        for (int i = 0; i < nums.length; i++) {
            int num1 = nums[i];
            for (int j = 0; j <= nums.length; j++) {
                int num2 = nums[j];
                if (num1 == num2) {
                    count++;
                }

                if (count >= 2) {
                    System.out.println("true");
                    break;
                }
            }

        }
    };

    public static void main(String[] args) {
        int nums[] = { 1, 2, 3, 1 };
        arraynum(nums);
    }
}