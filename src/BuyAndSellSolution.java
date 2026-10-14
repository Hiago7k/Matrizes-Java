public class BuyAndSellSolution {
    public int maxProfit(int[] prices) {

        //7, 6, 4, 3, 1
        //1  2  3  4  5 dias
        int maxProfit = 0;
        int history = 0;
        int higher = 0;

        for (int i = 0; i < prices.length; i++){
            for (int j = i +1; j < prices.length; j++){
                history = prices[j] - prices[i];

                if (history >= maxProfit){
                    maxProfit = history;
                }

            }

        }

        return maxProfit;
    }
}
