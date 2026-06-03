package problems;

import java.util.*;

public class findSubset2 {

    public static void getSubSet(int nums[], int index, ArrayList<Integer> list) {
        // *Base Case
        if (index == nums.length) {
            System.out.println(list);
            return;
        }

        // * work
        list.add(nums[index]);
        getSubSet(nums, index + 1, list);

        // *BacktrackStep
        list.remove(list.size() - 1);

        int idx = index + 1;
        while (idx < nums.length && nums[idx] == nums[idx - 1]) {
            idx++;
        }
        getSubSet(nums, idx, list);

    }

    public static void main(String[] args) {
        int nums[] = { 1, 2, 2 };
        Arrays.sort(nums);
        ArrayList<Integer> list = new ArrayList<>();
        getSubSet(nums, 0, list);
    }
}
