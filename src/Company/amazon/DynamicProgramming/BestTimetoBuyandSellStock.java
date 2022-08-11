package Company.amazon.DynamicProgramming;

public class BestTimetoBuyandSellStock {
    public static void main(String[] args) {
        int[] prices = {7,1,5,3,6,4};

        System.out.println(maxProfit(prices));
    }

    public static int maxProfit(int[] prices) {
        int minVal = Integer.MAX_VALUE;
        int sellPrice = 0;
        for (int i = 0; i < prices.length; i++) {
            minVal = Math.min(minVal, prices[i]);
            sellPrice = Math.max(sellPrice, prices[i] - minVal);
        }
        return sellPrice;
    }
}
