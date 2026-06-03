package problems;

// import java.*;
import java.util.ArrayList;
import java.util.List;

public class combinationSum {

    public static void getCombination(int nums[], int indx, List<List<Integer>> list, List<Integer> templist,
            int remaining) {
        // * Base Case
        if (remaining == 0) {
            list.add(new ArrayList<>(templist));
            return;
        }

        if (remaining < 0) {
            return;
        }

        // work

        for (int i = indx; i < nums.length; i++) {
            templist.add(nums[i]);
            getCombination(nums, i, list, templist, remaining - nums[i]);
            templist.remove(templist.size() - 1);
        }
    }

    public static void main(String[] args) {
        int nums[] = {2,3,5 };
        int target = 8;
        List<List<Integer>> list = new ArrayList<>();
        List<Integer> templist = new ArrayList<>();
        getCombination(nums, 0, list, templist, target);
        System.out.println(list);
    }
}
