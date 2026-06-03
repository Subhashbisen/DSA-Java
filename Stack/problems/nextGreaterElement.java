package problems;

import java.util.*;

public class nextGreaterElement {
    public static void nextGreaterElement(int arr[], int result[]) {
        Stack<Integer> s = new Stack<>();

        for (int i = arr.length - 1; i >= 0; i--) {
            while (!s.isEmpty() && s.peek() <= arr[i]) {
                s.pop();
            }

            if (s.isEmpty()) {
                result[i] = -1;
            } else {
                result[i] = s.peek();
            }

            s.push(arr[i]);
        }
    }

    public static void main(String[] args) {
        int arr[] = { 1, 3, 2, 4 };
        int result[] = new int[arr.length];

        nextGreaterElement(arr, result);

        for (int i = 0; i < result.length; i++) {
            System.out.print(result[i] + " ");
        }
    }
}
