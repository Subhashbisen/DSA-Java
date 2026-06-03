package problems;

import java.util.*;

public class findSubset {

    public static void findSubset(int nums[], int i, ArrayList<Integer> list) {
    // base case
    if (i == nums.length) {
    // System.out.println("printing");
    System.out.println(list);
    return;
    }

    // work
    // no
    // System.out.println("no calling"+ i);
    findSubset(nums, i + 1, list);
    // yes
    // System.out.println("adding value"+ i);
    list.add(nums[i]);

    // System.out.println("yes calling" + i);
    findSubset(nums, i + 1, list);

    // backtracking
    // System.out.println("removing list" + list);
    list.remove(list.size() - 1);
    }

    public static void main(String[] args) {
        int nums[] = { 1, 2, 3 };

        ArrayList<Integer> list = new ArrayList<>();
        findSubset(nums, 0, list);
    }
}