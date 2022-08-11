package Company.amazon.DynamicProgramming;

import java.util.Arrays;

public class CoinChange {

    public static void main(String[] args) {

        int[] coins = {1,2,5};
        int amount = 11;
        System.out.println(coinChange(coins, amount));
    }

    public static int coinChange(int[] coins, int amount) {
        int[] checkVal = new int[amount + 1];
        Arrays.fill(checkVal, amount + 1);
        checkVal[0] = 0;

        for (int i = 1; i < amount + 1; i++) {
            for (int j = 0; j < coins.length; j++) {
                if (coins[j] <= i) {
                    checkVal[i] = Math.min(checkVal[i], checkVal[i - coins[j]] + 1);
                }
            }
        }

        return checkVal[amount] > amount ? -1 : checkVal[amount];
    }

}
