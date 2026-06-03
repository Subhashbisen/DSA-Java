package patterns.twoPointer;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class lonelyNumber {

    public static List<Integer> getLonaly(int nums[]) {
        Arrays.sort(nums);

        List<Integer> list = new ArrayList<>();

        // ✅ handle single element case
        if (nums.length == 1) {
            list.add(nums[0]);
            return list;
        }
        
        for (int i = 0; i < nums.length; i++) {
            if (i == 0) {
                if (nums[i] != nums[i + 1]) {
                    if (nums[i + 1] != (nums[i] + 1)) {
                        list.add(nums[i]);
                    }
                }
            } else if (i == nums.length - 1) {
                if (nums[i] != nums[i - 1]) {
                    if (nums[i - 1] != (nums[i] - 1)) {
                        list.add(nums[i]);
                    }
                }
            } else {
                if (nums[i] != nums[i + 1] && nums[i] != nums[i - 1]) {
                    if (nums[i - 1] != (nums[i] - 1) && nums[i + 1] != (nums[i] + 1)) {
                        list.add(nums[i]);
                    }
                }
            }

        }

        return list;
    }

    public static void main(String[] args) {
        int nums[] = { 1, 3, 5, 3 };
        System.out.println(getLonaly(nums));
    }
}
