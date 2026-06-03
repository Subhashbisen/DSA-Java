package twoPointer;

public class trappedWater {
    public static int trappedWater(int height[]) {
        int trappedWater = 0;

        int leftMax = 0;
        int rightMax = 0;

        int left = 0;
        int right = height.length - 1;

        while (left < right) {
            if (height[left] < height[right]) {
                if (height[left] >= leftMax) {
                    leftMax = height[left];
                } else {
                    trappedWater += leftMax - height[left] * 1;
                }
                left++;
            } else {
                if (height[right] >= rightMax) {
                    rightMax = height[right];
                } else {
                    trappedWater += rightMax - height[right] * 1;
                }
                right--;
            }
        }

        return trappedWater;
    }

    // public static int trap(int[] height) {
    // int leftmaxBound[] = new int[height.length];
    // leftmaxBound[0] = height[0];
    // int trappedrainwater = 0;

    // for (int i = 1; i < height.length; i++) {
    // leftmaxBound[i] = Math.max(height[i], leftmaxBound[i - 1]);
    // }

    // int rightmaxBound[] = new int[height.length];
    // rightmaxBound[height.length - 1] = height[height.length - 1];

    // for (int i = rightmaxBound.length - 2; i >= 0; i--) {
    // rightmaxBound[i] = Math.max(height[i], rightmaxBound[i + 1]);
    // }
    // ;

    // for (int i = 0; i < height.length - 1; i++) {
    // int waterlevel = Math.min(leftmaxBound[i], rightmaxBound[i]);
    // trappedrainwater += (waterlevel - height[i]) * 1;
    // }

    // return trappedrainwater;
    // }

    public static void main(String[] args) {
        int height[] = { 4, 2, 0, 3, 2, 5 };
        System.out.println(trappedWater(height));
    }
}