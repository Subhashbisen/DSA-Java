
package arraypractise;

public class maxFrequency {

    public static int maxFrequency(int nums[]) {
        // int freaquency[] = new int[nums.length];
        int freaquency[] = new int[101];

        for (int i = 0; i < nums.length; i++) {
            freaquency[nums[i]]++;
        }

        int max = 0;
        int sum = 0;

        for (int i = 0; i < freaquency.length; i++) {
            if (freaquency[i] > max) {
                max = freaquency[i];
                sum = freaquency[i];
            } else if (freaquency[i] == max) {
                sum += freaquency[i];
            }
        }

        return sum;
    }

    public static void main(String[] args) {
        int nums[] = { 1, 2, 2, 3, 1, 4 };
        System.out.println(maxFrequency(nums));
    }
}