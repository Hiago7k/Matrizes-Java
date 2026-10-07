public class BuyAndSellSolution {
    public int maxProfit(int[] prices) {


        // começa no primeiro elemento do array,
        // para garantir, que os numeros do array, não sejam
        // menores que o valor chumbado
        int lowerPrice = prices[0];
        int indiceLowerPrice = 0;
        int higherPriceAfterI = prices[0];
        int indiceHigherPrice = 0;
        // prices -1, por que se a ação tiver na última posição nao faz sentido
        // comprarmos
        for (int i = 0; i < prices.length - 1; i++) {
            if (prices[i] < lowerPrice) {
                // achamos o menor, preço possivel, agora precisamos
                // salvar o indice dessa compra
                // para começar a procurar a partir dela, a proxima venda
                lowerPrice = prices[i];
                indiceLowerPrice = i;
            }

            for (int j = indiceLowerPrice; j < prices.length; j++) {
                if (prices[j] > higherPriceAfterI) {
                    higherPriceAfterI = prices[j];
                    indiceLowerPrice = j;
                }
            }

        }
        // valida, se possui lucro se nao possui mata
        // fecha o home brooker
        // que por sinal BTG pactual > xp
        if (lowerPrice > higherPriceAfterI) {
            return 0;
        } else {
            // retorna o lucro obtido
            return higherPriceAfterI - lowerPrice;
        }

    }
}
