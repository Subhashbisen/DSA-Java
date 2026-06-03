package queues.problems;

import java.util.*;

public class KsizeSubarrayMaximum {
    // public static ArrayList KsizeSubarrayMaximum(int nums[], int k) {
    // ArrayList<Integer> result = new ArrayList<>();

    // for (int i = 0; i < nums.length - k + 1; i++) {
    // int max = nums[i];
    // for (int j = i; j <= (i + k - 1); j++) {
    // max = Math.max(max, nums[j]);
    // }
    // result.add(max);
    // }

    // return result;

    // }
    public static ArrayList KsizeSubarrayMaximum(int nums[], int k) {
        ArrayList<Integer> result = new ArrayList<>();

        Deque<Integer> dq = new LinkedList<>();
        for (int i = 0; i < k; i++) {
            // * deque me jitne chote element hai usko deque ke back se remove karna hai
            // * tabh tak num[i] se chote ya equal hai
            while (!dq.isEmpty() && nums[dq.peekLast()] <= nums[i]) {
                dq.removeLast();
            }

            dq.addLast(i);
        }

        for (int i = k; i < nums.length; i++) {
            // * Store Answer
            result.add(nums[dq.peekFirst()]);

            // * remove element from dequeue who not part of curr window
            while (!dq.isEmpty() && dq.peekFirst() <= i - k) {
                dq.removeFirst();
            }

            // * deque me jitne chote element hai usko deque ke back se remove karna hai
            // * tabh tak num[i] se chote ya equal hai
            while (!dq.isEmpty() && nums[dq.peekLast()] <= nums[i]) {
                dq.removeLast();
            }

            dq.addLast(i);
        }

        result.add(dq.peekFirst());

        return result;
    }

    public static void main(String[] args) {
        int nums[] = { 1, 3, -1, -3, 5, 3, 6, 7 };
        int k = 3;

        System.out.println(KsizeSubarrayMaximum(nums, k));
    }
}
