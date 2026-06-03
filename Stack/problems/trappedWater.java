package problems;

import java.util.*;

public class trappedWater {
    public static int trappedWater(int height[]) {
        Stack<Integer> s = new Stack<>();
        int water = 0;

        for (int i = 0; i < height.length; i++) {
            while (!s.isEmpty() && height[i] > height[s.peek()]) {
                int bottom = s.pop();

                if (s.isEmpty()) {
                    break;
                }

                int left = s.peek();

                int width = i - left - 1;
                int h = Math.min(height[i], height[left]) - height[bottom];

                water += width * h;
            }

            s.push(i);

        }

        return water;
    }

    public static void main(String[] args) {
        int height[] = { 4, 2, 0, 6, 3, 2, 5 };
        System.out.println(trappedWater(height));
    }
}
