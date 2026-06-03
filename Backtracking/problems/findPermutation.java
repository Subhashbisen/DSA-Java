package problems;

import java.util.*;

public class findPermutation {

    public static void findPermutation(int nums[], ArrayList<Integer> list, int i, boolean used[]) {
        // Base Case
        if (i == nums.length) {
            System.out.println(list);
            return;
        }

        for (int j = 0; j < nums.length; j++) {

            if (used[j]) {
                continue;
            }

            used[j] = true;

            list.add(nums[j]);

            findPermutation(nums, list, i + 1, used);

            list.remove(list.size() - 1);
            used[j] = false;
        }
    }

    public static void main(String[] args) {
        int nums[] = { 1, 2, 3 };
        ArrayList<Integer> list = new ArrayList<>();

        findPermutation(nums, list, 0, new boolean[nums.length]);
    }
}
