public class BuyAndSellSolution {
    public int maxProfit(int[] prices) {
        int maxProfit = 0;
        int result = 0;

        //  int indiceLowerPrice = 0;
        for (int k = 0; k < prices.length; k++) {

            for (int i = 0; i < prices.length - 1; i++) {

                if (prices[i] == 0 || prices[i + 1] == 0) {
                    continue;
                }

                if (prices[i] >= prices[i + 1]) {
                    result = prices[i] - prices[i + 1];
                } else {
                    result = prices[i + 1] - prices[i];
                }

                if (result >= maxProfit) {
                    maxProfit = result;

                    if (maxProfit == 0) {
                        return 0;
                    }
                }
            }


        }
        return maxProfit;
    }
}
