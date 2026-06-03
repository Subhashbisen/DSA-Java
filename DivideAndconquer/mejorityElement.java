package DivideAndconquer;

public class mejorityElement {
    public static int mejorityElement(int nums[]) {
        int n = nums.length;

        for (int i = 0; i < nums.length; i++) {
            int count = 0;
            for (int j = 0; j < nums.length; j++) {
                if (nums[i] == nums[j]) {
                    count++;
                }
            }

            if (count > n / 2) {
                return nums[i];
            }
        }

        return -1;
    }

    public static void main(String[] args) {
        int nums[] = { 5, 5, 5, 5, 1, 2, 3 };
        System.out.println(mejorityElement(nums));
    }
}
