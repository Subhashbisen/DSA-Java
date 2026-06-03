package arraypractise;

public class trappedwater {

    public static int trappedRainwater(int height[]) {
        int leftmaxBound[] = new int[height.length];
        leftmaxBound[0] = height[0];
        int trappedrainwater = 0;

        for (int i = 1; i < height.length; i++) {
            leftmaxBound[i] = Math.max(height[i], leftmaxBound[i - 1]);
        }

        int rightmaxBound[] = new int[height.length];
        rightmaxBound[height.length - 1] = height[height.length - 1];

        for (int i = rightmaxBound.length - 2; i >= 0; i--) {
            rightmaxBound[i] = Math.max(height[i], rightmaxBound[i + 1]);
        }
        ;

        for (int i = 0; i < height.length - 1; i++) {
            int waterlevel = Math.min(leftmaxBound[i], rightmaxBound[i]);
            trappedrainwater += (waterlevel - height[i]) * 1;
        }

        return trappedrainwater;

    }

    public static void main(String[] args) {
        int height[] = { 0, 1, 0, 2, 1, 0, 1, 3, 2, 1, 2, 1 };
        System.out.println(trappedRainwater(height));
    }
}
