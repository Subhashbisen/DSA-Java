package problems;

import java.util.*;

public class largestAreaHistogram {
    public static int maxAreaHistogram(int heights[]) {
        int maxArea = 0;
        int nsr[] = new int[heights.length];
        int nsl[] = new int[heights.length];

        // * next smaller right
        Stack<Integer> s = new Stack<>();
        for (int i = heights.length - 1; i >= 0; i--) {

            while (!s.isEmpty() && heights[s.peek()] >= heights[i]) {
                s.pop();
            }

            if (s.isEmpty()) {
                nsr[i] = heights.length;
            } else {
                nsr[i] = s.peek();
            }

            s.push(i);
        }

        // * next smaller left
        s = new Stack<>();

        for (int i = 0; i < heights.length; i++) {

            while (!s.isEmpty() && heights[s.peek()] >= heights[i]) {
                s.pop();
            }

            if (s.isEmpty()) {
                nsl[i] = -1;
            } else {
                nsl[i] = s.peek();
            }

            s.push(i);
        }

        // *current Area : width = j-i-1 = nsr[i] - nsl[i] -1
        for (int i = 0; i < heights.length; i++) {
            int width = nsr[i] - nsl[i] - 1;
            // * area = heights * width
            int currArea = heights[i] * width;
            // System.out.println(currArea);
            maxArea = Math.max(currArea, maxArea);
        }

        return maxArea;
    }

    public static void main(String[] args) {
        int heights[] = { 2, 1, 5, 6, 2, 3 };
        System.out.println(maxAreaHistogram(heights));
    }
}
