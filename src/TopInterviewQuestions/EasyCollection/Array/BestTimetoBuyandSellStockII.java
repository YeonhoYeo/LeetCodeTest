package TopInterviewQuestions.EasyCollection.Array;

public class BestTimetoBuyandSellStockII {
    public static void main(String[] args) {
        int[] prices = {7, 1, 5, 3, 6, 4};
        maxProfit(prices);
    }

    public static int maxProfit(int[] prices) {

        int maxProfit = 0;
        for (int i = 1; i < prices.length - 1; i++) {
            if (prices[i] > prices[i - 1]) {
                maxProfit += prices[i] - prices[i - 1];
            }
        }
        System.out.println("maxProfit = " + maxProfit);
        return maxProfit;
    }

}
