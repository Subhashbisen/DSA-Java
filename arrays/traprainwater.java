public class traprainwater {

    public static int trappedRainwater(int height[]) {
        // calculate leftMax Array

        int leftmax[] = new int[height.length];
        leftmax[0] = height[0];
        int trappedrainwater = 0;

        for (int i = 1; i < height.length; i++) {
            leftmax[i] = Math.max(height[i], leftmax[i - 1]);
        }
        ;

        // calculate rightMax Array
        int rightmax[] = new int[height.length];
        rightmax[height.length - 1] = height[height.length - 1];

        for (int i = height.length - 2; i >= 0; i--) {
            rightmax[i] = Math.max(height[i], rightmax[i + 1]);
        }

        // loop
        for (int i = 0; i <= rightmax.length - 1; i++) {

            // waterLevel = min(leftmax , rightmax)
            int waterlevel = Math.min(leftmax[i], rightmax[i]);

            // trappedWater = (waterLevel - barlevelHeight) * 1
            trappedrainwater += (waterlevel - height[i]) * 1;
        }

        return trappedrainwater;
    }

    public static void main(String[] args) {
        int height[] = { 4, 2, 0, 6, 3, 2, 5 };
        System.out.println(trappedRainwater(height));
    }
}
