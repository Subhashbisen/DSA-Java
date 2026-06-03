package problems;

public class KokoEatingBananas {
    public static boolean helper(int piles[], int speed, int h) {
        long hours = 0;

        for (int i = 0; i < piles.length; i++) {
            hours += (piles[i] + speed - 1) / speed; // ceil division
        }

        return hours <= h;
    }

    public static int minEatingSpeed(int piles[], int h) {
        int left = 1;
        int right = 0;

        for (int i = 0; i < piles.length; i++) {
            right = Math.max(right, piles[i]);
        }

        int answer = right;

        while (left <= right) {
            int mid = left + (right - left) / 2;

            if (helper(piles, mid, h)) {
                answer = mid;
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        int piles[] = { 30, 11, 23, 4, 20 };
        int h = 6;
        System.out.println(minEatingSpeed(piles, h));
    }
}
