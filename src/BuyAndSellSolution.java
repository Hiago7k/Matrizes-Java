public class BuyAndSellSolution {
    public int maxProfit(int[] prices) {
        int maxProfit = 0;
        int result = 0;

        for (int i = 0; i < prices.length; i++) {
            for (int j = 0; j < prices.length - 1; j++) {
                if (prices[i] >= prices[j + 1]) {
                    result = 0;
                } else {
                    result = prices[j +1] - prices[i];
                }

                if (result >= maxProfit) {
                    maxProfit = result;
                }
            }


        }

        return maxProfit;
    }
}
