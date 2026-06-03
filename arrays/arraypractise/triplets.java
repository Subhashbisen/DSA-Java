package arraypractise;

import java.util.*;

public class triplets {

    public static List<List<Integer>> findTriplet(int nums[]) {
        List<List<Integer>> result = new ArrayList<>();

        Arrays.sort(nums);

        for (int i = 0; i < nums.length - 2; i++) {
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
                        result.add(Arrays.asList(nums[i], nums[left], nums[right]));
                        left++;
                        right--;

                        while (left < right && nums[left] == nums[left - 1]) {
                            left++;
                        }
                        ;

                        while (left < right && nums[right] == nums[right + 1]) {
                            right--;
                        }
                        ;
                    }
                }
            }
        }

        return result;
    }

    public static void main(String[] args) {
        int nums[] = { -1, 0, 1, 2, -1, -4 };
        System.out.println(findTriplet(nums));
    }

}