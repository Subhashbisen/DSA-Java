package problems;

import java.util.*;

public class combinationSum2 {
    public static void getCombination(int nums[], int indx, List<List<Integer>> list, List<Integer> templist,
            int remaining) {
        Arrays.sort(nums);

        if (remaining == 0) {
            list.add(new ArrayList<>(templist));
            return;
        }

        for (int i = indx; i < nums.length; i++) {
            if (i > indx && nums[i] == nums[i - 1]) {
                continue;
            }

            if (nums[indx] > remaining) {
                break;
            }

            templist.add(nums[i]);
            getCombination(nums, i + 1, list, templist, remaining - nums[i]);
            templist.remove(templist.size() - 1);
        }
    }

    public static void main(String[] args) {
        int nums[] = { 10, 1, 2, 7, 6, 1, 5 };
        int target = 8;
        List<List<Integer>> list = new ArrayList<>();
        List<Integer> templist = new ArrayList<>();
        getCombination(nums, 0, list, templist, target);
        System.out.println(list);
    }
}
