public class BuyAndSellSolution {
    public int maxProfit(int[] prices) {

        int lowerPrice = Integer.MAX_VALUE;
        int indiceLowerPrice = 0;
        int higherPriceAfterI = Integer.MIN_VALUE;
        int indiceHigherPrice = 0;

        for (int i = 0; i < prices.length - 1; i++) {

            if (prices[i] < lowerPrice) {
                lowerPrice = prices[i];
                indiceLowerPrice = i;
            }
        }

        for (int j = indiceLowerPrice; j < prices.length - 1; j++) {
            if (prices[j] > higherPriceAfterI) {
                higherPriceAfterI = prices[j];
                indiceHigherPrice = j;
            }
        }

        if (lowerPrice >= higherPriceAfterI) {
            return 0;
        } else {
            System.out.println(lowerPrice);
            System.out.println(higherPriceAfterI);
            return higherPriceAfterI - lowerPrice;
        }
    }
}
