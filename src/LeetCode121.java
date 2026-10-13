public class LeetCode121 {
    static void main() {
        BuyAndSellSolution by = new BuyAndSellSolution();
        System.out.println(by.maxProfit(new int[]{3,2,6,5,0,3}));

        // saida 3 esperado 4
        // se ele comprar no 2 e vender no 6, ele lucra 4
        // por tanto comprar no 0 e vender no 3, nao funciona
    }
}
