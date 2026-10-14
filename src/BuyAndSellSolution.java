public class BuyAndSellSolution {
    public int maxProfit(int[] prices) {

        int maxProfit = 0;
        int history = 0;
        // ta dando time limit exceeded

        for (int i = 0; i < prices.length; i++) {
            if (prices.length  < 2){
                return 0;
            }
            for (int j = i + 1; j < prices.length; j++) {
                history = prices[j] - prices[i];

                if (history >= maxProfit) {
                    maxProfit = history;
                }

            }

        }

        return maxProfit;
    }
}
