package arraypractise;

public class buysell {

    public static int buysell(int prices[]) {
        int maxProfit = 0;
        int buyPrice = Integer.MAX_VALUE;

        for (int i = 0; i < prices.length; i++) {
            if (prices[i] < buyPrice) {
                buyPrice = prices[i];
            }

            if (prices[i] > buyPrice) {
                int profit = prices[i] - buyPrice;
                maxProfit = Math.max(maxProfit, profit);
            }
            ;

        }

        return maxProfit;
    }

    public static void main(String[] args) {
        int prices[] = { 7, 6, 4,  3, 1 };
        System.out.println(buysell(prices));
        ;
    }
}