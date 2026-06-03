
package patterns.twoPointer;

import java.util.*;

public class ThreeSum {

    public static void ThreeSum(int nums[]) {
        // sort the array
        Arrays.sort(nums);

        for (int i = 0; i < nums.length; i++) {

            if (nums[i] > 0) {
                break;
            }
            
            if (i == 0 || nums[i] != nums[i - 1]) {
                int left = i + 1;
                int right = nums.length - 1;

                while (left < right) {
                    int sum = nums[i] + nums[left] + nums[right];
                    if (sum > 0) {
                        right--;
                    } else if (sum < 0) {
                        left++;
                    } else {
                        System.out.print(nums[i] + " " + nums[left] + " " + nums[right]);
                        System.out.println();
                        left++;
                        right--;

                        while (left < right && nums[left] == nums[left - 1]) {
                            left++;
                        }

                        while (left < right && nums[right] == nums[right + 1]) {
                            right--;
                        }
                    }

                }
            }

        }
    }

    public static void main(String[] args) {
        int nums[] = { -1, 0, 1, 2, -1, -4 };
        ThreeSum(nums);
    }
}